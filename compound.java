//java program that uses objects and method to calculate compound interest.
public class compound {//opens of main class compound.
    public static double compoundint(double p, double r,double t){//declares the method compoundint.
        return p*(Math.pow(1+((r/100)/12),t*12));
    }// closes a main method.
  public static void main(String[] args) { //opens mandatory method in all java programs.
    compound c =new compound();//creates object c;
    double result=c.compoundint(500000, 18, 3);//calls our method to calculate cmpound interest using object c.
    System.out.println("The amount Bob will pay after 3 years is equal to:"+result);//prints output result.


  } //closes a mandatory method.
    
} //closes main class 
