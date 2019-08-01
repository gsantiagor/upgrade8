/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author GSantiagoR
 */
public class pregunta16 {
    public static void main(String[] args) {
        String ejg = "game";
        ejg.replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);
        System.out.println(ejg);
        
        //Salida es: game
    }
}
