import java.util.Scanner;

public class ContaTerminal {    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao cadastro da conta.");
        
        System.out.println("Escreva seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Escreva o numero da agencia nesse modelo '067-8': ");
        String Agencia = scanner.next();
        
        System.out.println("Escreva seu numero da conta 4 digitos");
         int NumeroConta = scanner.nextInt();
        
        System.out.println("Escreva seu Saldo: ");
        double Saldo = scanner.nextDouble();
        
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + NumeroConta + " e seu saldo R$ " + Saldo + " já está disponível para saque.");
    }
}
