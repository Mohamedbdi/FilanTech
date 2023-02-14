/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_assigniment2_04;

import java.util.Scanner;

/**
 *
 * @author Moha_Hareeri
 */
public class DSA_Assigniment2_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
         float n1, n2,  sum,  sub, multi , divide;
        
         System.out.print("Enter number 1 :  ");
         n1 = in.nextFloat();
         
         System.out.print("Enter number 2 :  ");
         n2 = in.nextFloat();
         
         System.out.print("Enter operator :  ");
        char op = in.next().charAt(0);
        if(op == '+')
            System.out.println("The Addition is:  " +(n1+n2));
        
        if(op == '-')
            System.out.println("The subtraction is:  " +(n1-n2));
        if(op == '*')
            System.out.println("The multiplicatio is:  " +(n1*n2));
        if(op == '/')
            System.out.println("The divition is:  " +(n1/n2));
        
         
    }
    
}
