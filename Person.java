/**
 *
 * Description
 *
 * @version 1.0 from 21.01.2024
 * @author 
 */

public abstract class Person {
  
  private String ID;
  private String name;
  private String vorname;
  private int alter;
  private boolean status_krank;
  
  public Person(String ID, String name, String vorname, int alter, boolean status_krank) {
    this.ID = ID;
    this.name = name;
    this.vorname = vorname;
    this.alter = alter;
    this.status_krank = status_krank;
  }  
  
  public void istKrank(boolean krank) {
    if (krank == true) {
      status_krank = true;
    } else {
      status_krank = false;
    } // end of if-else
  }  
  
  public String getID() {
    return ID;
  } 
  
  public String getName() {
    return name;
  }
  
  public String getVorname() {
    return vorname;
  }
  
  public int getAlter() {
    return alter;
  }
  
  public boolean getStatusKrank() {
    return status_krank;
  }
  
  
  
  

} // end of class Person
