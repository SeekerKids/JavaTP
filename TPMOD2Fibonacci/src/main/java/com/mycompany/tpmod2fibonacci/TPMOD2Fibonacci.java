/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmod2fibonacci;

/**
 *
 * @author Kids1
 */
import java.util.Scanner;

public class TPMOD2Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = scanner.nextInt();

        int a = 1, b = 1;
        System.out.print(a + " ");

        if (n > 1) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println(); 
    }
}