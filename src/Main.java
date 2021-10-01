public class Main {
    public static void main(String[] args) {

        double account = 100;
        double increase = 1000.01;
        double total;

        if (increase >= 1000) {
            int intIncrease = (int) increase;
            total = intIncrease / 100 + increase + account;
        } else {
            total = increase + account;
        }

        System.out.println(total);
    }
}
