package screenMatch;
import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rate = 0;
        double average = 0;
        int quantityOfRates = 0;
        
        while (rate != -1) {
            System.out.println("Digite a sua nota ou digite -1 para encerrar");
            rate = sc.nextInt();

            if (rate != -1){
                average += rate;
                quantityOfRates++;
            } 
        }

        if(quantityOfRates > 0){
            System.out.printf("O valor da média de todas avaliações é %.2f", average / quantityOfRates);
        } else {
            System.out.println("Ninguém avaliou esse filme");
        }

        sc.close();;
    }
}
