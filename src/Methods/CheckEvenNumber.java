public class CheckEvenNumber {
    public static void main(String[] args) {
        System.out.println(isEven(10));
    }

    static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
}
