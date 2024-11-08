package HerancaFuncionarios;


import java.util.HashMap;
import java.util.Scanner;

/*ente
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author froop
 */
public class Principal {
    
    public static void main(String[] args) {
        
       
//        ClienteVip gibsonVip = new ClienteVip ("Gibson", 32, "Masculino", 5000, 1200, 5);
//        
//        gibsonVip.parcelar();
//        gibsonVip.exibirDadosClienteVip();
//        
//       
//        Gerente ernestogerente = new Gerente("Ernesto", 55, "Masculino", 012, 7000, 30);
//        
//        ernestogerente.exibirDadosGerente();
//        
//        Vendedor vinijr = new Vendedor("Vinucius JR", 28,"Masculino", 013, 2500, 20,"Frigobar Eletrolux", 973);
//        
//        vinijr.exibirDadosVendedor();
     
    HashMap<String, Pessoa> pessoas =  new HashMap<>(); 
   Scanner scan = new Scanner(System.in);
     
        System.out.println("Bom dia, quantas pessoas voce gostaria de cadastrar");
        int z = scan.nextInt();
        
        for(int w = 0 ; w < z ; w++ ){
        scan.nextLine();
        System.out.println("""
                           1.Cliente
                           2.Cliente Vip
                           3.Vendedor
                           4.Gerente
                           """);
        int i = scan.nextInt();

        switch(i){
        
        case 1 -> {
            System.out.println("Digite o nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            
            System.out.println("Digite a idade: ");
            int idade = scan.nextInt();
            scan.nextLine();
            
            System.out.println("Digite o sexo: ");
            String sexo  = scan.nextLine();
            
            System.out.println("Digite a renda: ");
            double renda = scan.nextDouble();
            
            System.out.println("Digite a divida: ");
            double divida = scan.nextDouble();
            
            Cliente cliente = new Cliente (nome, idade, sexo, renda, divida);
            pessoas.put(nome ,cliente);
            
            cliente.exibirDados();
            }
        
        case 2 -> {
            scan.nextLine();
            System.out.println("Digite o nome: ");
            String nome1 = scan.nextLine();
            
            
            System.out.println("Digite a idade: ");
            int idade1 = scan.nextInt();
            
            scan.nextLine();
            System.out.println("Digite o sexo: ");
            String sexo1  = scan.nextLine();
            
            
            System.out.println("Digite a renda: ");
            double renda1 = scan.nextDouble();
            
         
            System.out.println("Digite a divida: ");
            double divida1 = scan.nextDouble();
            
            
            System.out.println("Digite o bonus: ");
            double bonus = scan.nextDouble();
            
            
            ClienteVip clientevip = new ClienteVip (nome1, idade1, sexo1, renda1, divida1, bonus);
            pessoas.put(nome1, clientevip);
            
            clientevip.exibirDadosClienteVip();
            }
        
        case 3 -> {
            System.out.println("Digite o nome: ");
            scan.nextLine();
            String nome2 = scan.nextLine();
            
            System.out.println("Digite a idade: ");
            int idade2 = scan.nextInt();
            
            System.out.println("Digite o sexo: ");
            scan.nextLine();
            String sexo2  = scan.nextLine();
            
            System.out.println("Digite o numero da matricula: ");
            int matricula = scan.nextInt();
            scan.nextLine();
            
            System.out.println("Digite o salario: ");
            double salario = scan.nextDouble();
            
            System.out.println("Digite o tempo de servico: ");
            int temposervico = scan.nextInt();
            
            System.out.println("DIgite o produto vendido: ");
            scan.nextLine();
            String produto = scan.nextLine();
            
            System.out.println("Digite o valor da venda: ");
            double valor = scan.nextDouble();
            
            Vendedor vendedor = new Vendedor(nome2, idade2, sexo2, matricula, salario, temposervico, produto, valor);
            pessoas.put(nome2, vendedor );
            
            vendedor.exibirDadosVendedor();
            }
        case 4 -> {
            System.out.println("Digite o nome: ");
            scan.nextLine();
            String nome3 = scan.nextLine();
            
            System.out.println("Digite a idade: ");
            int idade3 = scan.nextInt();
            
            System.out.println("Digite o sexo: ");
            scan.nextLine();
            String sexo3  = scan.nextLine();
            
            System.out.println("Digite o numero da matricula: ");
            int matricula1 = scan.nextInt();
            
            
            System.out.println("Digite o salario: ");
            double salario1 = scan.nextDouble();
            
            System.out.println("Digite o tempo de servico: ");
            int temposervico1 = scan.nextInt();
            
            System.out.println("Digite o departamento: ");
            scan.nextLine();
            String departamento  = scan.nextLine();
            
            Gerente gerente = new Gerente(nome3, idade3, sexo3, matricula1, salario1, temposervico1, departamento);
            pessoas.put(nome3, gerente);
            
            gerente.exibirDadosGerente();
            }
    }
                
   }  
         
        
        
        
    }
}
