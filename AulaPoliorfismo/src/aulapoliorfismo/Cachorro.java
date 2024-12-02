/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoliorfismo;

/**
 *
 * @author froop
 */
public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }

    @Override
    public void locomover() {
        System.out.println("Cachorro andando"); 
    }
    
}
