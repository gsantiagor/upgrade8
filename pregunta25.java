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
public class pregunta25 {
    public static void main(String[] args) {
        
        String ejg1 =new String("E Java");//cuando se crean por new("") no comparten referencia
        String ejg2 =new String("E Java");
        
        String ejg3 = "E Java";//cuando se crean por = "" comparten referencia
        String ejg4 = "E Java";
        
        boolean a = ejg1.equals(ejg2);
        boolean b = ejg1 == ejg2;
        
        boolean c = ejg3.equals(ejg4);
        boolean d = ejg3 == ejg4;
        
        
        
        do{
            System.out.println(ejg1.equals(ejg2));
        }while(ejg3 == ejg4);
//        true loop infinito
    }
   
}
