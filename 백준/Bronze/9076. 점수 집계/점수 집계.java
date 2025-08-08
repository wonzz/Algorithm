import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int[] scores = new int[5];

            for (int i = 0; i < 5; i++) {
                scores[i] = sc.nextInt();
            }

            for (int i = 0; i < scores.length - 1; i++) {
                for (int j = 0; j < scores.length - 1 - i; j++) {
                    if (scores[j] > scores[j + 1]) {
                        int temp = scores[j];
                        scores[j] = scores[j + 1];
                        scores[j + 1] = temp;
                    }
                }
            }

            int sum = scores[1] + scores[2] + scores[3];

            if (scores[3] - scores[1] >= 4) {
                System.out.println("KIN");
            } else {
                System.out.println(sum);
            }
        }

        sc.close();
    }
}
