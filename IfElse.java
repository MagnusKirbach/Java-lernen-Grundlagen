package Ordnereins;
public class Drei {
    public static void main(String[] args) {
        String name = "Magnus";
        String job = "Schüler";
        Integer alter = 16;

        showGreeting(10);

        System.out.println("Ich heiße " + name + ". Ich bin ein "+job+".");
        System.out.println("Ich bin "+alter+" Jahre alt.");
    }


    public static void showGreeting(Integer hour) {
        if(hour<12) {
            System.out.println("Guten Morgen!");
        } else {
            if(hour<18) {
                System.out.println("Guten Tag!");
            } else {
                System.out.println("Guten Abend!");
            }
        }
    }
}
