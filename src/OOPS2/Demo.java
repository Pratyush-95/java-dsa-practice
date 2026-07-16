package OOPS2;

public class  Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Pratyush";
        s1.age = 20;
        s1.rollNumber = 22150012;
        s1.college = "GLA";

        s2.name = "Gaurav";
        s2.age = 21;
        s2.rollNumber = 221500121;
        s2.college = "GLA";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();


    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by " + name);
    }

    void print(){
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }

}
