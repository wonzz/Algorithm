import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> remains = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int remain = num % 42;
            remains.add(remain); // 중복되지 않는 나머지
        }

        System.out.println(remains.size());
    }
}
