package src.BasicMathsPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>=1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime No");
        }
    }
}
