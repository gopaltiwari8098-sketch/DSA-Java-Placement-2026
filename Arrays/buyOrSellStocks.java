import java.util.*;

public class buyOrSellStocks {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i=1; i<n; i++){

            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            minPrice = Math.min(minPrice, arr[i]);
        }
        System.out.println(maxProfit);
        sc.close();
    }
}
