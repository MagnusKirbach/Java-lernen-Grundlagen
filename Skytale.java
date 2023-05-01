class Skytale {
    public static void main (String [] args) {
        /*
        String[] array = new String[10];
        String[][] zweidimensional = new String[5][10];

        //füllen von Arrays:
        array[0] = "bla";
        array[1] = "blubb";
        zweidimensional[0][1] = "bla2";

        //Zugriffe auf Arrays:
        String s = array[1];
        String s2 = zweidimensional[0][1];
        */

        String text = "Thomas";
        
        int spaltenZahl = 2;
        
        int zeilenZahl = (text.length() / spaltenZahl) + 1;
        
        char[][] zweidimensional = new char[spaltenZahl][zeilenZahl];
        
        int textPosition = 0;
        for (int spalte = 0; spalte < zweidimensional.length; spalte++) {
            for (int zeile = 0; zeile < zweidimensional[spalte].length; zeile++) {
                
                if(textPosition >= text.length()) {
                    break;
                }
              zweidimensional[spalte][zeile] = text.charAt(textPosition);
              textPosition++;
            }
            
            if(textPosition >= text.length()) {
                break;
            }
         }
        
         String verschluesselt = "";
         for (int zeile = 0; zeile < zweidimensional[0].length; zeile++) {
             for (int spalte = 0; spalte < zweidimensional.length; spalte++) {
 
                 verschluesselt += zweidimensional[spalte][zeile];
             }
 
          }
         
         System.out.println(verschluesselt);
        
         textPosition = 0;
         for (int zeile = 0; zeile < zweidimensional[0].length; zeile++) {
             for (int spalte = 0; spalte < zweidimensional.length; spalte++) {
                 
                 if(textPosition > text.length()) {
                     break;
                 }
               zweidimensional[spalte][zeile] = verschluesselt.charAt(textPosition);
               textPosition++;
             }
             
             if(textPosition > text.length()) {
                 break;
             }
          }
        
          String entschluesselt = "";
          for (int spalte = 0; spalte < zweidimensional.length; spalte++) {
              for (int zeile = 0; zeile < zweidimensional[spalte].length; zeile++) {
  
                  entschluesselt += zweidimensional[spalte][zeile];
              }
  
           }
          
          System.out.println(entschluesselt);
    }
}
