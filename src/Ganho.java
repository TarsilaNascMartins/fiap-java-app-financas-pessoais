import java.util.Scanner;

public class Ganho {

    int id_ganho;
    double soma_ganho;

    Scanner scc = new Scanner(System.in);

    // Registra o valor somado
    double setGanho(){

        System.out.println("Digite o ganho a ser computado:");
        double ganho= scc.nextDouble();
        cadastrarcd_ganho();

        return ganho;

    }

    //Faz o acumulo dos valores de ganho
    double somaGanho(double ganho){
        soma_ganho += ganho;
        return soma_ganho;
    }




    //excluir o código pelo id
    void deletarGanho(int cd_ganho){

    }

    // retornar o valor pelo id
    Ganho getGanho(int cd_ganho){

        return null;
    }

    //incrementa o número do id a cada criação de perfil
    public void cadastrarcd_ganho(){
        id_ganho++;
    }



}
