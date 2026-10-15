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

        int maxLength = 0;

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int current = x;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println(maxLength);

        sc.close();
    }
}