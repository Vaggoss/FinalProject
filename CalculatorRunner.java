import java.util.Scanner;
/**
 * Write a description of class CalculatorRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What was your unweighted GPA, your highest SAT score, and the number of AP classes you have taken?");
        double newGpa = input.nextDouble();
        int newSATScore = input.nextInt();
        int newNumOfAps = input.nextInt();
        Student me = new Student(newGpa, newSATScore, newNumOfAps);
        
    }
}
