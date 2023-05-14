import java.util.*;
class Vigenere {
    public static String verschluesseln_caesar(int schluessel, String text){
        String verschluesselter_text = "";
        for(int stelle=0; stelle<text.length(); stelle++) {

            char character = text.charAt(stelle);
            int ascii_wert = (int) character;
            boolean verify = false;

            if (ascii_wert >= 65 && ascii_wert <= (90-schluessel)) {
                verschluesselter_text += String.valueOf((char) (ascii_wert+schluessel));
                verify = true;
            }
            if (ascii_wert >= 97 && ascii_wert <= (122-schluessel)) {
                verschluesselter_text += String.valueOf((char) (ascii_wert+schluessel));
                verify = true;
            }
            else {
                if (ascii_wert >= (90-schluessel) && ascii_wert <= 90) {
                    verschluesselter_text += String.valueOf((char) (ascii_wert+schluessel-26));
                    verify = true;
                }
                if (ascii_wert >= (122-schluessel) && ascii_wert <= 122) {
                    verschluesselter_text += String.valueOf((char) (ascii_wert+schluessel-26));
                    verify = true;
                }
            }
            if (verify == false) { // Falls das Zeichen kein Standard-Buchstabe ist
                verschluesselter_text += String.valueOf((char) ascii_wert);
            }
        }
        return verschluesselter_text;
    }

    public static String entschluesseln_caesar(int deschluessel, String geheimtext){
        String entschluesselter_text = "";
        for(int stelle=0; stelle<geheimtext.length(); stelle++) {

            char character = geheimtext.charAt(stelle);
            int ascii_wert = (int) character;
            boolean verify = false;

            if (ascii_wert >= (65+deschluessel) && ascii_wert <= 90) {
                entschluesselter_text += String.valueOf((char) (ascii_wert-deschluessel));
                verify = true;
            }
            if (ascii_wert >= (97+deschluessel) && ascii_wert <= 122) {
                entschluesselter_text += String.valueOf((char) (ascii_wert-deschluessel));
                verify = true;
            }
            else {
                if (ascii_wert >= 65 && ascii_wert <= (65+deschluessel)) {
                    entschluesselter_text += String.valueOf((char) (ascii_wert-deschluessel+26));
                    verify = true;
                }
                if (ascii_wert >= 97 && ascii_wert <= (97+deschluessel)) {
                    entschluesselter_text += String.valueOf((char) (ascii_wert-deschluessel+26));
                    verify = true;
                }
            }
            if (verify == false) { // Falls das Zeichen kein Standard-Buchstabe ist
                entschluesselter_text += String.valueOf((char) ascii_wert);
            }
        }
        return entschluesselter_text;
    }

    public static void verschluesseln_vigenere(String schluessel, String text) {
        String verschluesselter_text = "";
        for(int stelle=0; stelle<text.length(); stelle++) {
            char v_character = schluessel.charAt(stelle%schluessel.length());
            int schluessel_wert = ((int) v_character)-65;
            verschluesselter_text += verschluesseln_caesar(schluessel_wert, String.valueOf(text.charAt(stelle)));
        }
        System.out.println("Verschlüsselter Text: "+verschluesselter_text);
    }

    public static void entschluesseln_vigenere(String deschluessel, String geheimtext) {
        String entschluesselter_text = "";
        for(int stelle=0; stelle<geheimtext.length(); stelle++) {
            char v_character = deschluessel.charAt(stelle%deschluessel.length());
            int schluessel_wert = ((int) v_character)-65;
            entschluesselter_text += entschluesseln_caesar(schluessel_wert, String.valueOf(geheimtext.charAt(stelle)));
        }
        System.out.println("Entschlüsselter Text: "+entschluesselter_text);
    }

    public static void main (String [] args) {
        System.out.print("Bitte den zu verschlüsselnden Text im Vigenere-Verfahren (nur Großbuchstaben, keine Leerzeichen!!!) eingeben: ");
        Scanner s = new Scanner(System.in);
        String text = s.next();
        s.reset();

        System.out.print("Bitte den Schlüssel (nur Großbuchstaben, keine Leerzeichen!!!) eingeben: ");
        String schluessel = s.next();
        s.reset();      
        verschluesseln_vigenere(schluessel, text);

        System.out.print("Bitte den zu entschlüsselnden Text im Vigenere-Verfahren (nur Großbuchstaben, keine Leerzeichen!!!) eingeben: ");
        String geheimtext = s.next();
        s.reset();

        System.out.print("Bitte den De-Schlüssel (nur Großbuchstaben, keine Leerzeichen!!!) eingeben: ");
        String deschluessel = s.next();
        s.close();
        entschluesseln_vigenere(deschluessel,geheimtext);

    }


}