import java.util.*;

public class majorityElements {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0) + 1);

            if(map.get(x) > n/2){
                System.out.println(x);
                sc.close();
                return;
            }
        }

        System.out.println(-1);
        sc.close();
    }
    
}
