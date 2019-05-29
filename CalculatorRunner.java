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
        System.out.println("What was your weighted GPA?");
        double newGpa = input.nextDouble();
        System.out.println("What was your highest SAT score?");
        int newSATScore = input.nextInt();
        System.out.println("How many AP classes you have taken?");
        int newNumOfAps = input.nextInt();
        System.out.println("How many of hours of community service have you done?");
        int newCommunityService = input.nextInt();
        System.out.println("Are you a good essay writer?(true = yes & false = no)");
        boolean newEssays = input.nextBoolean();
        System.out.println("Have you done anything that makes you stand out from the crowd?(true = yes & false = no)");
        boolean newSpecialTrait = input.nextBoolean();
        Colleges fit = new Colleges(newGpa, newSATScore, newNumOfAps, newCommunityService, newEssays, newSpecialTrait);
        fit.GpaCalculator();
        fit.ApCalculator();
        fit.SATCalculator(); 
        fit.Essays();
        fit.SpecialTrait();
        fit.CommunityServiceCalculator();
        System.out.println("According to our highly statistical and completely flawless calculations, we have decided that the most appropriate school for you to attend is " + fit.RightFit());
    }
}
