import java.util.*;

public class leaders {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int maxRight = arr[n-1];
        System.out.print(maxRight + " ");

        for(int i=n-2; i>=0; i--){

            if(arr[i] > maxRight){
                System.out.print(arr[i] + " ");
                maxRight = arr[i];
            }
        }
        sc.close();
    }
}
