import java.util.Scanner;

public class Dados {
    private String accNum;
    private String name;
    private double money = 0;
    public static int numContas = 0;

    static Scanner scanner = new Scanner(System.in);


    public static void add(Dados contas[]) {
        if (Dados.numContas >= contas.length) {
            System.out.println("Numero maximo de contas atingido");
            return;
        }
        contas[Dados.numContas] = new Dados();
        String name;
        String accNum;

        System.out.printf("Digite o nome da  conta: ");
        contas[Dados.numContas].name = scanner.nextLine();
        scanner.nextLine();
        System.out.printf("Digite o numero da conta: ");
        contas[Dados.numContas].accNum = scanner.nextLine();
        scanner.nextLine();
        contas[Dados.numContas].money =0;
        System.out.println("Conta criada com sucesso!");
        Dados.numContas++;
    }

    public static void deposit(Dados contas[])  {
        if (Dados.numContas >= contas.length) {
            System.out.println("Numero maximo de contas atingido");
            return;
        }
        System.out.printf("Digite o nome da conta: ");
        String input = scanner.nextLine();
        scanner.nextLine();


        if (input.equals("sair") || input.equals("SAIR") || input.equals("Sair")) {
            System.out.println("Retornando ao menu anterior");
            return;
        }
        for (int i = 0; i < numContas; i++) {
            if (input.equals(contas[i].name)) {
                System.out.printf("Digite o valor que deseja adicionar: ");
                double cash = scanner.nextDouble();
                scanner.nextLine();
                do {
                    if (cash <=0 ) {
                        System.out.println("por favor insira um valor maior  que 0");
                    }
                    else if ( cash > 0) {
                        contas[i].money += cash;
                    }
                    else
                        System.out.println("Por favor entre apenas um numero positivo, inteiro ou decimal");
                        

                } while (cash <= 0);

            }
        }
        System.out.println("Conta não encontrada");
        return;
    }
}


