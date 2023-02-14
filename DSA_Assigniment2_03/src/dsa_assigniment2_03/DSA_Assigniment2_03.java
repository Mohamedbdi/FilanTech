/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_assigniment2_03;

import java.util.Scanner;

/**
 *
 * @author Moha_Hareeri
 */
public class DSA_Assigniment2_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         float p, r,  t,  si; 
         System.out.print("Enter principla :  ");
         p = in.nextFloat();
         
         System.out.print("Enter rate :  ");
         r = in.nextFloat();
         
         System.out.print("Enter time :  ");
         t = in.nextFloat();
         p = 13000;  r = 12; t = 2;  
         si  = (p*r*t)/100;   
         System.out.println("Simple Interest is: " +si); 
        
    }
    
}
