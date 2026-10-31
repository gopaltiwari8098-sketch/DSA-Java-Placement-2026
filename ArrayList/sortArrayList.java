
import java.util.*;

public class sortArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr, Collections.reverseOrder());

        System.out.println(arr);

        sc.close();
    }
}
