
import java.util.*;

public class removeElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) == target) {
                arr.remove(i);
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
