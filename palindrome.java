import java.util.Scanner;;
public class palindrome {
    public static void main(String[] args) {
        int n, rev = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Palindrome of a number:");
        System.out.println("enter a numebr: ");
        n = s.nextInt();
        int temp = n;

        while(temp>0){
            rev = rev * 10 + temp % 10;
            temp = temp/10;
        }

        System.out.println("The reverse of "+n+" is "+rev);

        if(n == rev){
            System.out.println("The given number is PALINDROME");
        }
        else{
            System.out.println("The given number is NOT PALINDROME");
        }

        s.close();
    }
}
