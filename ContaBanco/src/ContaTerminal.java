import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 1258.99;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" " +
                "já está disponível para saque");
    }
}