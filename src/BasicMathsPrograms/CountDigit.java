package src.BasicMathsPrograms;

public class CountDigit {
    public static void main(String[] args) {
        int number=145;
        int count=0;
        while (number>0) {
            number=number/10;
            count++;

        }
        System.out.println(count);
    }
}
