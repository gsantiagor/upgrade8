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
public class pregunta28 {

    public int i;

    public static void main(String[] args) {
        pregunta28 sc = new pregunta28();
        
        System.out.println(sc.i);//valido
//        System.out.println(pregunta28.i);//no valido
        System.out.println((new pregunta28()).i);//valido
//        System.out.println(i);//no valido
    }

}
