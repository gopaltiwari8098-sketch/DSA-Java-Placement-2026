import java.util.*;

public class mergeTwoSortedArrays {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arrA = new int[n];
        int[] arrB = new int[m];

        for(int i=0; i<n; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            arrB[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        while(i<n && j<m){

            if(arrA[i] < arrB[j]){
                System.out.print(arrA[i] + " ");
                i++;
            }
            else{
                System.out.print(arrB[j] + " ");
                j++;
            }
        }

        while(i<n){
            System.out.print(arrA[i] + " ");
            i++;
        }

        while(j<m){
            System.out.print(arrB[j] + " ");
            j++;
        }

        sc.close();
    }
}
