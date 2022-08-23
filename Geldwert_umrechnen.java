package Ordnereins;

import java.util.Scanner;

public class Rechner {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte gebe einen Betrag in Euro an:");
            Double money = scanner.nextDouble();

            convertToDollars(money);
            convertToPounds(money);
        }
    }

    public static void convertToDollars(Double euro) {
        System.out.println("Der Betrag in Dollar ist: " + euro * 1.20);
    }

    public static void convertToPounds(Double euro) {
        System.out.println("Der Betrag in Pfund Sterling ist: " + euro * 0.85);
    }
}
