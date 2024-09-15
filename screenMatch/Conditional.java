package screenMatch;

public class Conditional {
    public static void main(String[] args) {
        boolean inclusoNoPlano = true;
        int anoDeLancamento = 2022;
        String typeOfPlan = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }

        typeOfPlan.toLowerCase();

        if(typeOfPlan.equals("plus") || inclusoNoPlano == true){
            System.out.println("Esse filme está incluso no seu plano");
        } else{
            System.out.println("Você tem que pagar a locação");
        }



    }
}
