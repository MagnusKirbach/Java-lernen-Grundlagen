import java.util.*;
class Caesarcode {

    public static void verschluesseln(int schluessel, String text){
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
        System.out.println("Geheimtext: "+verschluesselter_text);
    }

    public static void entschluesseln(int deschluessel, String geheimtext){
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
        System.out.println("Klartext: "+entschluesselter_text);
    }

    public static void main (String [] args) {
        System.out.print("Bitte den zu verschlüsselnden Text (ohne Leerzeichen!!!) eingeben: ");
        Scanner s = new Scanner(System.in);
        String text = s.next();
        s.reset();

        System.out.print("Bitte den Schlüssel zwischen 0 und 26 eingeben: ");
        int schluessel = s.nextInt();
        s.reset();      
        verschluesseln(schluessel, text);

        System.out.print("Bitte den zu entschlüsselnden Text (ohne Leerzeichen!!!) eingeben: ");
        String geheimtext = s.next();
        s.reset();

        System.out.print("Bitte den De-Schlüssel zwischen 0 und 26 eingeben: ");
        int deschluessel = s.nextInt();
        s.close();
        entschluesseln(deschluessel, geheimtext);
    }
}