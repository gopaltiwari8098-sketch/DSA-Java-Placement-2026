import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1); 
        }
        System.out.println(map);

        for(int x : arr){
            System.out.print(map.get(x) + " ");
        }

        sc.close();
    }
}