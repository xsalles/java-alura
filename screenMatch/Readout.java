package screenMatch;
import java.util.Scanner;

public class Readout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favoriteMovie;
        int yearOfRealease;

        System.out.println("Digite seu filme favorito");
        favoriteMovie = sc.nextLine();
       
        System.out.println("Qual foi o ano de lançamento desse filme?");
        yearOfRealease = sc.nextInt();
        

        sc.close();

    }
}
