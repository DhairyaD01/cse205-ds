import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int userinp = sc.nextInt();
            arr[i] = Math.abs(userinp);
            
        }
        Arrays.sort(arr);
        
       System.out.println(arr[0]);

    }
}