public class App {
    public static void main(String[] args) throws Exception {
        //Given two payments, estimate total miles earned
        Double p1 = 25.00;
        Double p2 = 45.50;
        double Miles = totalMilesEarned(p1, p2);

        System.out.println("Congrats! You've earned: " + Miles + " Miles!");
    
    }
    public static double totalMilesEarned(double pay1, double pay2) {
        return (pay1*2) + (pay2*2);

    }
}
