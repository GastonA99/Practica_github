/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Brune
 */
public class Pato {
    
    private int edad;
    private String raza;
    private String color;
    private String tamanio;
    

    public Pato(int edad, String raza, String color, String tamanio) {
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Pato{" + "edad=" + edad + ", raza=" + raza + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
    
    
    
   
    
}
