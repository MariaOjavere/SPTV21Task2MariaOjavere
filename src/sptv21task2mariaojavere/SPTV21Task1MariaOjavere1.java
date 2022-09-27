/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2mariaojavere;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task2MariaOjavere1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        System.out.println("Сумма цифр: " + sumDigits(n));
    }
    public static int sumDigits(int n){
    int sum = 0;
    while (n !=0){
        sum += n % 10;
        n /= 10;
        }
    return sum;
    }
}

