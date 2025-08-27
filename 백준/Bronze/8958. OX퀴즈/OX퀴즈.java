import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 
        sc.nextLine(); 

        for (int t = 0; t < T; t++) {
            String line = sc.nextLine();
            int score = 0;
            int add = 0;

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'O') {
                    add++;
                    score += add;
                } else {
                    add = 0; 
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
