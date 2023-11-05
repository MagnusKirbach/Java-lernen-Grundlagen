/**
 *
 * Description
 *
 * @version 1.0 from 11.10.2023
 * @author 
 */

class Schlange {
  
  private Element kopf;
  
  public Schlange() {
    kopf = null;
  }  
  
  public void add(int n) {
    Element e = new Element(n, null);
    
    if (!isEmpty()) {
      kopf.getLetzter().next = e;
    } else {
      kopf = e;
    } // end of if-else
  }
  
  public int pop() {
    if (!isEmpty()) {
      int v = kopf.value;
      kopf = kopf.value;
      return v;
    }
    return null;          
  }
  
  public int peek() {
    if (!isEmpty()) {
      return kopf.value;
    } else {
      return 0;
    } // end of if-else
  }
  
  public boolean isEmpty() {
    return kopf == null;
  }        
    
} // end of class Schlange
