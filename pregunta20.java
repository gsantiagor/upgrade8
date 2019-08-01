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
public class pregunta20 {

    public static void main(String[] args) {
        int var = 3;
        switch (var) {
            case 1:
                try {
                    throw new IllegalArgumentException();
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                }
            default:
                try {
                    throw new ArrayIndexOutOfBoundsException();
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                }
            case 2:
                try {
                    throw new ArithmeticException();
                } catch (RuntimeException ex) {
                    ex.printStackTrace();
                }

                /*
                java.lang.ArrayIndexOutOfBoundsException
                java.lang.ArithmeticException
                */
                
        }
    }

}
