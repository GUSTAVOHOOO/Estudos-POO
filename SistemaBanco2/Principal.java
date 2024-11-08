package SistemaBanco2;


import SistemaBanco2.Poupanca;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Scanner;

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
        
        
//     Cliente cliente1 = new Cliente("Gustavo Mazur", LocalDate.of(2006, 03, 24));
//     Conta conta = new Conta(cliente1, 12, 130000);
//     conta.sacar(2300);
//     conta.depositar(1000);
//     conta.exibirSaldo();
//      
//     System.out.println("\n");
//     Poupanca poupanca = new Poupanca(cliente1, 12, 130000, 4);
//     poupanca.calcularNovoSaldo(0.3);
//     poupanca.exibirSaldo();
//
//     System.out.println("\n");
//     Especial especial = new Especial(cliente1, 15, 1200, 2300);
//     especial.saqueEspecial(1000);
//     System.out.println("\n--------------------------------------------------------\n");
//     especial.saqueEspecial(4000);
//     System.out.println("\n");
//     especial.exibirSaldo();
     
          
        HashMap<String, Cliente> maps = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Bem vindo ao sistema de cadastro bancario!!!");
        
        //CADASTRO DE UM CLIENTE 
        System.out.println("-------------------------");
        System.out.println("Digite o nome do proprietario da conta: ");
        String nome = scan.nextLine();
        
        System.out.println("Digite a data de nascimento do cliente (ex - 2004,04,02) ");
        scan.nextLine();
        String data = scan.nextLine();
    
        System.out.println("Digite o numero da conta : ");
        int numero = scan.nextInt();
    
        System.out.println("Digite o saldo disponivel do cliente:  ");
        double saldo = scan.nextDouble();
        
       //Adiciona todas a variaveis escaniadas aos respectivos construtores e ao Map
        Cliente cliente1 = new Cliente(nome, data);
        Conta conta1 = new Conta(cliente1, numero, saldo);
        maps.put(nome, cliente1);
        
        conta1.exibirSaldo(); //Funcao para printar os dados cadastrados
   
        //cadastrando a conta como Poupanca
       
        System.out.println("Agora vamos cadastrar esta nova conta como poupanca");
    
        System.out.println("----------------------------------------------------");
        
        System.out.println("Digite o numero da conta poupanca desse cliente: ");
        int numpou = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o saldo disponivel na poupanca desse cliente: ");
        double saldpou = scan.nextDouble();
        
        System.out.println("Digite o numero de dias que a poupanca ira render: ");
        scan.nextInt();
        int dias = scan.nextInt();
        
        System.out.println("Digite a taxa de rendimento da poupanca");
        double taxa = scan.nextDouble();
        
        //Adicionando as variaveis ao respectivo objeto
        Poupanca poupanca = new Poupanca(cliente1, numpou, saldpou, dias);
        maps.put(nome, cliente1);
        //Funces da poupanca 
        poupanca.calcularNovoSaldo(taxa);
        poupanca.exibirSaldo();
        
        System.out.println("-----------------------------------------");
        System.out.println("Agora vamos fazer o cadastro da conta especial");
        
        System.out.println("Digite o numero dessa conta: ");
        int numesp = scan.nextInt();
        
        System.out.println("Digite o saldo disponivel da conta especial: ");
        double saldoesp = scan.nextDouble();
    
        System.out.println("DIgite o limite de saldo que o cliente pode sacar: ");
        double limite = scan.nextDouble();
        
        //Criando novo objeto 
        Especial especial = new Especial(cliente1, numesp, saldoesp, limite);
        //Adicionando objeto ao Map
        maps.put(nome, cliente1);
        
        especial.exibirSaldo();
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Agora gostaria de deposiatar ou sacar dinheiro em alguma conta ?");
        String ans = scan.nextLine();
        
        if(ans.equalsIgnoreCase("nao")){
            System.out.println("Fechando sistema");
            return;
        }else
            scan.nextLine();
            System.out.println("Gostaria de fazer um saque ou deposito em qual conta?");
            System.out.println("""
                               1.Conta Padrao.
                               2.Conta poupanca.
                               3.conta Especial.
                               4.Sair do sistema.
                               """);
            int escolha = scan.nextInt();
            
        
        scan.nextLine();
        switch(escolha){
            
            case 1 -> {
                scan.nextLine();
                System.out.println("Voce gostaria de fazer um saque ou deposito: ");
               
                String escolha1 = scan.nextLine();
                scan.nextLine();
                if(escolha1.equalsIgnoreCase("saque")){
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorsaque = scan.nextDouble();
                    
                    conta1.sacar(valorsaque);
                    conta1.exibirSaldo();
                }else if(escolha1.equalsIgnoreCase("deposito")){
                
                    System.out.println("Digite o valor do deposito: ");
                    double valordep = scan.nextDouble();
                    
                    conta1.depositar(valordep);
                    conta1.exibirSaldo();
                }else{
                    System.out.println("Valor digitado incompativel...");
                    break;
                }
            }
            case 2 -> {
                scan.nextLine();
                System.out.println("Voce gostaria de fazer um saque ou deposito: ");
                
                String escolha2 = scan.nextLine();
                scan.nextLine();
                if(escolha2.equalsIgnoreCase("saque")){
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorsaque = scan.nextDouble();
                    
                    poupanca.sacar(valorsaque);
                    poupanca.exibirSaldo();
                    
                }else if(escolha2.equalsIgnoreCase("deposito")){
                
                    System.out.println("Digite o valor do deposito: ");
                    double valordep = scan.nextDouble();
                    
                   poupanca.depositar(valordep);
                   poupanca.exibirSaldo();
                }else{
                    System.out.println("Valor digitado incompativel...");
                    break;   
                }
            }
                
            case 3 -> {
                scan.nextLine();
                System.out.println("Voce gostaria de fazer um saque , deposito ou saque especial : ");
                
                String escolha3 = scan.nextLine();
                scan.nextLine();
                if(escolha3.equalsIgnoreCase("saque")){
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorsaque = scan.nextDouble();
                    
                    especial.sacar(valorsaque);
                    especial.exibirSaldo();
                }else if(escolha3.equalsIgnoreCase("deposito")){
                
                    System.out.println("Digite o valor do deposito: ");
                    double valordep = scan.nextDouble();
                    
                    especial.depositar(valordep);
                    especial.exibirSaldo();
                }else if(escolha3.equalsIgnoreCase("saque especial")){
                
                    System.out.println("Digite o valor do saque especial: ");
                    double saqueesp = scan.nextDouble();
                    
                    especial.saqueEspecial(saqueesp);
                    especial.exibirSaldo();
                }
                
                else{
                    System.out.println("Valor digitado incompativel...");
                    break;   
                }
            }
        
        }
        
        
        
        
    }
    }

