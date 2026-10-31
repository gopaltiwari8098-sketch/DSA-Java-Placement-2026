import java.util.*;

public class findElementAtIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int index = sc.nextInt();

        if (index >= 0 && index < arr.size()) {
            int value = arr.get(index);
            System.out.println(value);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}