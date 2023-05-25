import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        
        System.out.println("### Bem-vindo(a) ao BRADESPO ##");
        System.out.println("\nInsira seu nome completo:");
        String nome = scanner.nextLine();
        conta.setNomeDaConta(nome);

        System.out.println("\nInsira seu número da conta:");
        int numeroDaConta = scanner.nextInt();
        conta.setNumeroDaConta(numeroDaConta);

        System.out.println("\nInsira seu saldo inicial:");
        double saldo = scanner.nextDouble();
        conta.depositar(saldo);

        System.out.println("Conta Bancária cadastrada com sucesso!");
        
        
            System.out.println("\n## Escolha qual serviço deseja executar:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");

            int servico = scanner.nextInt();
            scanner.nextLine();

            switch (servico) {
                case 1:
                    System.out.println("Quanto deseja depositar?");
                    double valor = scanner.nextDouble();
                    conta.setValor(valor);
                    conta.depositar(valor);
                    System.out.println("Depósito de " + valor + " realizado com sucesso");
                    break;
                case 2:
                     System.out.println("\nQuanto deseja sacar?");
                     valor = scanner.nextDouble();
                     if(valor > saldo) {
                        System.out.println("\nSaldo insuficiente para realizar a operação.");
                        break;
                     } else if(valor > 5000) {
                        System.out.println("\nValor do saque acima do permitido");
                        break;
                     } else {
                     conta.setValor(valor);
                     conta.sacar(valor);
                     System.out.println("Saque de " + valor + "realizado com sucesso");
                     }
                     break;
                case 3:
                     conta.getSaldo(saldo);
                     System.out.println("Seu saldo disponível é de " + saldo);
                     break;
                case 4:
                default:
                     System.out.println("Encerrando programa...");
                     break;
            
            }
            scanner.close();
        }
    }




