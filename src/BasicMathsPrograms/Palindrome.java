package src.BasicMathsPrograms;

public class Palindrome {
    public static void main(String[] args) {
        
    int number=1221;
    int reverse=0;
    int p=number;
    while(number!=0){
        int rem=number%10;
        reverse=reverse*10+rem;
        number=number/10;
    }
    if(p==reverse){
        System.out.println("Palindrome Number");
    }
    else{
        System.out.println("Not Palindrome Number");
    }
}
}
