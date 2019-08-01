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
public class pregunta08 {
    public static void main(String[] args) {
        String[] msg = {"H", "o", "l", "a"};
        String res = msg[0] + msg[1] + msg[2] + msg[3];
        String res2 = "Hola";
        System.out.println(res.equals(res2));
        System.out.println(res == res2);
        /*
        true
        false
        */
    }
}
