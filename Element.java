/**
 *
 * Description
 *
 * @version 1.0 from 11.10.2023
 * @author 
 */

class Element {
  public int value;
  public Element next;
  
  public Element(int i, Element n) {
    value = i;
    next = n;
  }  
  
  public Element getNaechster() {
    if (next != null) {
      return next;
    }
    return null;
  }
  
  public Element getLetzter() {
    Element akt = this;
    while (akt.next != null) { 
      akt = akt.next;
    } // end of while
    return akt;
  }

} // end of class Element
