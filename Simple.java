// java program that uses method to calculate simple interest after 5 years.
public class Simple {//declaration of class with class name Simple.
        static double interest(int principle, double rate,int time){
       return(principle*rate*time)/100;
        }//closes the method.
       public class main {//opens a class main.
           public static void main(String[] args) {//mandatory statement in java program.
            int principle=100000;//initialisation of variable principle with 100000.
               double rate=5;  //initilises vriable rate to 5.         
               int time=5;//initialises time as 5.
               double result=Simple.interest(principle, rate, time);//this statement calls our method. 
               System.out.println("The simple interest after 5 years is: " +result);//prints output.
           }        
       }//closes class main.
       }//closes the main class.
    
