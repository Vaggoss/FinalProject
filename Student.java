
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private double gpa;
    private int SATScore;
    private int numOfAps;

    /**
     * Constructor for objects of class Calculator
     */
    public Student(double theGpa, int theSATScore, int theNumOfAPs)
    {
        // initialise instance variables
        gpa = theGpa;
        SATScore = theSATScore;
        numOfAps = theNumOfAPs;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getGpa()
    {
        // put your code here
        return gpa;
    }
    
    public int getSATScore()
    {
        // put your code here
        return SATScore;
    }
    
    public int getnumOfAps()
    {
        // put your code here
        return numOfAps;
    }
    public String toString()
    {
        return "Student with a gpa of " + gpa + " and SAT score of " + SATScore + " and " + numOfAps + " AP classes taken in total.";
    }
}
