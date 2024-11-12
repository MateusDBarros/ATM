import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dados contas[] = new Dados[10];
        int choice;
        do {
            System.out.println("1. Criar conta.");
            System.out.println("2. Depositar.");
            System.out.println("3. Sacar.");
            System.out.println("4. Transferecia.");
            System.out.println("5. Sair.");
            System.out.println("Escolha uma opção.");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Dados.add(contas);
                    break;

                case 2:

                    break;

                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opção invalida");
                    break;

            }
        } while (5 != choice);

    }
}
