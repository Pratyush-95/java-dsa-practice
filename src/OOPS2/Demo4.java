// Call by value

package OOPS2;

public class Demo4 {
    public static void main(String[] args) {
        int x=4;
        System.out.println("Before changing value " + x);

        changeValue(x); // yha par jo x call hua hai vo call by value hua hai
        System.out.println("After changing value " + x);
    }

    public static void changeValue(int x){ // yha par actual value pass nhi hua hai uski
        x = x+10;                         // uska copy pass kiya gya hai
        System.out.println("Inside change value " + x);
    }
}
