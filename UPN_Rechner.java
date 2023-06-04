import java.util.*;
import java.util.Collections;

import javax.sound.sampled.AudioFileFormat.Type;
class UPN_Rechner {

    public static Stack operationen(Stack stapel) {
        for (int stelle_stapel = 0; stelle_stapel < stapel.size(); stelle_stapel++) {
            //System.out.println(stelle_stapel);
            int neuer_wert = 0;
            System.out.println(stapel.get(stelle_stapel).toString().getClass().getName());
            if (stapel.get(stelle_stapel).toString() == "+") {
                System.out.println("neuer_wert");
                neuer_wert = Integer.valueOf(stapel.get(stelle_stapel-1).toString()) + Integer.valueOf(stapel.get(stelle_stapel-2).toString());
            }
            if (stapel.get(stelle_stapel).toString() == "-") {
                neuer_wert = Integer.valueOf(stapel.get(stelle_stapel-1).toString()) - Integer.valueOf(stapel.get(stelle_stapel-2).toString());
            }
            if (stapel.get(stelle_stapel).toString() == "*") {
                neuer_wert = Integer.valueOf(stapel.get(stelle_stapel-1).toString()) * Integer.valueOf(stapel.get(stelle_stapel-2).toString());
            }
            if (stapel.get(stelle_stapel).toString() == "/") {
                neuer_wert = Integer.valueOf(stapel.get(stelle_stapel-1).toString()) / Integer.valueOf(stapel.get(stelle_stapel-2).toString());
            }
            if (stapel.get(stelle_stapel).toString() != "/" & stapel.get(stelle_stapel).toString() != "*" & stapel.get(stelle_stapel).toString() != "-" & stapel.get(stelle_stapel).toString() != "+") {
                continue;
            }

            //System.out.println(neuer_wert);

            Collections.reverse(stapel);
            stapel.pop();
            stapel.pop();
            stapel.pop();
            stapel.push(neuer_wert);
            Collections.reverse(stapel);           
        }
        return stapel;
    }

    public static void main (String [] args) {
        System.out.print("Aus wie vielen Elementen besteht Ihr Stapel? ");
        Scanner s = new Scanner(System.in);
        int anzahl_elemente = s.nextInt();
        s.reset();

        Stack<String> stapel = new Stack<String>();

        for(int stelle=0; stelle<anzahl_elemente; stelle++) {
            System.out.print((stelle+1)+"stes Element von unten: ");
            stapel.push(s.next());
        }
        s.close();

        for(int stelle_stapel=0; stelle_stapel<anzahl_elemente; stelle_stapel++) {
            //System.out.println("Ergebnis: "+stapel.peek());
            //System.out.println(stapel.size());
            stapel = operationen(stapel);


            if (stapel.size() == 1) {
                System.out.println("Ergebnis: "+stapel.peek());
                break;
            }
        }

    }

}