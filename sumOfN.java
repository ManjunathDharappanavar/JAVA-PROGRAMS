import java.util.Scanner;
public class sumOfN {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner s = new Scanner(System.in);

        System.out.println("SUM OF N NUMBERS:");
        System.out.println("enter a number: ");
        n = s.nextInt();

        int i = 0;
        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("The sum of "+n+" is "+sum);

        s.close();
    }
}
