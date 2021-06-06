package challenge7;

import java.util.Scanner;

public class Challenge7 {

    static final double METERSC = .3048;

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("What is the length of your room in feet?");
        String valOne = inputs.nextLine();
        int valOneUp = Integer.parseInt(valOne);

        System.out.println("What is the width of the room in feet?");
        String valTwo = inputs.nextLine();
        int valTwoUp = Integer.parseInt(valTwo);

        String responseOne = "You entered dimensions of " + valOne + " by " + valTwo + " feet.";

        System.out.println(responseOne);

        int valArea = (valOneUp*valTwoUp);
        //System.out.println(valArea);
        String valAreaUp = String.valueOf(valArea);

        String responseTwo = "The area is " + valAreaUp + " square feet";
        System.out.println(responseTwo);

        double valAreaConvert = valArea*METERSC;
        String valAreaConvertUp = String.valueOf(valAreaConvert);
        String responseThree = valAreaConvertUp + " square meters";
        System.out.println(responseThree);



    }
}