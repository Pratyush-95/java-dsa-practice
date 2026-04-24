public class CalculatePercentage {
    public static void main(String[] args) {
        System.out.println(calculatePercentage(85, 90));
    }

    static double calculatePercentage(int marks, int total){
        double Percentage = (marks/(double)total)*100;

        return Percentage;
    }
}
