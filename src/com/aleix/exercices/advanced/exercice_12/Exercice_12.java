package com.aleix.exercices.advanced.exercice_12;

import com.aleix.exercices.advanced.exercice_12.controller.StudentController;
import com.aleix.exercices.advanced.exercice_12.view.View;

import java.util.Scanner;

/**
 * Sistema de gestión de alumnos (POO)
 * Clase Alumno con atributos nombre, edad, nota.
 * Métodos para obtener/mostrar datos.
 * Programa principal que maneje un ArrayList<Alumno> y muestre el promedio de notas.
 */

public class Exercice_12 {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        View  view = new View(studentController);

        //app loop
        boolean on = true;
        while (on) {
            view.showMenu();
            int option = view.selectOption();
            switch (option) {
                case 0:
                    on = false;
                    break;
                case 1:
                    view.createStudent();
                    break;
                case 2:
                    view.showStudents();
                    break;
                case 3:
                    view.updateStudent();
                    break;
                case 4:
                    view.deleteStudent();
                    break;
            }
        }
    }
}
