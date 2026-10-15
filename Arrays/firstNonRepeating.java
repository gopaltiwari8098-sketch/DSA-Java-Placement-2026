import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Pass 1: Frequency count
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Pass 2: Find first non-repeating element
        boolean found = false;

        for (int x : arr) {
            if (map.get(x) == 1) {
                System.out.println(x);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(-1);
        }

        sc.close();
    }
}