//java program to print tables
public class Nestedfor { // declares and opens a main class.
public static void main(String[] args) { //declares and opens  main methods.
    System.out.println("The bellow are multiplication tables:");
   for(int i=1;i<=10;i++) //declares outer for loop.
   { // opens outer for loop.
    for(int j=1;j<=10;j++) //declares inner for looop.
    {  // opens an inner for loop.
        System.out.println(i+"*"+j+"="+(i*j)); // prints values of i*j
        System.out.println(); //brings a new line to next line.
    } // closes inner for loop.
   } //closes an outer for loop.
} //closes a main method.
    
} //closes a main class.
