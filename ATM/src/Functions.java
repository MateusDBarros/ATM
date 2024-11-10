import java.util.Scanner;

public class Functions {

    public void add(Dados contas[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite o nome da conta: ");
        contas[Dados.numContas].name = scanner.nextLine();
        System.out.printf("Digite o numero da conta");
        contas[Dados.numContas].accNum = scanner.nextLine();
        System.out.printf("Digite a senha da conta");
        contas[Dados.numContas].password = scanner.nextLine();
        Dados.numContas++;
        System.out.println("Conta criada com sucesso.");

    }
}
