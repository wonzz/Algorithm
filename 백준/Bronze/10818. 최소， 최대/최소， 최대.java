import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int score = scanner.nextInt();
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }
        System.out.println(min + " " + max);
        
        scanner.close();
    }
}
