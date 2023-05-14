import java.util.*;
class Enigma {

    public static String walze_verschieben(int verschiebung, String walze_alphabet) {
        String walze_verschoben = "";
        for(int stelle=verschiebung; stelle<walze_alphabet.length(); stelle++) {
            walze_verschoben += String.valueOf(walze_alphabet.charAt(stelle));
        }
        for(int stelle_davor=0; stelle_davor < verschiebung; stelle_davor++) {
            walze_verschoben += String.valueOf(walze_alphabet.charAt(stelle_davor));
        }
        return walze_verschoben;
    }

    public static int buchstabe_suchen(String buchstabe, String walze) {
        for(int stelle=0; stelle<walze.length(); stelle++) {
            if (String.valueOf(walze.charAt(stelle)) == buchstabe) {
                return stelle;
            }
        }
    }

    public static String steckbrett_suchen(String buchstabe) {
        String[][] steckerbrett = {{"A","D"}, {"C","N"}, {"E","T"}, {"F","L"}, {"G","I"}, {"J","V"}, {"K","Z"}, {"P","U"}, {"Q","Y"}, {"W","X"}};
        // return steckerbrett[2][1];
        String neuer_buchstabe = "";
        for(int stelle=0; stelle<2; stelle++) {
            for(int sublist=0; sublist<steckerbrett.length; sublist++) {
                if (steckerbrett[sublist][stelle] == buchstabe) {
                    neuer_buchstabe = steckerbrett[sublist][1-stelle];
                    return neuer_buchstabe;
                }
            }
        } 
        
    }
    

    public static void main (String [] args) {
        // Grundstellung AAA, keine Übertragskerben
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String walze1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        String walze2 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
        String walze3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
        String umkehrwalze = "YRUHQSLDPXNGOKMIEBFZCWVJAT";
        String verschluesselter_text = "";

        

        // Aus Gründen der Übersichtlichkeit und Einfachheit werden im Folgenden "CK" und "CH" nicht mit "Q" ersetzt sowie Leerzeichen nicht mit "X" ersetzt
        System.out.print("Bitte den zu verschlüsselnden Text im Enigma-Verfahren (nur Großbuchstaben, keine Sonder- und Leerzeichen!!!) eingeben: ");
        Scanner s = new Scanner(System.in);
        String text = s.next();
        s.close();

        System.out.println(steckbrett_suchen("A"));

        /*for(stelle=0; stelle<text.length(); stelle++) {

        } */

    }

}