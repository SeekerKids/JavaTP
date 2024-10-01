
package com.mycompany.main;


import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        playGuessingGame();
    }

    public static void playGuessingGame() {
      try (Scanner scanner = new Scanner(System.in)) {
          Random rand = new Random();
          
          int secretNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
          boolean guessedCorrectly = false;
          
          System.out.println("Halo! Selamat datang di Permainan Tebak Angka.");
          System.out.println("Silahkan pilih angka dari 1 sampai 100.");
          
          // Loop until the user guesses correctly
          while (!guessedCorrectly) {
              System.out.print("Masukan Tebakan Anda: ");
              int userGuess = scanner.nextInt();
              guessedCorrectly = checkGuess(userGuess, secretNumber);
          }
       }
    }

    public static boolean checkGuess(int userGuess, int secretNumber) {
        if (userGuess > secretNumber) {
            System.out.println("Terlalu besar! Coba lagi.");
            return false;
        } else if (userGuess < secretNumber) {
            System.out.println("Terlalu kecil! Coba lagi.");
            return false;
        } else {
            System.out.println("Selamat! Kamu berhasil.");
            return true;
        }
    }
}
