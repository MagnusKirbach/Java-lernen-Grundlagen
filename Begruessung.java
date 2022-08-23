package Ordnereins;
public class Zwei {
    public static void main(String[] args) {
        String name = "Magnus";
        String job = "Schüler";
        Integer alter = 16;
        Integer hour = 18;

        if(hour<12) {
            System.out.println("Guten Morgen!");
        } else {
            if(hour<18) {
                System.out.println("Guten Tag!");
            } else {
                System.out.println("Guten Abend!");
            }
        }

        System.out.println("Ich heiße " + name + ". Ich bin ein "+job+".");
        System.out.println("Ich bin "+alter+" Jahre alt.");
    }
}
