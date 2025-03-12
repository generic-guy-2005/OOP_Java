/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_1;

/**
 *
 * @author ACER
 Program : Matrix.java
Author  : Jevi/2401082017
Date    : 11 March 2025
Description
Design a matrix calculator
*/
import java.util.Scanner;
import java.util.Random;
public class Matrix {
    public static int transpose(int[][] matrix1, int[][] matrix2, int length, int[][] result) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                result[i][j] = matrix1[j][i];
            }
        }
        
        System.out.println("\nResult:");
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                result[i][j] = matrix2[j][i];
            }
        }
        
        System.out.println();
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        return 1;
    }
    
    public static int identity(int length, int[][] result) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(i == j) {
                    result[i][j] = 1;
                }
                else {
                    result[i][j] = 0;
                }
            }
        }
        
        System.out.println("\nResult:");
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        return 1;
    }
    
    public static int multiplication(int[][] matrix1, int[][] matrix2, int length, int[][] result){
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                for(int k = 0; k < length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("\nResult:");
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        return 1;
    }
    
    public static int subtraction(int[][] matrix1, int[][] matrix2, int length, int[][] result){
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        System.out.println("\nResult:");
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        return 1;
    }
    
    public static int addition(int[][] matrix1, int[][] matrix2, int length, int[][] result){
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("\nResult:");
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        
        return 1;
    }
    
    public static void displayMatrix(int[][] matrix1, int[][] matrix2, int length) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println();
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    
    public static int[][] generateMatrix(int[][] matrix, int length, Random dice) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                matrix[i][j] = dice.nextInt(10);
            }
        }
        return matrix;
    }
    
    public static int menu(Scanner read) {
        System.out.println("+------------------+\n       MENU");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Identity\n5. Transpose\n6. Exit");
        System.out.println("+------------------+");
        
        int ans;
        System.out.print("Enter an options [1-6]: ");
        ans = read.nextInt();
        return ans;
    } 
    
    public static void main(String[] args) {
        int opt, matrix1[][], matrix2[][], length, result[][];
        boolean loop = true;
        Scanner read = new Scanner(System.in);
        opt = menu(read);
        
        Random dice = new Random();
        System.out.print("\nEnter the length of matrix: ");
        length = read.nextInt();
        matrix1 = new int[length][length];
        matrix2 = new int[length][length];
        result = new int[length][length];
        
        switch(opt) {
            case 1:
                System.out.println("\nMatrix generated:");
                matrix1 = generateMatrix(matrix1, length, dice);
                matrix2 = generateMatrix(matrix2, length, dice);
                displayMatrix(matrix1, matrix2, length);
                addition(matrix1, matrix2, length, result);
                break;
            case 2:
                System.out.println("\nMatrix generated:");
                matrix1 = generateMatrix(matrix1, length, dice);
                matrix2 = generateMatrix(matrix2, length, dice);
                displayMatrix(matrix1, matrix2, length);
                subtraction(matrix1, matrix2, length, result);
                break;
            case 3:
                System.out.println("\nMatrix generated:");
                matrix1 = generateMatrix(matrix1, length, dice);
                matrix2 = generateMatrix(matrix2, length, dice);
                displayMatrix(matrix1, matrix2, length);
                multiplication(matrix1, matrix2, length, result);
                break;
            case 4:
                System.out.println("\nMatrix generated:");
                matrix1 = generateMatrix(matrix1, length, dice);
                matrix2 = generateMatrix(matrix2, length, dice);
                displayMatrix(matrix1, matrix2, length);
                identity(length, result);
                break;
            case 5:
                System.out.println("\nMatrix generated:");
                matrix1 = generateMatrix(matrix1, length, dice);
                matrix2 = generateMatrix(matrix2, length, dice);
                displayMatrix(matrix1, matrix2, length);
                transpose(matrix1, matrix2, length, result);
                break;
            case 6:
                System.out.println("Exiting program...");
                loop = false;
                break;
            default:
                System.out.println("Options doesn't exist");
                main(new String[]{});
        }
        
        if(loop) {
            main(new String[]{});
        }
    }
}
