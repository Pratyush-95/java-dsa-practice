public class PassByValueDemo {

    public static void main(String[] args) {
        int x = 10;

        changeValue(x);

        System.out.println("Main me x ki value: " + x);
    }

    static void changeValue(int num) {
        num = 20;
        System.out.println("Method ke andar num ki value: " + num);
    }
}