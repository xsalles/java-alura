package screenMatch;
import java.util.Scanner;

public class Readout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteMovie;
        int yearOfRealease;
        double rate;

        System.out.println("Digite seu filme favorito");
        favoriteMovie = sc.nextLine();
       
        System.out.println("Qual foi o ano de lançamento desse filme?");
        yearOfRealease = sc.nextInt();
        
        System.out.println("Qual a avaliação para esse filme?");
        rate = sc.nextDouble();

        System.out.printf("O seu filme favorito é %s \n", favoriteMovie);
        System.out.printf("O ano de lançamento é %d \n", yearOfRealease);
        System.out.printf("O a nota para esse filme é %.2f \n", rate);

        sc.close();

    }
}
