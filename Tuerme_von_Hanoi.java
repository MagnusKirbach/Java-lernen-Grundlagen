/**
 *
 * Description
 *
 * @version 1.0 from 11.10.2023
 * @author 
 */

public class Tuerme_von_Hanoi {
  
  public static void main(String[] args) {
    tuerme(3,"start","hilfe","ziel");
  } // end of main
  
  private static void tuerme(int n, String start, String hilfe, String ziel) {
    if (n == 0) {
      return;
    } else {
      tuerme(n-1,start,ziel,hilfe);
      System.out.println("Lege "+start+" zu "+ziel);
      tuerme(n-1,hilfe,start,ziel);
    } // end of if-else
  }  
} // end of class Tuerme_von_Hanoi
