public class pengulangan6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d;
        System.out.print(b + " ");
        System.out.print(c + " ");
        while (true) {
            d = a + b + c;
            if (d > 81) break;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}
