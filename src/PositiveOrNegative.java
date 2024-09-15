import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberTyped;

        System.out.println("Digite o primeiro número inteiro que vier na sua cabeça");
        numberTyped = sc.nextInt();

        if(numberTyped == 0){
            System.out.println("O número '0' é um número neutro");
        } else if (numberTyped > 0) {
            System.out.println("O número que você digitou é positivo");
        } else {
            System.out.println("O número que você digitou é negativo");
        }

        

        sc.close();

    }
}
