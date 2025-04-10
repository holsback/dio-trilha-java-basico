import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nome;
        double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();
        System.out.print("Digite o usuário: ");
        numero = sc.nextInt();
        System.out.print("Digite o nome: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.print("Digite o valor de deposito: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " Conta: " + numero
                + " e seu Saldo é: " + saldo + ", já esta disponível para saque!");







        sc.close();
    }
}
