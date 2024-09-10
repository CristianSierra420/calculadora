package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         double numero1, numero2, resultado = 0.0;
        char operacion;
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();
        
        System.out.print("Ingrese la operación (+, -, *, /, %): ");
        operacion = scanner.next().charAt(0);
        
        
        if (operacion == '+') {
            resultado = numero1 + numero2;
        } else if (operacion == '-') {
            resultado = numero1 - numero2;
        } else if (operacion == '*') {
            resultado = numero1 * numero2;
        } else if (operacion == '/') {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Error: División por cero.");
                return;
            }
        } else if (operacion == '%') {
            resultado = numero1 % numero2;
        } else {
            System.out.println("Operación no válida.");
            return;
        }
        
        
        System.out.println("Resultado: " + resultado);
        

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor que el primero.");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
       
        if ((int)resultado % 2 == 0) {
            System.out.println("El resultado es par.");
        } else {
            System.out.println("El resultado es impar.");
        }
        
        
        int resultadoEntero = (int) resultado;
        System.out.println("Resultado entero: " + resultadoEntero);
        
       
        if (numero1 > 0 && numero2 > 0 && numero1 > 10 && numero2 > 10) {
            System.out.println("Ambos números son positivos y mayores que 10.");
        } else if (numero1 < 0 || numero2 < 0 || numero1 == 0 || numero2 == 0) {
            System.out.println("Al menos uno de los números es negativo o igual a cero.");
        } else {
            System.out.println("Las condiciones lógicas no se cumplen.");
        }
        
       
        scanner.close();
    }
}