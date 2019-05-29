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
    private int communityService;
    private boolean essays;
    private boolean specialTrait;
    public Colleges(double theGpa, int theSATScore, int theNumOfAPs, int theCommunityService, boolean theSpecialTrait, boolean theEssays)
    {
        // initialise instance variables
        gpa = theGpa;
        SATScore = theSATScore;
        numOfAps = theNumOfAPs;
        communityService = theCommunityService;
        essays = theEssays;
        specialTrait = theSpecialTrait;
    }
    
    public void GpaCalculator()
    {
        if(gpa >= 4.30)
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
    
      public void Essays()
      {
         if(essays == true)
         {
            stanford++;
            UCSD++;
            UCM++;
         }
       }
       
        public void SpecialTrait()
      {
         if(specialTrait == true)
         {
            stanford++;
            UCSD++;
            UCM++;
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
       
       public void CommunityServiceCalculator()
    {
        if( communityService >= 300)
       {
           stanford ++;
       }
       if(communityService <= 299 && communityService >= 200)
       {
           UCSD ++;
        }
       if(communityService <= 199 && communityService >=180)
       {
         SDSU++;  
        }
       if(communityService <= 30 && communityService >= 179)
       {
         UCM ++;
       }
       if(communityService >= 0)
       {
           southwestern ++;
        }
    }
       
    public String RightFit()
       {
         if(stanford >= UCSD && stanford > SDSU && stanford > UCM && stanford > southwestern)
         {
             return "Stanford. (Although if we are being honest this is a dream scchool for everyone. If you truly desreve to get admitted in here you must have done something amazing besides get good grades.)";
         }
         if(UCSD >= UCM && UCSD > SDSU && UCSD > southwestern)
         {
             return "UCSD. (If you are unhappy with this response then go prove us wrong and get accepted somewhere even better. Although at this point the quality of education you are geting is already some of the best in the world).";
         }
         if(UCM >= SDSU && UCM > southwestern)
         {
             return "UC Merced. (Okay bud, Merced is cool and all, but UCSD though. I'm just saying)";
         }
         if(SDSU >= southwestern)
         {
             return "SDSU. (For those of you thinking we used compact for success numbers, your dead wrong. We used numbers from people who don't have the luxury of compact for success. Thank you and good day.)";
         }
         else{
             return "Southwestern college. (Hey man if this calculation is true then know that this will be your second chance. You got this.) ";
            }
         
        } 
 
 }


