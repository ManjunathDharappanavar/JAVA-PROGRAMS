package star_pattern;

import star_pattern.myutils.input;

public class desecdingtriangle {
    public static void main(String[] args) {
        // using a custome made pakage for reducing cryptic code of getting user input
        int n = input.readInt("enter a number: ");
        
        for(int i = 0; i<=n; i++){
            for(int j = i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
