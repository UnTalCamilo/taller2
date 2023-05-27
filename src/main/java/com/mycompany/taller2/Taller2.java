/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class Taller2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //  apuntadores
        ArithOp.ArithmeticOp pointer1 = ArithOp::add;
        ArithOp.ArithmeticOp pointer2 = ArithOp::exp;
        ArithOp.ArithmeticOp pointer3 = ArithOp::square;

        System.out.println(pointer1.operation(5, 2));
        System.out.println(pointer2.operation(5, 3));
        System.out.println(pointer3.operation(5, 2));

        //calculatorPointer();
        calculatorLamda();
    }

    public static void calculatorPointer() {
        System.out.println("**--**--**--** Calculadora con apuntadores **--**--**--**");
        System.out.println("1.Suma\n2.Potencia\n3.Salir\n");
        int op = sc.nextInt();
        while (op >= 0 && op < 3) {
            System.out.println("Ingrese número 1:");
            double n1 = sc.nextDouble();
            System.out.println("Ingrese número 2:");
            double n2 = sc.nextDouble();
            ArithOp.ArithmeticOp pointer = switch (op) {
                case 1 ->
                    ArithOp::add;
                case 2 ->
                    ArithOp::exp;
                default ->
                    ArithOp::add;
            };
            double res = pointer.operation(n1, n2);
            System.out.println(res);
            System.out.println("\n\n**--**--**--** Calculadora con apuntadores **--**--**--**");
            System.out.println("1.Suma\n2.Potencia\n3.Salir\n");
            op = sc.nextInt();
        };
    }
    
    public static void calculatorLamda(){
        System.out.println("**--**--**--** Calculadora con apuntadores **--**--**--**");
        System.out.println("1.Suma\n2.Potencia\n3.Salir\n");
        int op = sc.nextInt();
        while (op >= 0 && op < 3) {
            System.out.println("Ingrese número 1:");
            double n1 = sc.nextDouble();
            System.out.println("Ingrese número 2:");
            double n2 = sc.nextDouble();
            ArithOp.ArithmeticOp2 lamda = switch (op) {
                case 1 ->
                    (double a, double b) -> (a + b);
                case 2 ->
                    (double a, double b) -> (Math.pow(a, b));
                default ->
                    (double a, double b) -> (a + b);
            };
            double res = lamda.lamda(n1, n2);
            System.out.println(res);
            System.out.println("\n\n**--**--**--** Calculadora con apuntadores **--**--**--**");
            System.out.println("1.Suma\n2.Potencia\n3.Salir\n");
            op = sc.nextInt();
        };
    }
}
