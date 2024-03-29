import java.util.ArrayList;
import java.util.Arrays;
 
public class SudoSolver {
   
  /*
   * Löst ein 9x9 Sudoku
   */
  
  public static void main(String[] args) {
    int[][] sudo = {{1, 0, 0, 6, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 0, 0, 9, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 0, 0, 0, 1, 0},
                {0, 4, 0, 0, 5, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 6, 0, 9, 0},
                {0, 0, 2, 0, 0, 0, 7, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 8, 0},
                {3, 0, 0, 5, 0, 0, 0, 0, 9}};
    for (int i = 0; i < sudo.length; i++) {
      for (int j = 0; j < sudo[i].length; j++) {
        System.out.print(sudo[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("------------------------");
    boolean bool = new SudoSolver().solve(sudo);
    if (bool) {
      for (int i = 0; i < sudo.length; i++) {
        for (int j = 0; j < sudo[i].length; j++) {
          System.out.print(sudo[i][j] + " ");
        }
        System.out.println();
      }
    } else {
      System.out.println("Ungültige Vorgabe");
    }
  }
  
  public boolean solve(int[][] field) {
 
    if (!checkSudo(field)) {
      finishSudo(field);
      return false;
    }
    boolean solved = solve(field, 0, 0);
    finishSudo(field);
    return solved;
  }
 
  /*
   * Testet, ob die Vorgabe Fehler enthält und verändert ein Sudoku so, dass 
   * später erkannt werden kann, welche Zahlen vorgegeben waren und welche 
   * vom Solver gesetzt wurden. Dazu werden alle bereits gefüllten Felder negiert.
   */
  private boolean checkSudo(int[][] field) {
     
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        if (field[i][j] > 0) {
          int temp = field[i][j];
          field[i][j] = 0;
          if (Arrays.binarySearch(getPossible(field, j, i), temp) < 0) {
            field[i][j] = temp;
            return false;
          }
          field[i][j] = temp * -1;
        }
      }
    }
    return true;
  }
   
  /*
   * Rekursive Methode um ein Sudoku zu lösen
   */
  private boolean solve(int[][] field, int y, int x) {
 
    int[] poss = null;
    int x2 = x + 1;
    int y2 = y;
    if (field[x][y] == 0) {
      poss = getPossible(field, y, x);
      if (poss.length == 0) {
        return false;
      }
      field[x][y] = poss[0];
    }
    if (x2 >= field.length) {
      x2 = 0;
      y2++;
    }
    if (y2 >= field[x].length) {
      return true;
    }
    while (!solve(field, y2, x2)) {
      if (poss == null) {
        return false;
      }
      else {
        poss = remove(field[x][y], poss);
        if (poss.length == 0) {
          field[x][y] = 0;
          return false;
        }
        field[x][y] = poss[0];
      }
    }
    return true;
  }
 
  /*
   * Entfernt eine Zahl aus einem int-Array
   */
  private int[] remove(int number, int[] arr) {
 
    int[] array = new int[arr.length - 1];
    for (int i = 0, j = 0; i < arr.length; i++, j++) {
      if (arr[i] != number) {
        array[j] = arr[i];
      } 
      else {
        j--;
      }
    }
    return array;
  }
 
  /*
   * Gibt alle möglichen Zahlen für das übergebene Feld an der übergebenen
   * Position zurück
   */
  private int[] getPossible(int[][] field, int y, int x) {
 
    ArrayList<Integer> poss = new ArrayList<Integer>();
    int quadStartX = (int) (x / 3) * 3;
    int quadStartY = (int) (y / 3) * 3;
    for (int i = 1; i < 10; i++) {
      poss.add(i);
    }
    for (int i = 0; i < field.length; i++) {
      poss.remove(new Integer(Math.abs(field[x][i])));
      poss.remove(new Integer(Math.abs(field[i][y])));
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        poss.remove(new Integer(Math.abs(field[i + quadStartX][j + quadStartY])));
      }
    }
    int[] val = new int[poss.size()];
    for (int i = 0; i < val.length; i++) {
      val[i] = poss.get(i);
    }
    return val;
  }
   
  /*
   * Macht die Änderungen von checkSudo wieder Rückgängig
   */
  private void finishSudo(int[][] field) {
     
    for (int i = 0; i < field.length; i++) {
      for (int j = 0; j < field.length; j++) {
        if (field[i][j] < 0) {
          field[i][j] = field[i][j] * -1;
        }
      }
    }
  }
}