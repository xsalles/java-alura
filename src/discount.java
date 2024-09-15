public class discount {
    public static void main(String[] args) {
        double originalPrice = 89.90;
        double discount = 0.1;

        double newValue = originalPrice * discount;

        System.out.printf("O novo valor é R$%.2f", newValue);
    }
}
