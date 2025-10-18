import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int n, sum = 0, avg = 0, count = 0;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("Get sum until entered 0");
            System.out.println("enter a number: ");
            n = s.nextInt();

            if(n < 0){
                continue;
            }

            if(n != 0){
                sum += n;
                count++;
            }
        } while (n != 0);
        // finding avg 
        avg = sum / count;

        System.out.println("The Sum is : "+sum);
        System.out.println("The avg is: "+avg);
        s.close();
    }
}
