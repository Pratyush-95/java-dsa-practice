package src.String;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "Pratyush";
        checkPalindrome(str);
    }

    public static void checkPalindrome(String str){
        char[] arr= str.toCharArray();

        int st=0;
        int end=arr.length-1;
        while (st<end) {
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;
            end--;
        }

        String reversed = new String(arr);

        if(reversed.equals(str)){
            System.out.println("It is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}