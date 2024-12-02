/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoliorfismo2;

/**
 *
 * @author froop
 */

 public class Calculadora {

    // Método para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar dois doubles
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para somar um array de inteiros
    public int somar(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    // Método para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar três doubles
    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    // Método para somar um array de doubles
    public double somar(double[] numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    // Método para somar dois inteiros e um double
    public double somar(int a, int b, double c) {
        return a + b + c;
    }
}

