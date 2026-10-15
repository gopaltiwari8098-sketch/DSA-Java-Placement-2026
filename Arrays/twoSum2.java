import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();

            int required = target - x;

            if (set.contains(required)) {
                System.out.println("YES");
                sc.close();
                return;
            }

            set.add(x);
        }

        System.out.println("NO");
        sc.close();
    }
}