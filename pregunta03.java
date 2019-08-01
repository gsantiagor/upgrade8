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
public class pregunta03 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = (a * (b + 2)) - 10 - 4 * ((2 * 2) - 6);
//          c = (10 * (20 + 2))- 10 - 4 *((2 * 2) - 6) 
//          c = (10 * (22))- 10 - 4 *((4) - 6) 
//          c = (220)- 10 -4 *(-2) 
//          c = (220)- 10 + 8
//          c = (220)- 2
//          c = 218

        System.out.println("Valor c: " + c);
    }
    //Valor c: 218
}
