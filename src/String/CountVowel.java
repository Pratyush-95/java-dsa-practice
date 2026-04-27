package src.String;

public class CountVowel {
    public static void main(String[] args) {
        String str = "Pratyush";
        System.out.println(vowelCount(str));
    }
    public static int vowelCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
                count++;
            }
        }
        return count;
    }
}
