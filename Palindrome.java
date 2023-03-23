import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib bitte das Palindrom ein: ");
        String eingabe = s.nextLine();
        eingabe = eingabe.toLowerCase();
        eingabe = eingabe.replaceAll(" ", "");
        eingabe = eingabe.replaceAll(",", "");
        eingabe = eingabe.replaceAll("\\.", "");
        eingabe = eingabe.replaceAll("!", "");
        eingabe = eingabe.replaceAll("\\?", "");
        for (int i = 0; i < eingabe.length() / 2; i++) {
            if (eingabe.charAt(i) != eingabe.charAt(eingabe.length() - i - 1)) {
                System.out.println("Es handelt sich nicht um ein Palindrom!");
                s.close();
                return;
            }
        }
        System.out.println("Es handelt sich um ein Palindrom!");
        s.close();
    }
}
