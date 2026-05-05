package src.OOPS;

public class App {
    public static void main(String[] args) {
        
        // Default Ctor
        // Student A = new Student();// This is Student Class instance
        // A.id=1;
        // A.age=20;
        // A.name="Pratyush";
        // A.nos=5;
        // System.out.println(A.name);
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.nos);

        // A.bunk();
        // A.sleep();
        // A.study();


        // Parametereised ctor
       Student A = new Student(1,12,"Rohit",4,"Tina");
        System.out.println(A.getName());
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);
        //System.out.println(A.gf); // This is not run because this is private access

        A.bunk();;
        A.sleep();
        A.study();
        //A.gfChatting();

        // int a=5;
        // int b=a;

        // copy ctor
        // Student B = new Student(A);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.nos);

        // B.sleep();


//     class Car {
//         String color;
    
//     void drive() {
//         System.out.println("Car is driving");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car(); // object creation
//         c1.color = "Red";
//         c1.drive();
//     }
}
    
}
