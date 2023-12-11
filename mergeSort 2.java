import java.util.Arrays;

public class mergeSort {


    public static int[] mergesort(int[] l){
        if (l.length <= 1){
            return l;
        }

        int l_length = l.length;
        int[] l_links = new int[l_length / 2];
        int[] l_rechts = new int[l_length - l_length / 2];

        for (int i = 0; i < l_length / 2; i++){
            l_links[i] = l[i];
        }

        for (int i = l_length / 2; i < l.length; i++){
            l_rechts[i - l_length / 2] = l[i];
        }

        l_links = mergesort(l_links);
        l_rechts = mergesort(l_rechts);

        return mische(l_links, l_rechts);

    }

    public static int[] mische(int[] l1, int[] l2){
        int total_length = l1.length + l2.length;
        int[] l_neu = new int[total_length];
        // i trackt l1, j trackt l2, k ist Zahl der Gesamtdurchläufe
        int i = 0, j = 0, k = 0;
    
        while (i < l1.length && j < l2.length) {
            if (l1[i] <= l2[j]) {
                l_neu[k++] = l1[i++];
            } else {
                l_neu[k++] = l2[j++];
            }
        }
    
        // falls Elemente in l1 und l2 übrig geblieben sind
        while (i < l1.length) {
            l_neu[k++] = l1[i++];
        }
    
        while (j < l2.length) {
            l_neu[k++] = l2[j++];
        }
        return l_neu;
    }
    


    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 6, 2, 8};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
