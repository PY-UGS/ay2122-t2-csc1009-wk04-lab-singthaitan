import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightinPounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightinInches = input.nextDouble();

        BMI newBMI = new BMI(weightinPounds, heightinInches);
        System.out.println("BMI is "+newBMI.getBMI());
        System.out.println(newBMI.getInterpretation());
    }
}
