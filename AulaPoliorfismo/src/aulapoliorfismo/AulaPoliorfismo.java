/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoliorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author froop
 */
public class AulaPoliorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     List<Animal> animais = new ArrayList<>();
     animais.add(new Cachorro());
     animais.add(new Gato());
     animais.add(new Periquito());
     
     
     for(Animal animal : animais){
         animal.emitirSom();
         animal.locomover();
         System.out.println("\n\n\n");
         
     }
     
     
     
        
    }
    
}
