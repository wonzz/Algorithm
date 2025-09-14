import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int[] alphaIndex = new int[26];

        for (int i = 0; i < 26; i++) {
            alphaIndex[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';

            if (alphaIndex[index] == -1) {
                alphaIndex[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphaIndex[i] + " ");
        }

        sc.close();
    }
}
