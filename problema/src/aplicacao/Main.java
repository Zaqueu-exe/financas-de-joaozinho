package aplicacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean executando = true;
        CadastrarConta cc = new CadastrarConta();
        CadastrarGastos cg = new CadastrarGastos();
        do {
            String aux = opcoes(scan);
            if (aux.equals("1")) {
                cc.cadastrarConta(scan);
            } else if (aux.equals("2")) {
                cg.cadastrarGasto(scan);
            } else if (aux.equals("3")) {
                cc.movimentaçãoFinanceira(scan);
            } else if (aux.equals("4")) {
                cc.visualizarContas();
            } else if (aux.equals("5")) {
                executando = false;
            } else {
                System.out.println("Opção invalida, insira novamente");
                System.out.println();
            }
            System.out.println("//--------------------------------//");
            System.out.println();
        } while (executando);
    }

    public static String opcoes(Scanner scan) {
        String op = " ";
        System.out.println("+--------------------------------------------+");
        System.out.println("| Escolha uma das opções abaixo para navegar |");
        System.out.println("+--------------------------------------------+");
        System.out.println("1 - Cadastrar uma conta");
        System.out.println("2 - Cadastrar uma despesa");
        System.out.println("3 - Lançar uma movimentação financeira");
        System.out.println("4 - Visualizar o saldo das contas cadastradas");
        System.out.println("5 - Sair do programa");
        op = scan.next();
        System.out.println();
        System.out.println();
        return op;
    }
}
