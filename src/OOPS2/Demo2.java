package OOPS2;

public class Demo2 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Pratyush",28,102,"GLA");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    Student(){
    }

    Student(String n, int rn, int a, String c){
        name = n;
        age = a;
        rollNumber = rn;
        college = c;

    }
}
