package SistemaBanco2;


import SistemaBanco2.Poupanca;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author froop
 */
public class Principal {
   
    public static void main(String[] args) {
        
        
     Cliente cliente1 = new Cliente("Gustavo Mazur", LocalDate.of(2006, 03, 24));
     Conta conta = new Conta(cliente1, 12, 130000);
     conta.sacar(2300);
     conta.depositar(1000);
     conta.exibirSaldo();
      
     System.out.println("\n");
     Poupanca poupanca = new Poupanca(cliente1, 12, 130000, 4);
     poupanca.calcularNovoSaldo(0.3);
     poupanca.exibirSaldo();

     System.out.println("\n");
     Especial especial = new Especial(cliente1, 15, 1200, 2300);
     especial.saqueEspecial(1000);
     System.out.println("\n--------------------------------------------------------\n");
     especial.saqueEspecial(4000);
     System.out.println("\n");
     especial.exibirSaldo();
        
    }
}
