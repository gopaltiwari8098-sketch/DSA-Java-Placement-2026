import java.util.*;

public class commonElements {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr1){
            set.add(x);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int x: arr2){
            if(set.contains(x)){
                result.add(x);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
