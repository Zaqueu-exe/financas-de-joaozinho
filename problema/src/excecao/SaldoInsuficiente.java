package excecao;

public class SaldoInsuficiente extends RuntimeException{
    
    public SaldoInsuficiente(String msg){
        super(msg);
    }
}
