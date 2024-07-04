package Interfaces;
// Inside the Interface not possible to declare instance variables because by default variables are public static final.
// Inside the Interface, constructors are not allowed.
// Inside the interface main method is not allowed.
// Inside the interface, static, final, and private methods declaration are not possible.
//extra stuff
//--------------------------------------------------------------------------------------------------
//main stuff
//class extends class
//interface extends interface
//class implements interface
//-----------------------------------------------------------------------------------------
//class extends abstract class  ***
abstract class zero{

}
class me extends zero{

}
//---------------------------------------------------------------------------------------------------
//abstract class implements interaces ***
interface nine{

}
abstract class ten implements nine{
    
}

//---------------------------------------------------------------------------------------------------

interface one{
    void brake();
}
interface two extends one{
    void brake();

}
interface three extends one{
    void brake();

}
class four implements two,three{
    public void brake(){
        System.out.println("braking");
    }
}
class AllinterfacingConcepts{
    public static void main(String[] args) {
        four on = new four();
        on.brake();
    }
}



