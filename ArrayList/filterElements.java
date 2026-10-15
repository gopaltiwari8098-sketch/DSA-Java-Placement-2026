import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();

            if(x % 2 == 0){
                result.add(arr[i]);
            }
        }

        for(int x : result){
            System.out.print(x + " ");
        }
        sc.close();
    }
}