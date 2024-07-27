package Programs;
// public class basic_oop{
//     public static void main(String[] args) {
//         Student[] students = new Student[5];
//         Student rohith = new Student();
//         rohith.rollNo = 74;
//         rohith.name = "Rohiht";
//         rohith.marks = 90.1f;
//         System.out.println(rohith.rollNo);
//         System.out.println(rohith.name);
//         System.out.println(rohith.marks);
//     }
// }
// class Student{
//     int rollNo;
//     String name;
//     float marks;
// }

/*better and best way */

public class basic_oop {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student stu1 = new Student(18, "Rohith", 90.1f);  // if no parameter are passed then this is known as default consturctor. 
        System.out.println(stu1.rollNo);
        System.out.println(stu1.name);
        System.out.println(stu1.marks);

    }  
}
class Student{
    int rollNo;
    String name;
    float marks;
                                                    //student()
    Student(int rono, String name, float marks){   //if no parameters are passsed then we should assign values in this way.
        this.rollNo = rono;                       //this.rollNo = 74;
        this.name = name;                         //this.name = "rohith";
        this.marks = marks;                       //this.marks = 80.1f;
    }
}


