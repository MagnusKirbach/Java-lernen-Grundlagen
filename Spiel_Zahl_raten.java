package Ordnereins;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Spiel {
    
    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100+1);
    static Integer Versuche = 0;

    public static void main(String[] args) {
        nextRound();
    }

    public static void nextRound() {
        Versuche += 1;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte gebe eine Zahl ein: ");
            Integer number = scanner.nextInt();
            guess(number);
        }
    }

    public static void guess(Integer number) {
        if(number == myNumber) {
            System.out.println("Richtig geraten!!! "+"Du hast "+Versuche+" Versuche gebraucht.");
        } else {
            System.out.println("Falsch geraten!");

            if(number<myNumber) {
                System.out.println("Deine Zahl ist zu klein!");
            } else {
                System.out.println("Deine Zahl ist zu groß!");
            }
            nextRound();
        }
    }
}