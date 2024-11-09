/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GestorEmpleados gestorEmpleados = new GestorEmpleados();
            int opcion;
            do {
                System.out.println("Sistema de Gestion de Empleados");
                System.out.println("1. Agregar empleado");
                System.out.println("2. Mostrar empleados");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                opcion = scanner.nextInt();
                scanner.nextLine();  
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingresa el nombre del empleado: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingresa la edad del empleado: ");
                        int edad = scanner.nextInt();
                        System.out.print("Ingresa el salario del empleado: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        
                        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario);
                        gestorEmpleados.agregarEmpleado(nuevoEmpleado);
                    }
                        
                    case 2 -> 
                        gestorEmpleados.mostrarEmpleados();
                        
                    case 3 -> System.out.println("Saliendo del sistema...");
                        
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } while (opcion != 3);
            
        }
    }
}