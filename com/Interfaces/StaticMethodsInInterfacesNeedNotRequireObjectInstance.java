package Interfaces;
//interfaces are used to implement multiple inheritance and abstraction
//For interfaces and abstract class we cannot create objects
//abstract class can contain both abstract and non abstract methods
//abstract class can not be initiated by itself, it needs to be inherited by a subclass to use the method in it.
//interfaces containing abstract methods are declared wihtout body and that methods definiton is written in drived class.
//interfaces can contain deafault methods with body.
interface Building {
    // abstract methods in interfaces should not contain body definiton it is written in derived class
    void heightDisplay();
    //default method
    default void display(){
        System.out.println("displaying");
    }
    // static method with body and these static methods donot require obj instance so we can call it by building.widthDisplay() inside the main method.
   static void widthDisplay()
    {
        System.out.println("width is 1");
    }
}
 
class GFG implements Building {
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
}
public class StaticMethodsInInterfacesNeedNotRequireObjectInstance{
    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        gfg.heightDisplay();
        gfg.display();
        //as static methods are not inherited and does not require object instance we should call
        //the method by interface name only not like this:
        gfg.widthDisplay()//wrong
        Building.widthDisplay();
    }
}