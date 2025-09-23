package com.aleix.exercices.advanced.exercice_12.view;

import com.aleix.exercices.advanced.exercice_12.controller.StudentController;
import com.aleix.exercices.advanced.exercice_12.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private final StudentController studentController;

    public View(StudentController studentController){
        this.studentController = studentController;
    }

    Scanner sc = new Scanner(System.in);

    public void showMenu(){
        System.out.print(
            "(0) exit\n"+
            "(1) create student\n" +
            "(2) read students\n" +
            "(3) update student\n" +
            "(4) delete student\n" +
            "select an option > "
        );
    }

    public int selectOption(){
        return sc.nextInt();
    }

    public void createStudent(){
        System.out.print("enter student name > ");
        String name = sc.next();

        System.out.print("enter student age > ");
        int age = sc.nextInt();

        System.out.print("enter student mark > ");
        double mark = sc.nextDouble();

        studentController.createStudent(name,age,mark);

        System.out.println("student created");
    }

    public void showStudents(){
        ArrayList<Student> students = studentController.getStudents();
        if (students.isEmpty()){
            System.out.println("no students found");
        } else {
            System.out.println(
                "--- students list ---\n{id} - {name} - {age} - {mark}");
            double avgMark = 0;
            for (Student student : students){
                System.out.println("{" + student.id + "} - " + student.name + " - " + student.age + " - " + student.mark);
                avgMark += student.mark;
            }
            avgMark = avgMark / students.size();
            System.out.println("average mark = " + avgMark);
        }
    }

    public void updateStudent(){
        System.out.print("enter student id > ");
        int id = sc.nextInt();
        ArrayList<Student> students = studentController.getStudents();
        if (students.isEmpty() || students.get(id) == null){
            System.out.println("student not found");
        } else {
            System.out.print("update name > ");
            String name = sc.next();
            System.out.print("update age > ");
            int age = sc.nextInt();
            System.out.print("update mark > ");
            double mark = sc.nextDouble();
            studentController.updateStudent(id,name,age,mark);
            System.out.println("student updated");
        }
    }

    public void deleteStudent(){
        System.out.print("enter student id > ");
        int id = sc.nextInt();
        ArrayList<Student> students = studentController.getStudents();
        if (students.isEmpty() || students.get(id) == null){
            System.out.println("student not found");
        } else {
            studentController.deleteStudent(id);
            System.out.println("student deleted");
        }
    }
}
