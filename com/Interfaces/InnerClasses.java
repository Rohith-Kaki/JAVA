package Interfaces;
class ABC{
    private int y =40;
    class XYZ{
        private int x=10;
    }
    public static void main(String args[]){
        ABC.XYZ xx = new ABC().new XYZ();
        ABC yy = new ABC();
        System.out.println("Hello :: "+xx.x); 
        System.out.println(yy.y);;///Why is this allowed??
    }
}



// class Outer{
//     private int num = 1000;
//     class Inner{
//         private int number = 7000;
//         public void OuterData(){
//             //access outer data
//             System.out.println("printing outer private data form inner");
//             System.out.println("outer data is" + num);
//         }
//         }//accessing inner data from outer class.
//         public void display(){
//             Inner obj3 = new Inner();
//             System.out.println("running outer class display method!");
//             System.out.println(obj3.number);
//     }
// }
// public class InnerClasses{
//     public static void main(String[] args) {
//         Outer.Inner obj = new Outer().new Inner();
//         obj.OuterData();
//         Outer thing  = new Outer();
//         thing.display();

        
//     }
// }

