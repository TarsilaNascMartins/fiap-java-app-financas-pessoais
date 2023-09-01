import java.util.Scanner;

public class Movimentacao {


    int cd_movimentacao;
    double soma_movimentacao;

    Scanner scc = new Scanner(System.in);

    // Registra o valor
    public double setMovimentacao(){

        System.out.println("Digite o valor a ser computado:");
        double movimentacao = scc.nextDouble();
        cadastrarcd_movimentacao();

        return movimentacao;

    }

    //Faz o acumulo dos valores
    double somaMovimentacao(double movimentacao){
        movimentacao += movimentacao;

        return movimentacao;
    }


    //excluir o código pelo id
    void deletarMovimentacao(int cd_movimentacao){

    }

    Movimentacao getMovimentacao(int cd_movimentacao){

        return null;
    }

    //incrementa o número do id a cada criação de perfil
    public void cadastrarcd_movimentacao(){
        cd_movimentacao++;
    }







}
