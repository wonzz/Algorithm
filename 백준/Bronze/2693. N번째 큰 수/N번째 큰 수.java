import java.util.Scanner;

public class Main {

    public static void bubbleDescend(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int[] arr = new int[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleDescend(arr);

            System.out.println(arr[2]);
        }

        sc.close();
    }
}
