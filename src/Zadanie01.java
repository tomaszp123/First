package src;

import java.util.Scanner;

/*
	Created by Tomasz Pajewski on 2020-01-28.
	Java Exercise 01 
*/
public class Zadanie01 {
    // User wprowadza 3 liczby - sprawdź czy mogą utworzyć trójkąt.
    // 2 muszą być większe od 3.

    public static void main(final String[] args) {
        int a, b, c = 0;
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 1 liczbę: ");
        a = scanner.nextInt();
        System.out.print("Podaj 2 liczbę: ");
        b = scanner.nextInt();
        System.out.print("Podaj 3 liczbę: ");
        c = scanner.nextInt();
        if (a < b + c || b < a + c || c < a + b) {
            System.out.print("Tak ");
        } else
            System.out.print("Nie ");
        scanner.close();
    }
}