/**
 *
 * Description
 *
 * @version 1.0 from 21.01.2024
 * @author 
 */

import java.util.*;
public class Schueler extends Person{
  
  private final int[] NOTEN = {1,2,3,4,5,6};
    
  
  public Schueler(String ID, String name, String vorname, int alter, boolean status_krank) {
    super(ID, name, vorname, alter, status_krank);
  }
  
  public String toString() {
    String ID = getID();
    String name = getName();
    String vorname = getVorname();
    String alter = String.valueOf(getAlter());
    String status_krank;
    if (getStatusKrank() == true) {
      status_krank = "ist";
    } else {
      status_krank = "ist nicht";
    } // end of if-else
    
    return ("Der Schüler "+vorname+" "+name+" mit der ID "+ID+" und dem Alter "+alter+" "+status_krank+" krank.");
  }  
} // end of class Schueler
