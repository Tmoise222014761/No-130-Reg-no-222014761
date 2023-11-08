class A extends B implements E{
     void getA(){
        System.out.println("Grade A");
     }
     public void getE(){
        System.out.println("Grade E");
     }
}
class B extends C{
    void getB(){
        System.out.println("Grade B");;
     }
}
class C extends D{
    void getC(){
        System.out.println("Grade C");
     }
}
class D{
    void getD(){
        System.out.println("Grade D");
     }
}
interface E{
     void getE();
}
public class inhertanceQUE1 {
    public static void main(String[] args) {
        A a = new A();
        a.getA();
        a.getB();
        a.getC();
        a.getD();
        a.getE();
    }
    
}

/*
 * 
              Output
       Grade A
       Grade B
       Grade C
       Grade D
       Grade E
 */