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
public class pregunta22 {
    public static void main(String[] args) {
        int a = 0;
        for(; a <= 20; ++a){
            if(a%3 == 0){
                a++;
            }else if(a%2==0){
                a = a * 2;
            }
        }
        System.out.println("a: " + a);//a: 41
    }
}
