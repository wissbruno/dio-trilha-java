import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Número da Conta: (Ex: 1234)");
		numero = teclado.nextInt();

		System.out.println("Número da Agência: (Ex: 123-8)");
		agencia = teclado.next();

		System.out.println("Nome Completo: ");
		nomeCliente = teclado.next();
		teclado.nextLine();

		System.out.println("Saldo Atual: ");
		saldo = teclado.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);
    }
}
