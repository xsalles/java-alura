import java.util.Scanner;

public class Perfil {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;

    System.out.println("Digite o seu nome \n");
    name = sc.next();

    System.out.println("\nSeja bem vindo " + name);

    sc.close();

   }
}
