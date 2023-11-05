/**
 *
 * Description
 *
 * @version 1.0 from 05.11.2023
 * @author 
 */

public class Suche_im_Labyrinth {
  static String[][] labyrinth = { {"W"," ","W"}, {"W"," ","W"}, {"W","A","W"} };
  static String[][] besucht_labyrinth = { {" "," "," "}, {" "," "," "}, {" "," "," "} }; 
  
  public static void main(String[] args) {     
    System.out.println(sucheAusgang(1,1));
  } // end of main
  
  private static boolean sucheAusgang(int x, int y) {
    for (int i=0; i<2; i++) {
      int stelle = (int) Math.round(Math.pow(-1,i));
      
      if (labyrinth[x+stelle][y] == " ") {
        besucht_labyrinth[x+stelle][y] = "B";
        if (labyrinth[x+stelle][y] == "A") {
          return true;
        } else {
          boolean ausgang_h = sucheAusgang(x+stelle,y);
          if (ausgang_h == true) {
            return true;
          } else {
            besucht_labyrinth[x+stelle][y] = "S";
          } // end of if-else         
        } // end of if-else
      }
      
      if (labyrinth[x][y+stelle] == " ") {
        besucht_labyrinth[x][y+stelle] = "B";
        if (labyrinth[x][y+stelle] == "A") {
          return true;
        } else {
          boolean ausgang_v = sucheAusgang(x,y+stelle);
          if (ausgang_v == true) {
            return true;
          } else {
            besucht_labyrinth[x][y+stelle] = "S";
          } // end of if-else         
        } // end of if-else
      }  
    } // end of for
    return false;
  }  

} // end of class Suche_im_Labyrinth
