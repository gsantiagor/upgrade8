package examen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GSantiagoR
 */
public class pregunta01 {

    public static void main(String[] args) {
        int suma = 0;
        for(int i = 0, j = 9, z = 1; i < 4 && j > 0; i++){
            do{
                suma += i*(j%z)+3;
            }while(z++ <= 1);
        }
        System.out.println("suma: " + suma);
        //suma: 19 o 29
    }
    
}
