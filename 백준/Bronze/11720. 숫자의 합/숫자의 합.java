import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();       
        String nums = scanner.next();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums.charAt(i) - '0';
        }

        System.out.println(sum);  
        scanner.close();
    }
}
