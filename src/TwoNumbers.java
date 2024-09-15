import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println("Os números são diferentes");
        } 

        if (num1 == num2){
            System.out.println("Os valores são iguais");
        } else if (num1 > num2){
            System.out.println("O primeiro valor é maior que o segundo valor");
        } else {
            System.out.println("O segundo valor é maior que primeiro valor");
        }

        sc.close();
    }
}
