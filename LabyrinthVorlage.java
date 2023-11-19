class LabyrinthVorlage{
  
  public static final int ausgangX = 5; // x-Koordinate des Ausgangs
  public static final int ausgangY = 0; // y-Koordinate des Ausgangs
  public static final char[][] labyrinth = { // Labyrinth; 'W' = Wand, ' ' = freier Gang, '_' = Sackgasse, '.' = Lösungsweg
  {'W', 'W', 'W', 'W', 'W', ' ', 'W', 'W', 'W', 'W', 'W'},
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

  public static final int richtungenDX[] = {1, 0, -1, 0}; // Feld für alle x-Richtungen
  public static final int richtungenDY[] = {0, -1, 0, 1}; // Feld für alle y-Richtungen
  
  // Backtracking-Algorithmus zum Suchen des Ausgangs, x und y sind die Koordinaten des aktuellen Feldes
  public static boolean sucheAusgang(int x, int y) {
    // Ergänzen
  }
  
  // markiert das aktuelle Feld als ein Feld des Lösungsweges  
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