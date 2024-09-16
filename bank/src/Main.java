package bank.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, typeOfAccount;
        double initialBalance, transfer, valueReceived;
        int answer = 0;

        System.out.println("Qual é o seu nome?");
        name = sc.nextLine();

        System.out.println("Qual é o seu tipo de conta bancária?");
        typeOfAccount = sc.nextLine();

        System.out.println("Digite o valor do seu saldo atual");
        initialBalance = sc.nextDouble();

        System.out.printf("***********************\n" +
                "Nome: %s\n" +
                "Tipo de conta: %s\n" +
                "Saldo inicial: R$%.2f \n" +
                "************************",
                name, typeOfAccount, initialBalance);

        while (answer != 4) {

            System.out.println("\n\nOperações\n" +
                    "1 - Consultar saldo atual\n" +
                    "2 - Receber valor\n" +
                    "3 - Transferir valor\n" +
                    "4- Sair\n" +
                    "\nDigite a opção que deseja realizar");
            answer = sc.nextInt();

            switch (answer) {
                case 1:
                    System.out.printf("\nO saldo atual é de: R$%.2f", initialBalance);
                    break;
                case 2:
                    System.out.println("\nDigite o valor que deseja receber");
                    valueReceived = sc.nextDouble();
                    initialBalance += valueReceived;
                    break;
                case 3:
                    System.out.println("\nQuanto você deseja transferir?");
                    transfer = sc.nextDouble();

                    if (transfer > initialBalance) {
                        System.out.println("\nVocê não consegue transferir por conta que você não tem esse valor");
                    } else {
                        System.out.println("\nValor transferido com sucesso");
                        initialBalance -= transfer;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }

            sc.close();
        }
    }

}
