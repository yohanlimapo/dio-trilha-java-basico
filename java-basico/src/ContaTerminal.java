import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite a agência da conta: ");
        String agencia = sc.next();
        System.out.println("Digite o nome da conta: ");
        String nomeCliente = sc.next();
        System.out.println("Digite o saldo da conta: ");
        Float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
