package utilityFunctions;

import java.util.Scanner;

public class LengthCalculation {

    static double length;
     /*
        Use-Case 1 Logic for Calculating Length of Line
        Taking Coordinate inputs from User To CALCULATE Length of the Line
     */
    public static double lineLength(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X Co Ordinate for first Point");
        int x1 = scan.nextInt();
        System.out.println("Enter Y Co Ordinate for first Point");
        int y1 = scan.nextInt();
        System.out.println("Enter X Co Ordinate for Second Point");
        int x2 = scan.nextInt();
        System.out.println("Enter Y Co Ordinate for Second Point");
        int y2 = scan.nextInt();
        length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return length;
    }
}
