import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num to get is remainder: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println("the remainder is : "+(n1%n2));
    }
}
