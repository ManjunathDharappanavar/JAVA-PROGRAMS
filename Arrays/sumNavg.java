import java.util.Scanner;
public class sumNavg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int[50];
        int n, sum = 0, avg = 0;
        System.out.println("How many no. of elements you want?");
        n = s.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("get array element"+i+" :");
            arr[i] = s.nextInt();
            
        }

        System.out.print("[");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+",");
            sum += arr[i];
        }
        System.out.println("]");

        avg = (sum/n);

        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);

        
    }
}
