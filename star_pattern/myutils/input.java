package star_pattern.myutils;

import java.util.Scanner;

public class input {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
}
