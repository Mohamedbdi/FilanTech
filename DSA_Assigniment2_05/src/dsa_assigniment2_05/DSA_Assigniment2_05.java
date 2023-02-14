/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_assigniment2_05;

import java.util.Scanner;

/**
 *
 * @author Moha_Hareeri
 */
public class DSA_Assigniment2_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
         float n1, n2;
        
         System.out.print("Enter number 1 :  ");
         n1 = in.nextFloat();
         
         System.out.print("Enter number 2 :  ");
         n2 = in.nextFloat();
         
        if(n1 > n2)
            System.out.println(n1 +"is greater than ");
        
        if(n1 < n2)
            System.out.println(n2 +"is greater than ");
    }
    
}
