import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int H = sc.nextInt(); 
            int W = sc.nextInt(); 
            int N = sc.nextInt();

            int f = N % H;
            int r = N / H + 1;

            if (f == 0) {
                f = H;
                r -= 1;
            }

            System.out.println(f * 100 + r);
        }

        sc.close();
    }
}
