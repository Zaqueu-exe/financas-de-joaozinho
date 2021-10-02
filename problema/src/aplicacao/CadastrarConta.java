package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Conta;
import excecao.ValorNegativo;

public class CadastrarConta {
    List<Conta> contas = new ArrayList<>();

    public void cadastrarConta(Scanner scan) {
        try {
            System.out.println("Digite o numero da conta");
            String numeroConta = scan.next();
            System.out.println("Digite o numero da agencia");
            String agencia = scan.next();
            System.out.println("Digite o saldo inicial da conta");
            String saldo = scan.next();
            System.out.println("Digite o primeiro nome do titular da conta");
            String titular = scan.next();
            Conta conta = new Conta(Integer.parseInt(numeroConta), Integer.parseInt(agencia), Double.parseDouble(saldo), titular);
            if(!(seJaExisteEssaConta(conta))){
                seCadastrou(contas.add(conta));
            }else{
                System.out.println("Conta ja existente");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ValorNegativo e) {
            e.printStackTrace();
        }
    }

    private void seCadastrou(boolean aux) {
        if (aux) {
            System.out.println("Conta cadastrada com sucesso");
        }
    }
    private boolean seJaExisteEssaConta(Conta conta){
        for (Conta c : contas) {
            if(c.getAgencia() == conta.getAgencia() && c.getNumeroConta() == conta.getNumeroConta()){
                return true;
            }
            break;
        }
        return false;
    }

    public void visualizarContas() {
        for (Conta c : contas) {
            System.out.println(c);
        }
    }

    public void movimentaçãoFinanceira(Scanner scan) {
        System.out.println("Digite o numero da conta");
        String numeroConta = scan.next();
        System.out.println("Digite o numero da agencia");
        String agencia = scan.next();
        System.out.println("Digite o valor do juros");
        String juros = scan.next();
        boolean contaEncontrada = false;
        for (Conta c : contas) {
            if(c.getNumeroConta() == Integer.parseInt(numeroConta) && c.getAgencia() == Integer.parseInt(agencia)){
                c.depositar(c.getSaldo() * (Double.parseDouble(juros)/100));
                contaEncontrada = true;
                break;
            }
        }
        if(contaEncontrada){
            System.out.println("Conta encontrada e valores atualizados");
        }else{
            System.out.println("Conta não encontrada");
        }
    }
}