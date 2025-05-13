import java.util.Scanner;

public class ContaTerminal {

    int numero = 1021;
    String agencia = "067-8";
    String nomeCliente = "Mario Andrade";
    double saldo = 237.48;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.abrirConta();
    }

    public void abrirConta () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o numero da agencia:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        scanner.close();

        exibirMensagem();

    }

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está dísponivel para saque");
    
    }

    

}
