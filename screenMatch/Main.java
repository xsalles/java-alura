package screenMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Screen Match \n");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true;

        if (inclusoNoPlano == true){
            System.out.println("Esse filme está incluso no seu plano");
        }

        double notaDoFilme1 = 8.1;
        double notaDoFilme2 = 6.5;
        double media = (notaDoFilme1 + notaDoFilme2) / 2;

        System.out.println("A média das avaliações é essa: " + media);

        String sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.printf("Esse filme tem %d estrelas", classificacao);
    }
}
