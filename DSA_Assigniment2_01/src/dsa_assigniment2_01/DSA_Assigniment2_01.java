/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_assigniment2_01;
import java.util.Scanner;
/**
 *
 * @author Moha_Hareeri
 */
public class DSA_Assigniment2_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any enteger number:  ");
        int num = in.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " this number is even");
        else
            System.out.println(num + " this number is odd");
    }
    
}
