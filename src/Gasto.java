import java.util.Scanner;
public class Gasto {

    int cd_gasto;
    double soma_gasto;

    Scanner scc = new Scanner(System.in);

    // Registra o valor somado
    public double registrarGasto(){

        System.out.println("Digite o gasto a ser computado:");
        double gasto = scc.nextDouble();
        cadastrarcd_gasto();

        return gasto;

    }

    //Faz o acumulo dos valores de gasto
    double somaGastos(double gasto){
        soma_gasto += gasto;

        return soma_gasto;
    }


//excluir o código pelo id
    void deletarGastos(int cd_gasto){

    }

// retornar o valor pelo id
    void getGasto(int cd_gasto){

    }

//incrementa o número do id a cada criação de perfil
    public void cadastrarcd_gasto(){
        cd_gasto++;
     }



}
