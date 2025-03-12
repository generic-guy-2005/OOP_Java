/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;
/**
 *
 * @author ACER
 *  Program : Pola.java
Author  : Jevi/2401082017
Date    : 12 March 2025
Description
Create a pattern based on user input
 */
import java.util.Scanner;
public class Pola {
    public static void main(String[] args) {
        int n;
        Scanner masukkanUserInput = new Scanner(System.in);
        
        System.out.print("Enter value: ");
        n = masukkanUserInput.nextInt();
        
        System.out.println("\nResult:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print("0 ");
                }
                else if(i == 0 || j == 0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
