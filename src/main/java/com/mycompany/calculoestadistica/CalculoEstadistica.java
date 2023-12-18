/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoestadistica;

import java.util.Scanner;
public class CalculoEstadistica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuál es el nombre del curso al cual se hará la estadística? ");
        String nomCurso = scanner.next();

        Curso estadistica = new Curso(nomCurso);

        System.out.print("Cuántos estudiantes se registrarán? ");
        int cantidadEstudiantes = scanner.nextInt();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            // Ingreso de la info
            System.out.println("Estudiante N° " + (i + 1) + " :");
            System.out.print("Cuál es el nombre del estudiante? : ");
            String nomEstudiante = scanner.next();
            System.out.print("En qué semestre está el estudiante? : ");
            int semestre = scanner.nextInt();
            System.out.print("Cuál es su nota final?: ");
            double nota = scanner.nextDouble();

            // Crear instancia de Estudiante y agregar al curso
            Estudiante estudiante = new Estudiante(nota, semestre);
            estadistica.agregarEstudiante(estudiante);
        }

        // Imprimir el promedio y la moda
        System.out.println("Promedio del curso: " + estadistica.cursoProm());
        System.out.println("Moda de los semestres: " + estadistica.modaSemestre());

        scanner.close();
    }
}