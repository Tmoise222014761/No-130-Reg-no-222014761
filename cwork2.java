// java program that multiple if else statements.
public class cwork2 { //decares and opens class named cwork2.
    public static void main(String args[])
     {
        int height=1; //initialises variable height to 1.
        if(height<1){ //creates and opens if condition 1.
            System.out.println("short"); //output.
        } //closes condition1.
        else if(height>=1 && height<2){ //creates and opens if condition 2.
            System.out.println("Your height id Moderate"); //output.
        } //closes condition2.
        else if(height>=2 && height<3) { //creates and opens if condition 3.
            System.out.println("You are Tall"); //output.
        } //closes condition3.
    
        else if(height>=3 && height<4) { //creates and opens if condition 4.

            System.out.println("You are Too tall"); //output.
        } //closes condition4.
            else  //default condition.
            {
               System.out.println("Your height is Invalid."); //default output.
            } //closes default condition.   
} //closes method.
} //closes class.
