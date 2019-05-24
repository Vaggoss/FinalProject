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
        System.out.print("What was your weighted GPA?");
        double newGpa = input.nextDouble();
        System.out.print("What was your highest SAT score?");
        int newSATScore = input.nextInt();
        System.out.print("How many AP classes you have taken?");
        int newNumOfAps = input.nextInt();
        Colleges fit = new Colleges(newGpa, newSATScore, newNumOfAps);
        fit.GpaCalculator();
        fit.ApCalculator();
        fit.SATCalculator();
        System.out.println(fit.RightFit());
    }
}
