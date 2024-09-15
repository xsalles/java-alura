public class price {
    public static void main(String[] args) {
        int quantity = 58;
        double price = 79.90;

        double value = quantity * price;

        System.out.printf("Se você comprar o estoque inteiro, o valor fica: R$%.2f", value);
    }
}
