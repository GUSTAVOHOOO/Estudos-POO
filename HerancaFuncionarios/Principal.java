package HerancaFuncionarios;


import HerancaFuncionarios.Gerente;
import HerancaFuncionarios.ClienteVip;

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
        
       
        ClienteVip gibsonVip = new ClienteVip ("Gibson", 32, "Masculino", 5000, 1200, 5);
        
        gibsonVip.parcelar();
        gibsonVip.exibirDadosClienteVip();
        
       
        Gerente ernestogerente = new Gerente("Ernesto", 55, "Masculino", 012, 7000, 30);
        
        ernestogerente.exibirDadosGerente();
        
        Vendedor vinijr = new Vendedor("Vinucius JR", 28,"Masculino", 013, 2500, 20,"Frigobar Eletrolux", 973);
        
        vinijr.exibirDadosVendedor();
        
    }
}
