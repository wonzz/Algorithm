import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  
        int[] arr = new int[N];
        int temp = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 버블 정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}