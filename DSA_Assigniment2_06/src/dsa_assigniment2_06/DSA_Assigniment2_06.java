/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_assigniment2_06;
import java.util.Scanner;
/**
 *
 * @author Moha_Hareeri
 */
public class DSA_Assigniment2_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);    
    
        System.out.println("Enter rupees");
        double rupees_r = in.nextDouble();
        
        if (rupees_r>1) {
            double dollar = rupees_r/45.2;
            System.out.println(" the converted value from rupees to dollars is: " +dollar);
        }
    }
}
