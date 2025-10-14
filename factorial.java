import java.util.Scanner;;
public class factorial {
    public static void main(String[] args){
        int num, f = 1;
        Scanner s = new Scanner(System.in);

        System.out.println("Program to find factorial: ");
        System.out.println("Enter a number: ");
        num = s.nextInt();
        
        for(int i = 1; i<=num; i++){
            f *= i;
        }

        System.out.println("Factorial of "+num+" is "+f);

        s.close();
    }
}
