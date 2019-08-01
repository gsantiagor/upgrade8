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
public class pregunta14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = false;
        if(b > a){
            if(++a == 10){
                if(c!= true){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }else{
                System.out.println(3);
            }
        }
    }
    //3
}
