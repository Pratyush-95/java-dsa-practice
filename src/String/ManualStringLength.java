package src.String;

public class ManualStringLength {
   public static void main(String[] args) {
     String str = "Pratyush";
     findLengthManually(str);
   }

   public static void findLengthManually(String str){
       int count =0;
       for(int i=0;i<str.length();i++){
         count++;
       }
       System.out.println(count);
   }



}


