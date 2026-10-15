import java.util.*;

public class unionOfArrays {
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

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(arrA[i]);
        }

        for(int i=0; i<m; i++){
            set.add(arrB[i]);
        }

        for(int x : set){
            System.out.print(x + " ");  
        }

        sc.close();
    }
}
