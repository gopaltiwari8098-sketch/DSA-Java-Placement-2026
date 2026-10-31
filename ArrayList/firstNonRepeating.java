
import java.util.*;

public class firstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : list) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : list) {
            if (map.get(x) == 1) {
                System.out.println(x);
                sc.close();
                return;
            }
        }

        System.out.println(-1);

        sc.close();
    }
}
