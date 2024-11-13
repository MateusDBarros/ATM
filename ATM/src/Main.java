import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dados contas[] = new Dados[10];
        int choice;
        do {
            System.out.println("1. Criar conta.");
            System.out.println("2. Exibir conta.");
            System.out.println("3. Depositar.");
            System.out.println("4. Sacar.");
            System.out.println("5. Transferecia.");
            System.out.println("6. Sair.");
            System.out.println("Escolha uma opção.");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Dados.add(contas);
                    break;

                case 2:
                    Dados.show(contas);
                    break;

                case 3:
                    Dados.deposit(contas);
                    break;
                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (6 != choice);

    }
}
