package src.BasicMathsPrograms;

public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        int number=53127;
        while (number>0){
            int rem=number%10;
            number=number/10;
            System.out.print(rem);
        } 
    }
}
