import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        bubbleSort(num);

        System.out.println(sum / 5); //평균
        System.out.println(num[2]);  //중앙값

        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;  
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
