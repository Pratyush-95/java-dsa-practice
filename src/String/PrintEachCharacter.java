package src.String;

public class PrintEachCharacter {
    public static void main(String[] args) {
        String str = "Pratyush";
        printEachCharacter(str);
    }

    public static void printEachCharacter(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
