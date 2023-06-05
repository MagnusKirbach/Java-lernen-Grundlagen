import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

import javax.lang.model.element.Element;
class Schlange {
    public static void main (String [] args) {
        System.out.print("Wie lang soll die Schlange sein? ");
        Scanner s = new Scanner(System.in);
        int elemente = s.nextInt();
        s.reset();

        Queue<String> queue = new LinkedList<String>();

        for(int auftrag=0; auftrag < elemente; auftrag++) {
            System.out.print((auftrag+1)+"ster Auftrag in der Schlange (wird als String behandelt): ");
            queue.add(s.next());
        }
        for (int auftrag_position=0; auftrag_position < elemente; auftrag_position++) {
            System.out.println((auftrag_position+1)+"ster Auftrag wird bearbeitet: "+queue.peek());
            queue.remove();
        }

    }
}