/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ACER
 * Program : Pola.java
Author  : Jevi/2401082017
Date    : 12 March 2025
Description
Create a market payment system
 */
import java.util.Scanner;
public class Swalayan {
    public static void main(String[] args) {
        Scanner dahlah = new Scanner(System.in);
        
        System.out.println("+--------------------+");
        System.out.println("Product     Cost      ");
        System.out.println("X           Rp40.000,-");
        System.out.println("Y           Rp50.000,-");
        System.out.println("Z           Rp60.000,-");
        System.out.println("+--------------------+");
        
        int prod;
        System.out.print("Select product [1-3]: ");
        prod = dahlah.nextInt();
        
        if(prod < 1 || prod > 3) {
            System.out.println("There is no such product");
            main(new String[]{});
        }
        
        int sum;
        System.out.print("How much: ");
        sum = dahlah.nextInt();
        
        int cost = 0;
        double disc = 0, total = 0;
        if(prod == 1) {
            cost += 40000;
            cost *= sum;
            
            if(sum >= 3) {
                disc = 0.1;
            }
            
            total = cost - (cost * disc);
            System.out.println("Price\t: " + cost);
            System.out.println("Discount: " + disc * 100 + "%");
            System.out.println("Total\t: " + total);
        }
        else if(prod == 2) {
            cost += 50000;
            cost *= sum;
            
            if(sum > 3) {
                disc = 0.12;
            }
            
            total = cost - (cost * disc);
            System.out.println("Price\t: " + cost);
            System.out.println("Discount: " + disc * 100 + "%");
            System.out.println("Total\t: " + total);
        }
        else {
            cost += 60000;
            cost *= sum;
            
            if(sum > 1) {
                disc = 0.15;
                
                total = (60000 - (60000 * disc)) * (sum - 1);
                total += 60000;
            }
            
            System.out.println("Price\t: " + cost);
            System.out.println("Discount: " + disc * 100 + "%");
            System.out.println("Total\t: " + total);
        }
    }
}
