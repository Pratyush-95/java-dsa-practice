package src.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Pratyush";
        reverseString(str);
    }

    public static void reverseString(String str){
        char[] arr=str.toCharArray();
        int st=0;
        int end=arr.length-1;
        
        while (st<end) {
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;

            st++;
            end--;
            
        }
        System.out.println(new String(arr));
        
    }
}
