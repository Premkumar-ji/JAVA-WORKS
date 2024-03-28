// this a simple program to show how a abstract key word is used
// in java. Abstract classes are the subclasses of other class
// which can't be instantiated by itself but it provides the 
//basic structure for subclass in java 
abstract class A
 {
    abstract void disp();
    void show()
    {
        System.out.println("hello abc");
    }
}
class B extends A
{
    public void disp()
    {
        System.out.println("hello class B");
    }
}
public class abstract_class 
{
    public static void main(String[] args) {
        A b1=new B();
        b1.disp();
        b1.show();
    }  
}
