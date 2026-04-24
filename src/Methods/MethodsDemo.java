public class MethodsDemo {
    public static void main(String[] args){
        // int sum=add(1,2);
        // System.out.println(sum);
        // int ans=add(5,10,15);
        // System.out.print(ans);

        // int num=5;
        // System.out.println(num);
        // solve(num);
        // System.out.print(num);

      //  System.out.print(value); // This value variable is only in Multiples function scope


    }

    static int add(int a, int b){
        int sum=a+b;
        return sum;
    }

    static int add(int a,int b, int c){
        int ans=a+b+c;
        return ans;
    }


    static void solve(int num){
        System.out.println(num);
        num=num*10;
        System.out.println(num);
    }

    static void Multiples(){
        int value=20;
        for(int i=1;i<=10;i++){
            System.out.println(20*i);
        }
    }

}