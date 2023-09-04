public class Ganho extends Movimentacao{

    int id_ganho;
    String tipo;
    double soma_ganho;

    public Ganho(int id_movimentacao, String tipo) {
        super(id_movimentacao);
        this.tipo = tipo;
    }

    //Faz o acumulo dos valores
    @Override
    protected double setMovimentacao(double movimentacao){
        movimentacao += movimentacao;
        soma_ganho = movimentacao;
        return movimentacao;
    }

    public double getSomaMovimentacao(double movimentacao) {
       return setMovimentacao(movimentacao) ;
    }


}
