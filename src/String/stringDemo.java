package src.String;

import java.util.Scanner;

public class stringDemo {
    public static void main(String[] args) {
        // String firstName = "Pratyush";
        // String lastName = new String("Kumar");
        // System.out.println(firstName + " " + lastName);

        // // isse String ka length print ho jayega
        // System.out.println(firstName.length());

        // // isse kon se index par konsa character hai vo print hoga
        // System.out.println(firstName.charAt(0));
        // System.out.println(firstName.charAt(2));


        //String name1 =  "Rohit";
        //String name2 = "Rohiu";
       // name[0]= "M"; // This is not possible

      // if(name1 == name2){
     // if(name1.equals(name2)){
    //     if(name1.equalsIgnoreCase(name2)){
    //     System.out.println("Both strings are equal");
    //    }
    //    else{
    //     System.out.println("Both strings are not equal");
    //    }/

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Provide the string content: ");
        // //String str = sc.nextLine();
        // String str = sc.next();
        // System.out.println("Value: " + str);


        // String str = "  ";
        // System.out.println(str.length()); // string ki length check hota hai
        // System.out.println(str.isEmpty()); // check hota hai ki string empty hai ya nhi
        // System.out.println(str.isBlank()); // empty ho ya phir sirf spaces ho
        // String str1= "  Pratyush   ";
        // System.out.println(str1.length());
        // str1 = str1.trim();//trim se spaces remove honge and isko kisi variable me store karna hoga kyuki ye return karnat hai
        // System.out.println(str1.length());


        // String name = "Love";
        // System.out.println(name.toUpperCase()); // isse hmm uppar case me convert karte hai
        // String str="LOVe";
        // System.out.println(str.toLowerCase()); // isse hmm lowercase me convert karte hai



        // String str = "My name is Pratyush Kumar";
        // System.out.println(str.substring(3,6 ));
        // // beginIndex -> 3 -> Inclusive
        // // endIndex -> 6 -> exclusive
        // // yha index 3 se le kar 5 index tak ka value print hoga last ya 6 index ka value print nhi hota hai
        // System.out.println(str.contains("Pratyush"));// iss str wale value ke andar agar Pratyush hai to true
        //                                                 // nhi to false print hoga


        // int num=145;
        // String str = String.valueOf(num); // isse hmm kisi bhi int value ko string me convert kar sakte hai
        // System.out.println(num+1);
        // System.out.println(str + 1); // yha strig ke anadr value add nhi   concatenat hota hai


        // String name = "Pratyush Kumar Singh";
        // System.out.println(name.startsWith("Pratyush")); // iska matlab kya mera String Pratyush se start hai to true nhi hai to false
        // System.out.println(name.endsWith("Singh")); // iska matlab kya mera String Singh  se end hai to true nhi hai to false


        // String name = "Pratyush";
        // char[] crr = name.toCharArray(); // isse value ek array ki tarah print hoga

        // for(char ch: crr){
        //     System.out.println("Value of char: " + ch); 
        // }

        // String input = "My,name,is,Pratyush,Kumar";
        // String[] words = input.split(",");
        // for(String str : words){
        //     System.out.println(str);
        // }


        String name = "Pratyush";
        name = name.replace("t","M"); // iska use word ko replace karne ke liye use hota hai
                                                         // yha main t ko M se replace kar diya 
        System.out.println(name);

    }
}
