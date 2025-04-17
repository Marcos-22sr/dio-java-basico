import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário 

        //Obter pela scanner os valores digitados no terminal 

        //Exibir a mensagem criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next(); 
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome e sobrenome:");
        String nomeCliente = scanner.nextLine(); 

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
