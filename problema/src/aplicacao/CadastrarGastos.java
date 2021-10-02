package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Gasto;
import excecao.ValorNegativo;

public class CadastrarGastos {
    List<Gasto> gastos = new ArrayList<>();

    public void cadastrarGasto(Scanner scan) {
        try {
            System.out.println("Digite a categoria da dispesa");
            String categoria = scan.next();
            System.out.println("Digite o valor da dispesa");
            String valor = scan.next();
            Gasto gasto = new Gasto(Double.parseDouble(valor), categoria);
            seCadastrou(gastos.add(gasto));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ValorNegativo e) {
            e.printStackTrace();
        }
    }
    private void seCadastrou(boolean aux){
        if(aux){
            System.out.println("Dispesa cadastrada com sucesso");
        }
    }
}
