import java.util.*;

class missingNumber {                       
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        int expected = n * (n + 1) / 2;

        System.out.println(expected - sum);
        sc.close();
    }
}