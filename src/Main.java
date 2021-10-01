public class Main {
    public static void main(String[] args) {

        int account = 100;
        int increase = 1002;
        int total;

        if (increase > 1000) {
            total = increase / 100 + increase + account;
        } else {
            total = increase + account;
        }

        System.out.println(total);
    }
}
