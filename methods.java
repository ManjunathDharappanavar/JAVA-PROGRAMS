import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("enter a number: ");
        n = s.nextInt();
        
        // System.out.println("Factorial: "+factorial(n));

        // System.out.println("prime check: "+(isPrime(n) ? "prime" : "not prime"));

        // System.out.println("sum of digits: "+sumOfDigits(n));

        // Armstrong number
        System.out.println(isArmstrong(n));
        s.close();
    }   
    
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f *= i;
            // f = f * i
            // 1 * 2 * 3 * 4 * 5 = 120
        }

        return f;
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        else{
            for(int i = 2; i<n; i++){
                if(n % i == 0){
                    return false;
                }
                
            }

            return true;
        }
    }

    public static int sumOfDigits(int n){
        int temp = n, sum = 0;
        
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        
        return sum;
    }

    public static boolean isArmstrong(int n){
        int arm_sum = 0, temp = n;
        int digits = String.valueOf(n).length();
        while(temp > 0){
            arm_sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }

        if(n == arm_sum){
            return true;
        }
        else{
            return false;
        }

    }
}
