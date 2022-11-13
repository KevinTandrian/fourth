/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JavaApplication13 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tanya;
        Scanner scan = new Scanner(System.in);
        System.out.print("apakah anda lapar? (Ya atau Tidak) : ");
        tanya = scan.next();
        if ("Ya".equalsIgnoreCase(tanya))
        {
            System.out.println("makan bang");
            
        }
        else
        {
                System.out.println("tidak makan");
                
        }
        // TODO code application logic here
    }
    
}
