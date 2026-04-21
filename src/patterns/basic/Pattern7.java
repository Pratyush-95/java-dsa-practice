package patterns.basic;

public class Pattern7 {
    public static void main(String[] args){
        int n=5;

        for(int row=1;row<=n;row++){
 
            // spaces
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }

            // stars
            for(int col=1;col<=2*n-2*row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
