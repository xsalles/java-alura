package screenMatch;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate;
        double average = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga a sua nota para esse filme \n");
            rate = sc.nextDouble();

            average += rate;
        }

       System.out.printf("A média de avaliações desse filme é %.2f", average / 3);

       sc.close();
    }
}
