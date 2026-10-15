
import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int x : arr) {
            if (!seen.contains(x)) {
                seen.add(x);
                result.add(x);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
