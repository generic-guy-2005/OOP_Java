/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ACER
Program : TigaArray.java
Author  : Jevi/2401082017
Date    : 11 March 2025
Description
Combining two user input arrays with the largest array in the first order
*/
import java.util.Scanner;
import java.util.Random;
public class TigaArray {
    public static void main(String[] args){
        int A[], B[], C[], a, b;
        Scanner inside = new Scanner(System.in);
        Random shuffle = new Random();
        
        System.out.print("Enter the length of array A: ");
        a = inside.nextInt();
        A = new int[a];
        
        System.out.print("Enter the length of array B: ");
        b = inside.nextInt();
        B = new int[b];
       
        C = new int[a + b];
       
        System.out.println("\nArray A Elements:");
        for(int i = 0; i < a; i++) {
            A[i] = shuffle.nextInt(100);
        }
        
        for(int i = 0; i < a; i++) {
            System.out.println("Index " + i + " : " + A[i]);
        }
        
        System.out.println("\nArray B Elements:");
        for(int i = 0; i < b; i++) {
            B[i] = shuffle.nextInt(100);
        }
        
        for(int i = 0; i < b; i++) {
            System.out.println("Index " + i + " : " + B[i]);
        }
        
        System.out.println("\nArray C Elements:");
        if(a > b) {
            for(int i = 0; i < a + b; i++) {
                if (i < a) {
                    C[i] = A[i];
                }
                else {
                    C[i] = B[i - a];
                }
            }
        }
        else {
            for(int i = 0; i < a + b; i++) {
                if (i < b) {
                    C[i] = B[i];
                }
                else {
                    C[i] = B[i - b];
                }
            }
        }
        
        for(int i = 0; i < a + b; i++) {
            System.out.println("Index " + i + " : " + C[i]);
        }
    }
}
