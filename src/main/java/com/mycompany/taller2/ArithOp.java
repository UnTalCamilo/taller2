/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller2;

/**
 *
 * @author Camilo
 */
public class ArithOp {

    public static interface ArithmeticOp {
        double operation(double a, double b);
    }
    
    public static interface ArithmeticOp2 {
        double lamda(double a, double b);
    }

    public static double add(double a, double b) {
        System.out.println("Suma");
        return a + b;
    }

    public static double exp(double a, double b) {
        System.out.println("Potencia");
        return Math.pow(a, b);
    }

    public static double square(double a, double b) {
        System.out.println("Cuadrado");
        return Math.pow(a, 2);
    }
}
