package entidades;

import excecao.ValorNegativo;

public class Gasto {
    Double valor;
    boolean paga;
    String categoria;

    public Gasto(Double valor, String categoria) {
        if (valor < 0) {
            throw new ValorNegativo("Valor inserido é menor que 0");
        } else {
            this.valor = valor;
            this.categoria = categoria;
        }
    }

    public Double getValor() {
        return valor;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Categoria: " + categoria + " Valor: " + valor;
    }
    

}
