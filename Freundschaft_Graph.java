import java.util.*;
class Freundschaft_Graph {
    public static void main (String [] args) {
        String[][] graph = {{"Mika","Olga"},{"Hans","Olga"},{"Mika","Hans"},{"Ute","Tina","Jan"},{"Marc"},{"Marc","Tina"},{"Marc","Jan","Sue","Max"},{"Lilli","Tina"},{"Sue","Elisa"},{"Tina","Kai","Leo"},{"Lilli","Kai"},{"Elisa","Max"},{"Max"}};
        System.out.print("Bitte Nummer der Person eingeben (Hans 1, Mika 2, Olga 3, Marc 4, Ute 5, Jan 6, Tina 7, Sue 8, Lilli 9, Max 10, Elisa 11, Kai 12, Leo 13): ");
        Scanner s = new Scanner(System.in);
        int name = s.nextInt();
        List<String> direkte_Freunde = new ArrayList<String>(graph[name-1].length);

        for (int stelle=0; stelle< graph[name-1].length; stelle++) {
            direkte_Freunde.add(graph[name-1][stelle]);
        }
        System.out.println("Direkte Freunde von "+name+": "+direkte_Freunde.toString());
    }
}