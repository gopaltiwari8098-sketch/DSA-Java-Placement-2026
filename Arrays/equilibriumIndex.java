
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = 0;

        for (int x : arr) {
            total += x;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                sc.close();
                return;
            }

            leftSum += arr[i];
        }

        System.out.println(-1);

        sc.close();
    }
}
