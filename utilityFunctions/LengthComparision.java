package utilityFunctions;

/*
        Use-Case 2 Logic for Checking The length of 2 lines Using equals Metohd
        Taking Coordinate inputs from User To CALCULATE Length of the Line
     */
public class LengthComparision {
    public void lengthComparision(String l1, String l2){
        if(l1.equals(l2)){
            System.out.println("Both lines Are Equal");
        }else{
            System.out.println("Given 2 Lines Are Not Equal");
        }
    }
    /*
        Using predefined compareTo method to compare Length of 2 lines
        And Printing Whether 1st line is equal greater or smaller than second one
     */
    public int lengthDifference(String l1, String l2){
        int difference = l1.compareTo(l2);
        //Logic to check Whether 1st line is greater,equal or smaller than second line
        if(difference > 0){
            System.out.println("First Line Is Greater Than Second Line");
        }else if(difference == 0){
            System.out.println("Both Lines Are Equal");
        }else{
            System.out.println("Second Line Is Greater Than First Line");
        }
        return difference;
    }
}

