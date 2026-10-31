
import java.util.*;

public class elementsGreaterThanX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int X = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int x : arr) {
            if (x > X) {
                result.add(x);
            }
        }

        System.out.println(result);

        sc.close();
    }
}
