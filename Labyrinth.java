/**
 *
 * Description
 *
 * @version 1.0 from 19.11.2023
 * @author 
 */

class Labyrinth{
  
  public static final int ausgangX = 1; // x-Koordinate des Ausgangs
  public static final int ausgangY = 0; // y-Koordinate des Ausgangs
  public static final char[][] labyrinth = { // Labyrinth; 'W' = Wand, ' ' = freier Gang, '_' = Sackgasse, '.' = L�sungsweg
  {'W', ' ', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
  {'W', ' ', ' ', ' ', 'W', ' ', 'W', ' ', ' ', ' ', 'W'},
  {'W', ' ', 'W', 'W', 'W', ' ', ' ', ' ', 'W', ' ', 'W'},
  {'W', ' ', 'W', ' ', 'W', 'W', 'W', 'W', 'W', ' ', 'W'},
  {'W', ' ', 'W', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'W'},
  {'W', ' ', 'W', 'W', ' ', 'W', 'W', ' ', 'W', 'W', 'W'},
  {'W', ' ', ' ', 'W', ' ', ' ', ' ', ' ', ' ', ' ', 'W'},
  {'W', ' ', 'W', 'W', ' ', 'W', 'W', 'W', 'W', ' ', 'W'},
  {'W', ' ', ' ', ' ', ' ', ' ', 'W', ' ', 'W', ' ', 'W'},
  {'W', ' ', 'W', 'W', 'W', ' ', 'W', ' ', 'W', ' ', 'W'},
  {'W', ' ', 'W', ' ', ' ', ' ', 'W', ' ', 'W', ' ', 'W'},
  {'W', ' ', 'W', ' ', 'W', ' ', 'W', ' ', ' ', ' ', 'W'},
  {'W', 'W', 'W', 'W', 'W', ' ', 'W', 'W', 'W', 'W', 'W'}};

  public static final int richtungenDX[] = {1, 0, -1, 0}; // Feld f�r alle x-Richtungen
  public static final int richtungenDY[] = {0, -1, 0, 1}; // Feld f�r alle y-Richtungen
  
  // Backtracking-Algorithmus zum Suchen des Ausgangs, x und y sind die Koordinaten des aktuellen Feldes
  public static boolean sucheAusgang(int x, int y) {
    for (int i=0; i<4; i++) {
      // Durchprobieren aller 4 benachbarten Felder
      int y1 = y + richtungenDY[i];   
      int x1 = x + richtungenDX[i];
      // wenn der n�chste Schritt auf ein freies Feld f�hrt, dann...
      if ( freierPlatz(x1, y1) ) {
        erweitereLoesung(x1, y1);  // schreibe ins Labyrinth, dass es sich um einen g�ltigen Zug handelt
        // wenn der Ausgang damit noch nicht gefunden wurde, dann...
        if ( ! ausgangGefunden(x1, y1) ) {
          // suche weiter durch rekursiven Aufruf. Wenn dabei der Ausgang gefunden wurde, dann...
          if ( sucheAusgang(x1, y1) ) {
            return true;               // antworte an die vorhergehende Ebene, dass der Zug zur L�sung f�hrte
          } else {
            // sonst mache den Schritt r�ckg�ngig (markiere ihn als Sackgasse)
            alsSackgasseMarkieren(x1,y1);
          }
        } else {
          return true; // wenn der Ausgang gefunden wurde, antworte true
        }
      }
    }
    return false;   // wenn alle vier m�glichen Schritte nicht zum Ausgang f�hren, antworte an die vorhergehende Ebene, dass der letzte Schritt nicht zum Ausgang f�hrt
  }
  
  // markiert das aktuelle Feld als ein Feld des L�sungsweges  
  public static void erweitereLoesung(int x, int y) {
    labyrinth[y][x] = '.';
  }

  // markiert das aktuelle Feld als ein Weg in eine Sackgasse  
  public static void alsSackgasseMarkieren(int x1, int y1) {
    labyrinth[y1][x1] = '_';
  }

  // antwortet true, wenn das aktuelle Feld der Ausgang ist, sonst false
  public static boolean ausgangGefunden(int x, int y) {
    return x == ausgangX && y == ausgangY;
  }

  // antwortet true, wenn x und y innerhalb des Labyrinths liegen und das Feld mit ' ' markiert ist, sonst false
  public static boolean freierPlatz(int x, int y) {
    return 0 <= y && y < labyrinth.length && 0 <= x && x < labyrinth[y].length && ( labyrinth[y][x] == ' ');
  }

  // gibt das Labyrinth auf dem Bildschirm aus
  public static void ausgabe(){
    for (int i = 0; i < labyrinth.length; ++i) {
      for (int j = 0; j < labyrinth[0].length ; ++j) {
        System.out.print(labyrinth[i][j]);
      } // end of for
      System.out.println();
    } // end of for
    System.out.println();
    System.out.println();
  }  
  
  public static void main(String[] args){
    ausgabe();
    sucheAusgang(5,12);
    ausgabe();
  }  
  
}  