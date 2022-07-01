import utilityFunctions.LengthCalculation;
import utilityFunctions.LengthComparision;

public class LineComparisionTool {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        System.out.println("Enter the Co Ordinates of 1st Line");
        String length1 = Integer.toString((int) LengthCalculation.lineLength());  //Converting double to integer and integer to String using type Casting

        System.out.println("Enter the Co Ordinates of 2nd Line");
        String length2 = Integer.toString((int)LengthCalculation.lineLength());  //Converting double to integer and integer to String using type Casting

        LengthComparision lengthCompare = new LengthComparision(); //Creating Object For LengthComparision Class
        lengthCompare.lengthDifference(length1, length2); //calling lengthDifference Mehtod
    }
}
