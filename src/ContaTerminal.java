import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String agencia;
        int conta;
        double saldo;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digite sua conta: ");
        conta = scanner.nextInt();

        System.out.println("Digite sua saldo: ");
        saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta +
                " e seu saldo " + saldo + " já está disponível para saque");

    }

}
