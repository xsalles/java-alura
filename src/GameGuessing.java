import java.util.Random;
import java.util.Scanner;

public class GameGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberTyped;
        int numberRandom = new Random().nextInt(100);
        int numberOfAttempts = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o valor do número secreto!");
            numberTyped = sc.nextInt();

            numberOfAttempts++;
            
            if (numberTyped == numberRandom) {
                System.out.println("PARABÉNS, você acertou dentro de " + numberOfAttempts + " tentativas! O número era " + numberRandom);
                break;
            } else if (numberTyped > numberRandom) {
                System.out.println("O valor que você digitou é maior que o número aleatório");
                
            }else {
                System.out.println("O valor que você digitou é menor que o número aleatório");
            } 

            if (numberOfAttempts == 20 && numberTyped != numberRandom){
                System.out.println("Infelizmente você atingiu o limite de tentativas. :(");
            }

        }
        sc.close();
    }
}
