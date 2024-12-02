/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoliorfismo2;

/**
 *
 * @author froop
 */
public class Main {
    
    public static void main(String[] args) {
        
             Calculadora calc = new Calculadora();

        // Usando diferentes métodos de soma
        System.out.println("Soma de dois inteiros: " + calc.somar(2, 3));
        System.out.println("Soma de dois doubles: " + calc.somar(2.5, 3.5));
        System.out.println("Soma de um array de inteiros: " + calc.somar(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Soma de três inteiros: " + calc.somar(1, 2, 3));
        System.out.println("Soma de três doubles: " + calc.somar(1.1, 2.2, 3.3));
        System.out.println("Soma de um array de doubles: " + calc.somar(new double[]{1.1, 2.2, 3.3}));
        System.out.println("Soma de dois inteiros e um double: " + calc.somar(1, 2, 3.5));
    }
        
    }

