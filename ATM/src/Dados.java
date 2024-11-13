import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Dados {
    private String accNum;
    private String name;
    private double money = 0;
    public static int numContas = 0;

    static Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.##");


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
        System.out.printf("Digite o numero da conta: ");
        contas[Dados.numContas].accNum = scanner.next();
        scanner.nextLine();
        contas[Dados.numContas].money =0;
        System.out.println("Conta criada com sucesso!");
        Dados.numContas++;
    }

    public static void show(Dados contas[]) {
        if (Dados.numContas == 0)  {
            System.out.println("Nenhuma conta registrada no banco de dados!");
            return;
        }
        System.out.println("Digite o numero da conta que deseja acessar:");
        String input = scanner.nextLine();

        for (int i = 0; i < Dados.numContas; i++) {
            if (input.equals(contas[i].accNum)) {
                System.out.println("Nome:\t" +contas[i].name);
                System.out.println("Numero da conta:\t" +contas[i].accNum);
                System.out.println("Saldo:\t" +df.format(contas[i].money));
                return;
            }
        }
        System.out.println("Conta não enconntrada!");
    }

    public static void deposit(Dados contas[])  {
        System.out.printf("Digite o numero da conta (Digite 'sair' para voltar): ");
        String input = scanner.nextLine();
        
        if (input.equals("sair") || input.equals("SAIR") || input.equals("Sair")) {
            System.out.println("Retornando ao menu anterior");
            return;
        }
        for (int i = 0; i < numContas; i++) {
            if (input.equals(contas[i].accNum)) {
                double cash;
                do {
                    System.out.printf("Digite o valor que deseja adicionar: ");
                    cash = scanner.nextDouble();
                    if (cash <=0 ) {
                        System.out.println("por favor insira um valor maior  que 0");
                    }
                    else if ( cash > 0) {
                        contas[i].money += cash;
                        System.out.println(df.format(cash)+"R$ adicionado a conta com sucesso");
                        return;
                    }
                    else
                        System.out.println("Por favor entre apenas um numero positivo, inteiro ou decimal");

                } while (cash <= 0);

            }
        }
        System.out.println("Conta não encontrada");
    }
}


