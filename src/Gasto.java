public class Gasto extends Movimentacao {

    int id_gasto;
    String tipo;

    double soma_gasto;

    public Gasto(int id_movimentacao, String tipo) {
        super(id_movimentacao);
        this.tipo = tipo;
    }

    public double getSubtraiMovimentacao(double movimentacao) {
        return setMovimentacao(movimentacao);
    }

    @Override
    protected double setMovimentacao (double movimentacao){
        movimentacao -= movimentacao;
        soma_gasto = movimentacao;
        return movimentacao;
    }
}
