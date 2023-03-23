import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Encode (0) or Decode (1)?");
        int operation = s.nextInt();
        s.reset();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Gib bitte den Morsecode ein: ");
        String eingabe = s2.nextLine();
        eingabe = eingabe.toLowerCase();
        String morseCode = "";
        if (operation == 0) {
            for (int i=0;i < eingabe.length(); i++) {
                switch(eingabe.charAt(i)) {
                    case 'a':
                        morseCode += ".-";
                        morseCode += " ";
                        break;
                    case 'b':
                        morseCode += "-...";
                        morseCode += " ";
                        break;
                    case 'c':
                        morseCode += "-.-.";
                        morseCode += " ";
                        break;
                    case 'd':
                        morseCode += "-..";
                        morseCode += " ";
                        break;
                    case 'e':
                        morseCode += ".";
                        morseCode += " ";
                        break;
                    case 'f':
                        morseCode += "..-.";
                        morseCode += " ";
                        break;
                    case 'g':
                        morseCode += "--.";
                        morseCode += " ";
                        break;
                    case 'h':
                        morseCode += "....";
                        morseCode += " ";
                        break;
                    case 'i':
                        morseCode += "..";
                        morseCode += " ";
                        break;
                    case 'j':
                        morseCode += ".---";
                        morseCode += " ";
                        break;
                    case 'k':
                        morseCode += "-.-";
                        morseCode += " ";
                        break;
                    case 'l':
                        morseCode += ".-..";
                        morseCode += " ";
                        break;
                    case 'm':
                        morseCode += "--";
                        morseCode += " ";
                        break;
                    case 'n':
                        morseCode += "-.";
                        morseCode += " ";
                        break;
                    case 'o':
                        morseCode += "---";
                        morseCode += " ";
                        break;
                    case 'p':
                        morseCode += ".--.";
                        morseCode += " ";
                        break;
                    case 'q':
                        morseCode += "--.-";
                        morseCode += " ";
                        break;
                    case 'r':
                        morseCode += ".-.";
                        morseCode += " ";
                        break;
                    case 's':
                        morseCode += "...";
                        morseCode += " ";
                        break;
                    case 't':
                        morseCode += "-";
                        morseCode += " ";
                        break;
                    case 'u':
                        morseCode += "..-";
                        morseCode += " ";
                        break;
                    case 'v':
                        morseCode += "...-";
                        morseCode += " ";
                        break;
                    case 'w':
                        morseCode += ".--";
                        morseCode += " ";
                        break;
                    case 'x':
                        morseCode += "-..-";
                        morseCode += " ";
                        break;
                    case 'y':
                        morseCode += "-.--";
                        morseCode += " ";
                        break;
                    case 'z':
                        morseCode += "--..";
                        morseCode += " ";
                        break;
                    case '0':
                        morseCode += "-----";
                        morseCode += " ";
                        break;
                    case '1':
                        morseCode += ".----";
                        morseCode += " ";
                        break;
                    case '2':
                        morseCode += "..---";
                        morseCode += " ";
                        break;
                    case '3':
                        morseCode += "...--";
                        morseCode += " ";
                        break;
                    case '4':
                        morseCode += "....-";
                        morseCode += " ";
                        break;
                    case '5':
                        morseCode += ".....";
                        morseCode += " ";
                        break;
                    case '6':
                        morseCode += "-....";
                        morseCode += " ";
                        break;
                    case '7':
                        morseCode += "--...";
                        morseCode += " ";
                        break;
                    case '8':
                        morseCode += "---..";
                        morseCode += " ";
                        break;
                    case '9':
                        morseCode += "----.";
                        morseCode += " ";
                        break;
                    default:
                        morseCode += ";";
                        break;
                }
            }
        } else {
            String[] morseCodeArray = eingabe.split(" ");
            for (int i=0; i < morseCodeArray.length; i++) {
                switch(morseCodeArray[i]) {
                    case ".-":
                        morseCode += "a";
                        break;
                    case "-...":
                        morseCode += "b";
                        break;
                    case "-.-.":
                        morseCode += "c";
                        break;
                    case "-..":
                        morseCode += "d";
                        break;
                    case ".":
                        morseCode += "e";
                        break;
                    case "..-.":
                        morseCode += "f";
                        break;
                    case "--.":
                        morseCode += "g";
                        break;
                    case "....":
                        morseCode += "h";
                        break;
                    case "..":
                        morseCode += "i";
                        break;
                    case ".---":
                        morseCode += "j";
                        break;
                    case "-.-":
                        morseCode += "k";
                        break;
                    case ".-..":
                        morseCode += "l";
                        break;
                    case "--":
                        morseCode += "m";
                        break;
                    case "-.":
                        morseCode += "n";
                        break;
                    case "---":
                        morseCode += "o";
                        break;
                    case ".--.":
                        morseCode += "p";
                        break;
                    case "--.-":
                        morseCode += "q";
                        break;
                    case ".-.":
                        morseCode += "r";
                        break;
                    case "...":
                        morseCode += "s";
                        break;
                    case "-":
                        morseCode += "t";
                        break;
                    case "..-":
                        morseCode += "u";
                        break;
                    case "...-":
                        morseCode += "v";
                        break;
                    case ".--":
                        morseCode += "w";
                        break;
                    case "-..-":
                        morseCode += "x";
                        break;
                    case "-.--":
                        morseCode += "y";
                        break;
                    case "--..":
                        morseCode += "z";
                        break;
                    case "-----":
                        morseCode += "0";
                        break;
                    case ".----":
                        morseCode += "1";
                        break;
                    case "..---":
                        morseCode += "2";
                        break;
                    case "...--":
                        morseCode += "3";
                        break;
                    case "....-":
                        morseCode += "4";
                        break;
                    case ".....":
                        morseCode += "5";
                        break;
                    case "-....":
                        morseCode += "6";
                        break;
                    case "--...":
                        morseCode += "7";
                        break;
                    case "---..":
                        morseCode += "8";
                        break;
                    case "----.":
                        morseCode += "9";
                        break;
                    case ";":
                        morseCode += " ";
                        break;
                }
            }
        }
        System.out.println(morseCode);
        s.close();
        s2.close();
    }
}
