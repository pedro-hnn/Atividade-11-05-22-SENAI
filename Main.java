/*
Crie uma classe conta que terá os atributos nome, numeroConta, agencia, saldo.
O saldo só poderá ser alterado pelos métodos sacar e depositar, ou seja o atributo saldo poderá
ser atualizado somente por esses 2 métodos mas poderemos obter o valor do saldo para ser mostrado para o cliente.
 */

import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCriar Conta\n" +
                        "2\t\t=>\t\tEditar Conta\n" +
                        "3\t\t=>\t\tChecar Saldo\n" +
                        "4\t\t=>\t\tSacar\n" +
                        "5\t\t=>\t\tDepositar\n"+
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 5) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 11/5/2022 - Exercício 6 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        String nome,numero,agencia;
        Double saldo,valor;
        Conta conta = null;


        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    //String nome, int numero_conta, String agencia, Double saldo
                    System.out.print("\n\nDigite o seu nome: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\nDigite o número da sua conta: ");
                    numero = new Scanner(System.in).nextLine();
                    System.out.print("\nDigite sua agencia: ");
                    agencia = new Scanner(System.in).nextLine();
                    System.out.print("\nDigite seu saldo: ");
                    saldo = new Scanner(System.in).nextDouble();

                    conta = new Conta(nome,numero,agencia,saldo);
                    System.out.println("\n\n");
                    System.out.println(conta.toString());
                    System.out.println("\n\n");

                    continue;
                case 2:
                    if(conta != null){
                        System.out.print("\n\nDigite o seu novo nome: ");
                        nome = new Scanner(System.in).nextLine();
                        System.out.print("\n\nDigite o seu novo número da sua conta: ");
                        numero = new Scanner(System.in).nextLine();
                        System.out.print("\n\nDigite sua nova agencia: ");
                        agencia = new Scanner(System.in).nextLine();
                        System.out.print("\n\nDigite seu novo saldo: ");
                        saldo = new Scanner(System.in).nextDouble();

                        conta.setNome(nome);
                        conta.setNumero_conta(numero);
                        conta.setSaldo(saldo);
                        conta.setAgencia(agencia);

                        System.out.println("\n\n");
                        System.out.println(conta.toString());
                        System.out.println("\n\n");
                    }else{
                        System.out.println("\n\nCRIE UMA CONTA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;

                case 3:
                    if(conta != null){
                        System.out.print("\n\nSeu saldo é de R$"+conta.getSaldo()+"\n\n");
                    }else{
                        System.out.println("\n\nCRIE UMA CONTA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;
                case 4:
                    if(conta != null){
                        System.out.print("\n\nDigite o quanto quer sacar: ");
                        valor = new Scanner(System.in).nextDouble();
                        System.out.println("\n\n");
                        conta.Saque(valor);
                    }else{
                        System.out.println("\n\nCRIE UMA CONTA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;

                case 5:
                    if(conta != null){
                        System.out.print("\n\nDigite o quanto quer depositar: ");
                        valor = new Scanner(System.in).nextDouble();
                        System.out.println("\n\n");
                        conta.Deposito(valor);
                    }else{
                        System.out.println("\n\nCRIE UMA CONTA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }
                    continue;
                case 0:
                    run = false;
                    break;
            }
        }
    }
}
