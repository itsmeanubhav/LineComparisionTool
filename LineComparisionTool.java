import utilityFunctions.LengthCalculation;
import utilityFunctions.LengthComparision;

public class LineComparisionTool {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        //UC - 1
        System.out.println(LengthCalculation.lineLength());

        //UC - 2
        System.out.println("Enter the Co Ordinates of 1st Line");
        double length1 = LengthCalculation.lineLength();

        System.out.println("Enter the Co Ordinates of 2nd Line");
        double length2 = LengthCalculation.lineLength();

        LengthComparision.lengthComparision(length1,length2);

        int compare = length1.compareTo(length2);

    }
}
