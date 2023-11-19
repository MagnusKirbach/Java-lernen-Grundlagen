/**
 *
 * Description
 *
 * @version 1.0 from 19.11.2023
 * @author 
 */

import java.util.*;
public class Damenproblem {
  public static final int[][] leeres_array = {{}};
  
  public static void main(String[] args) {
    for (int loesung = 0; loesung < 8; loesung++) {
      //System.out.println(loesung);
      System.out.println(damenproblem(8,8)[loesung]);
    } // end of for
  } // end of main
  
  public static int[][] damenproblem(int reihen, int spalten) {  
    if (reihen <= 0) {
      return leeres_array;
    } else {
      return eine_dame_dazu(reihen-1, spalten, damenproblem(reihen-1, spalten));
    } // end of if-else
  }
  
  public static int[][] eine_dame_dazu(int neue_reihe, int spalten, int[][] vorherige_Loesungen) {
    int[][] neue_loesungen = new int[spalten][];
    
    for (int stelle_loesung = 0; stelle_loesung < vorherige_Loesungen.length; stelle_loesung++) {
      int[] loesung = vorherige_Loesungen[stelle_loesung];
    
      for (int neue_spalte = 0; neue_spalte < spalten; neue_spalte++) {
      
        if (kein_konflikt(neue_reihe, neue_spalte, loesung)) {
          int[] loesung_neue_spalte = new int[loesung.length+1];
          loesung_neue_spalte[loesung.length] = neue_spalte;
          
          neue_loesungen[neue_spalte] = loesung_neue_spalte;
        }  
      } // end of for
    } // end of for
    return neue_loesungen;
  }  
  
  public static boolean kein_konflikt(int neue_reihe, int neue_spalte, int[] loesung) {
    for (int reihe = 0; reihe < neue_reihe; reihe++) {
      
      if (loesung[reihe] == neue_spalte || loesung[reihe] + reihe == neue_spalte + neue_reihe || loesung[reihe] - reihe == neue_spalte - neue_reihe) {
        return false;
      }  
    } // end of for
    return true;
  }  
    
} // end of class Damenproblem

/*
def damenproblem(reihen, spalten):
    if reihen <= 0:
        return [[]] # keine Dame zu setzen; leeres Brett ist Lösung
    else:
        return eine_dame_dazu(reihen - 1, spalten, damenproblem(reihen - 1, spalten))

def eine_dame_dazu(neue_reihe, spalten, vorherige_loesungen):
    neue_loesungen = []
    for loesung in vorherige_loesungen:        
        for neue_spalte in range(spalten):
            # print('Versuch: %s in Reihe %s' % (neue_spalte, neue_reihe))
            if kein_konflikt(neue_reihe, neue_spalte, loesung):
                neue_loesungen.append(loesung + [neue_spalte])
    return neue_loesungen

def kein_konflikt(neue_reihe, neue_spalte, loesung):
    for reihe in range(neue_reihe):
        if (loesung[reihe]         == neue_spalte              or  # gleiche Spalte
            loesung[reihe] + reihe == neue_spalte + neue_reihe or  # gleiche Diagonale
            loesung[reihe] - reihe == neue_spalte - neue_reihe):   # gleiche Diagonale
                return False
    return True

for loesung in damenproblem(8, 8):
    print(loesung)
*/