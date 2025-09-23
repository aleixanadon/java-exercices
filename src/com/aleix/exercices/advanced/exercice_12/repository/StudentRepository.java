package com.aleix.exercices.advanced.exercice_12.repository;

import com.aleix.exercices.advanced.exercice_12.model.Student;

import java.util.ArrayList;

public class StudentRepository {

    ArrayList<Student> students = new ArrayList<Student>();

    public void createStudent(String name, int age, double mark){
        students.add(
            new Student(students.size(), name, age, mark)
        );
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void updateStudent(int id, String name, int age, double mark){
        Student studentToUpdate = students.get(id);
        studentToUpdate.name = name;
        studentToUpdate.age = age;
        studentToUpdate.mark = mark;
    }

    public void deleteStudent(int id){
        students.remove(id);
    }

    public Student getStudent(int id){
        return students.get(id);
    }


}
