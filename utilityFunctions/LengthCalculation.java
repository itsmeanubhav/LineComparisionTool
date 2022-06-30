package utilityFunctions;

import java.util.Scanner;

public class LengthCalculation {

    static double length;
    public static double lineLength(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X Co Ordinate for first line");
        int x1 = scan.nextInt();
        System.out.println("Enter Y Co Ordinate for first line");
        int y1 = scan.nextInt();
        System.out.println("Enter X Co Ordinate for Second line");
        int x2 = scan.nextInt();
        System.out.println("Enter Y Co Ordinate for Second line");
        int y2 = scan.nextInt();

        length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return length;
    }
}
