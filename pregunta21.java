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
public class pregunta21 {
    public static void main(String[] args) {
        int a = 2 + 4 * 3 - 7;
        int b = 2 + (4 * 3) - 7;
        int c = ((2 + 4) * 3) - 25;
        int d = (2 + 4) * (3 - 7);
        
        System.out.println("a: " + a );//Correcta 7 
        System.out.println("b: " + b );//Correcta 7 
        System.out.println("c: " + c );//Incorrecta -7 
        System.out.println("d: " + d );//Incorrecta -24
    }
}
