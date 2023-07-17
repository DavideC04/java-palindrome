// Scrivere un programma che chiede all’utente di inserire una parola e gli risponde se è una parola palindroma oppure no

package org.java.exercise;

import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {

        // dichiaro le variabili
        String userWord;
        boolean isWordPalindrome = false;

        // dichiaro lo scanner

        Scanner scan = new Scanner(System.in);

        // chiedo all'utente di inserire una parola
        System.out.println("Inserisci una parola: ");
        userWord = scan.nextLine();
        // inizializzo un ciclo for per controllare gli indici dei caratteri
        for (int i = 0; i < userWord.length() /2 ; i++) {
            // se la parola scelta, controllando gli indici dei caratteri, risulta palindorma, il valore boolean risulterà true
            if (userWord.charAt(i) == userWord.charAt(userWord.length()-1 - i)){
                isWordPalindrome = true;
                break;

            }
        }

        if (isWordPalindrome){
            System.out.println("La parola scelta è polindroma.");
        } else {
            System.out.println("La parola scelta non è polindroma.");
        }
    }
}
