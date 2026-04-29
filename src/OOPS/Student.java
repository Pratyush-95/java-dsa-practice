package src.OOPS;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Ctor ya Constructor // yha ctor default isliye hai ki function ke anadr koi value pass nhi hua hai
    // attribute value is set to 0
    public Student(){ // class name and Constructor name are always same
        System.out.println("Student Default Ctor is Called");
    }

     // Parametereised ctor
    public Student(int id,int age,String name, int nos) { 
        System.out.println("Student Default Ctor is Called");
        this.id=id;
        this.age=age;
        this.name=name;
        this.nos=nos;
    }

    // Methods  / Behaviour
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }
}
