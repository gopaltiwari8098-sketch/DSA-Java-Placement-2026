import java.util.*;

public class reverseArrayList {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int left = 0;
        int right = n - 1;

        ArrayList<Integer> arr = new ArrayList<>();

        while(left < right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            left++;
            right--;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
