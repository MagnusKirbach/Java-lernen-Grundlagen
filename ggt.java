public class ggt {
    public static void main(String[] args) {
        System.out.println(ggt(12, 18));
        System.out.println(kgV(12, 18));
    }

    public static int ggt(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            while(b != 0) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            return a;
        }
    }

    public static int kgV(int a, int b) {
        return a * b / ggt(a, b);
    }
}
