public class App {
    public static void main(String[] args) throws Exception {
        //Given two payments, estimate total miles earned
        Double p1 = 25.00;
        Double p2 = 45.50;

        Double totalMilesEarned = (p1 * 2) + (p2 * 2);
        System.out.println(totalMilesEarned);
    }
}
