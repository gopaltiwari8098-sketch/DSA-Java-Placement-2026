import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i<n; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
        sc.close();
    }
}