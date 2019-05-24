/**
 * Write a description of class Colleges here.
 *
 * @author (Jonathan and Daniel)
 * @version (What ever you want it to be ;))
 */
public class Colleges
{
    
    private int UCSD;
    private int SDSU;
    private int stanford;
    private int UCM;
    private int southwestern;
    private int APs;
    private int sat;
    private double gpa;
    private int SATScore;
    private int numOfAps;
    public Colleges(double theGpa, int theSATScore, int theNumOfAPs)
    {
        // initialise instance variables
        gpa = theGpa;
        SATScore = theSATScore;
        numOfAps = theNumOfAPs;
    }
    
    public void GpaCalculator()
    {
        if(gpa >= 4.18)
        {
            stanford ++;
        }
        if(gpa <= 4.29 && gpa >= 4.00)
        {
            UCSD ++;
        }
        if(gpa <= 3.99 && gpa >= 3.6)
        {
            SDSU ++;
        }
        if(gpa <= 3.59 && gpa >= 3.3)
        {
            UCM ++;
        }
    }
    
      public void ApCalculator()
       {
       if(numOfAps >= 12)
       {
           stanford ++;
       }
       if(numOfAps <= 11 && numOfAps >= 9)
       {
           UCSD ++;
        }
       if(numOfAps <= 8 && numOfAps >=6)
       {
         SDSU++;  
        }
       if(numOfAps <= 5 && numOfAps >= 3)
       {
         UCM ++;
       }
       if(numOfAps <= 2 && numOfAps >= 0)
       {
           southwestern ++;
        }
       }
  public void SATCalculator()
   {
       if(SATScore >= 1390 && SATScore <= 1600)
       {
           stanford ++;
        }
       if(SATScore <= 1380 && SATScore >= 1220)
       {
           UCSD ++;
        }
       if(SATScore <= 1350 && SATScore >= 1160)
       {
           SDSU ++;
        }
       if(SATScore <= 1220 && SATScore >= 990)
       {
           UCM ++;
        }
        if(SATScore <= 1110 && SATScore >= 0)
       {
           southwestern ++;
        }


       }
  public String RightFit()
       {
         if(stanford >= UCSD && stanford > SDSU && stanford > UCM && stanford > southwestern)
         {
             return "Okay you can  make it to Stanford, but keep in mind it is a dream scchool for everyone.";
         }
         if(UCSD >= UCM && UCSD > SDSU && UCSD > southwestern)
         {
             return "Bro UCSD is also an amazing school. Still prettey hard to get into, so put in a safety school just in case ";
         }
         if(UCM >= SDSU && UCM > southwestern)
         {
             return "Hey, UC Merced is part of the UC system. A great school that will only get better the more time passes";
         }
         if(SDSU >= southwestern)
         {
             return "SDSU SDSU SDSU SDSU SDSU. Great school, great education, low tution cost, local. Overall a prettey good deal.";
         }
         else{
             return "A respectable option when trying to save money. In the end, the degree you get will be coming from whatever school you transfer. ";
            }
         
        }
 
}


