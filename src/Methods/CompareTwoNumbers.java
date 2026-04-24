public class CompareTwoNumbers {
    public static void main(String[] args) {
        System.out.println(findMax(7,6));
    }

    static int findMax(int a,int b){
        if(a>=b){
            return a;
        }
        return b;
    }
}
