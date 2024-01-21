/**
 *
 * Description
 *
 * @version 1.0 from 21.01.2024
 * @author 
 */

public class Main {
  
  public static void main(String[] args) {
    
    String[] schueler_liste = {"Hagen", "Magnus", "Marvin"};
    
    Schueler magnus = new Schueler("S1","Kirbach","Magnus",18,true);
    Schueler hagen = new Schueler("S2","Jacob","Hagen",18,false);
    Schueler marvin = new Schueler("S3","Heyne","Marvin",18,false);
    
    Lehrer suepke = new Lehrer("L1","Süpke","Johannes",35,false);
    Lehrer flock = new Lehrer("L2","Flock","Detlev",50,true);
    
    //System.out.println(magnus.toString());
    
    
    
    Stunde info = new Stunde("Informatik",12,90,"Herr Süpke",schueler_liste);
    System.out.println(info.toString());
  } // end of main

} // end of class Main
