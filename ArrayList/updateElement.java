import java.util.*;

public class updateElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();
        int newValue = sc.nextInt();

        if(k >= 0 && k < list.size()){
            list.set(k, newValue);
            System.out.println(list);
        }else{
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
