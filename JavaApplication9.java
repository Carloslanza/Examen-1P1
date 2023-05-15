/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero par");
        int num1= sc.nextInt();
        if(num1%2==0){
            for (int i = 1; i <=num1; i++) {
                if((i==1)||(i==num1)){
                    System.out.print("*");
                    for (int j = 1; j <=num1-2; j++) {
                        System.out.print("+");
                    }
                     System.out.println("*");
                }else{
                    System.out.print("+");
                    for (int j = 1; j <=num1-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.println("+");
                }
            }
        }
        
    }
    
}