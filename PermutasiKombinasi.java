/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ACER
 */


/*
Program : PermutasiKombinasi.java
Author  : Jevi/2401082017
Date    : 10 February 2025
Description
Calculating permutation and combination based on user input
 */
import java.util.Scanner;
public class PermutasiKombinasi {
    public static void main(String[] args){
        Scanner waw = new Scanner(System.in);
        int a, b, c;
        
        System.out.print("Enter value for a: ");
        a = waw.nextInt();
        
        System.out.print("Enter value for b: ");
        b = waw.nextInt();
        
        if(b > a){
            c = b - a;
        }
        else{
            c = a - b;
        }
        
        int f_a, f_b, f_c;
        f_a = f_b = f_c = 1;
        for(int i = a; i > 1; i--){
            f_a *= i;
        }
        
        for(int i = b; i > 1; i--){
            f_b *= i;
        }
        
        for(int i = c; i > 1; i--){
            f_c *= i;
        }
        
        System.out.println("Factorial of a: " + f_a);
        System.out.println("Factorial of b: " + f_b);
        System.out.println("Factorial of c: " + f_c + "\n");
        
        int perm, comb;
        if(b > a){
            perm = f_b / f_c;
            comb = f_b / (f_a * f_c);
        }
        else{
            perm = f_a / f_c;
            comb = f_a / (f_b * f_c);
        }
        
        System.out.println("Permutation of a and b is: " + perm);
        System.out.println("Combination of a and b is: " + comb);
    }
}
