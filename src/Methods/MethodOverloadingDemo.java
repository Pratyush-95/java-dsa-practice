public class MethodOverloadingDemo {
    public static void main(String[] args) {
        add(1,2);
        add(1,2,5);
        add(6.5,2);
    }

    static void add(int a,int b){
        int ans=a+b;
        System.out.println(ans);

    }

    static void add(int a,int b,int c){
        int ans=a+b+c;
        System.out.println(ans);
    }

    static void add(double a, int b){
        double ans=a+b;
        System.out.println(ans);
    }
}
