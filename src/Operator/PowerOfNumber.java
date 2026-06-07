package src.Operator;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base=2;
        int power=3;
        int result=1;
        // int ans = (int)(Math.pow(2, 3)); // using Math.pow
        // System.out.println(ans);

        // without using math.pow
        for(int i=1;i<=power;i++){
            result=result*base;
        }
        System.out.println(result);
    }
}
