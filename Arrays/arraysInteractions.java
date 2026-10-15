import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> result = new HashSet<>();

        for (int x : arr2) {

            if (set.contains(x) && !result.contains(x)) {
                System.out.print(x + " ");
                result.add(x);
            }
        }

        sc.close();
    }
}