package OOPS2;

public class Demo3 {

    public static void main(String[] args) {
        
        Student s1 = new Student(); // Call the Constructor
        Student s2 = new Student("Pratyush"); // Call the Constructor
        Student s3 = new Student("Gaurav", 20);
        Student s4 = new Student("Pranjal", 21, 123);
        Student s5 = new Student("Pragya" ,22,1234, "GLA" );

        System.out.println(s3.college);
        System.out.println(s4.age);
        
    }
}

// Constructor Chaining
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    // Default Constructor
    Student(){}

    Student (String name){
        this(name,0,0,null); // This is called Constructor Chaining
    }
    Student (String name, int age){
        this(name,age,0,null); // This is called Constructor Chaining
    }
    Student (String name, int age, int rollNumber){
        this(name,age,rollNumber,null); // yha se hmm apne last Constructor ko call kar arhe hai 
    }
    Student (String name, int age, int rollNumber, String college){ // ye Constructor Call ho rha hai 3 jagah
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    

}


