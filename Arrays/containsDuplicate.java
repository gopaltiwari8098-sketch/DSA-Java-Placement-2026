import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean duplicate = false;

        for(int x : arr){
            if(set.contains(x)){
                duplicate = true;
                break;
            }
            set.add(x);
        }
        System.out.println(duplicate);
        sc.close();
    }
}