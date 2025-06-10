/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibbonacciseries;

/**
 *
 * @author munzhedzi zwezwo
 */
import java.util.Scanner;
public class FibbonacciSeries {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("ENTER n TERMS");
         int n= input.nextInt();
         
         
         int first=0;
         int second=1;    //THIS ONES THEY ARE ALWAYS LIKE THIS
         
          System.out.println("Fibonacci Series Of " +n +" TERMS ARE");
         
          
            for (int i=0;i<=n; i++){
                
         //formula
         int nextterm= (first+second);
         first=second;
         second=nextterm;
         System.out.println(nextterm);        
        
      
            
        }
    }
}
