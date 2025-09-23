package com.aleix.exercices.advanced.exercice_12.controller;

import com.aleix.exercices.advanced.exercice_12.model.Student;
import com.aleix.exercices.advanced.exercice_12.repository.StudentRepository;

import java.util.ArrayList;

public class StudentController {
    StudentRepository studentRepository = new StudentRepository();

    public void createStudent(String name, int age, double mark){
        studentRepository.createStudent(name,age,mark);
    }

    public ArrayList<Student> getStudents(){
        return studentRepository.getStudents();
    }

    public void updateStudent(int id, String name, int age, double mark){
        studentRepository.updateStudent(id,name,age,mark);
    }

    public void deleteStudent(int id){
        studentRepository.deleteStudent(id);
    }
}
