/**
 *
 * Description
 *
 * @version 1.0 from 21.01.2024
 * @author 
 */

public class Stunde {
  
  private String titel;
  private int uhrzeit;
  private int dauer;
  private String lehrer;
  private String[] schueler;
  
  public Stunde(String titel, int uhrzeit, int dauer, String lehrer, String[] schueler) {
    this.titel = titel;
    this.uhrzeit = uhrzeit;
    this.dauer = dauer;
    this.lehrer = lehrer;
    this.schueler = schueler;
  }  
  
  public String toString() {
    String titel = getTitel();
    String uhrzeit = String.valueOf(getUhrzeit());
    String dauer = String.valueOf(getDauer());
    String lehrer = getLehrer();
    
    String[] liste_schueler = getSchueler();
    String string_schueler = "";
    for (int i=0; i<liste_schueler.length; i++) {
      string_schueler += liste_schueler[i];
    } // end of for
    
    return ("Im "+dauer+"-minütigen "+titel+"unterricht um "+uhrzeit+" Uhr bei dem Lehrer "+lehrer+" sind die Schüler "+string_schueler+" anwesend.");
  }  
  
  
  
  public String getTitel() {
    return titel;
  }
  
  public int getUhrzeit() {
    return uhrzeit;
  }
  
  public int getDauer() {
    return dauer;
  }
  
  public String getLehrer() {
    return lehrer;
  }
  
  public String[] getSchueler() {
    return schueler;
  }  
} // end of class Stunde
