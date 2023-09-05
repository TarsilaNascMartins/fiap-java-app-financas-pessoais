import java.time.LocalDate;
import java.util.Scanner;

public abstract class Movimentacao {

    int id_movimentacao,  qtd_parcelas;
    String ds_movimentação;
    double vl_movimentação;

    LocalDate dt_movimentacao;


    public Movimentacao(int idMovimentacao) {
    }

    // Construtor da classe Movimentacao
    public double Movimentacao(int id_movimentacao){
            this.id_movimentacao = id_movimentacao;
            return id_movimentacao;
    }

    Scanner scc = new Scanner(System.in);

    // Registra o valor
    double salvarMovimentacao(){
        System.out.println("Digite o valor a ser computado:");
        double movimentacao = scc.nextDouble();
         return movimentacao;
    }

    //incrementa o número do id a cada criação de perfil
     void cadastrarid_movimentacao(){
       id_movimentacao++;
    }

    public double getIdMovimentacao(int id_movimentacao) {
        double Movimentacao = 0;
        return Movimentacao;
    }


    //excluir o código pelo id???
    void deletarMovimentacao(int id_movimentacao){

    }

    //Faz o acumulo dos valores
    protected abstract double salvarMovimentacao(double movimentacao);
}
