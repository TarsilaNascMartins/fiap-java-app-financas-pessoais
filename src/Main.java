import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Indentação e Cadastro do Usuário
        Usuario user = new Usuario();
        user.cadatrarUsuario();

           int i ;
           //Indentação das classes
           Gasto gasto = new Gasto();
           Ganho ganho = new Ganho();
           Extrato extrato = new Extrato();


           //Painel
        do {

            System.out.println("\n****Painel:****" +
                    "\n 1-Gastos " +
                    "\n 2-Ganhos" +
                    "\n 3- Saldo Total" +
                    "\n 4- Finalizar App");

            Scanner scc = new Scanner(System.in);
            i = scc.nextInt();


            switch(i) {
                case 1:
                    double gastoValor = gasto.setGasto();
                    System.out.println("Seu gasto resgitrado no momento foi do valor de: R$ " + gastoValor);
                    System.out.println("Total de Gastos: " + gasto.somaGastos(gastoValor));
                    System.out.println("ID gasto número:"+gasto.cd_gasto);
                    extrato.getGasto(gastoValor);

                    break;
                case 2:
                    double ganhoValor = ganho.setGanho();
                    System.out.println("Seu ganho resgitrado no momento foi do valor de: R$ " + ganhoValor);
                    System.out.println("Total de Ganhos: " + ganho.somaGanho(ganhoValor));
                    System.out.println("ID gasto número:"+ganho.id_ganho);
                    extrato.getGanho(ganhoValor);

                    break;

                case 3:
                    System.out.println("****Saldo Total****" );
                    System.out.println("Total de Ganhos: " +  extrato.valor_extratoGanho);
                    System.out.println("Total de Gastos: " +  extrato.valor_extratoGasto);
                    System.out.println("Saldo R$:" +extrato.realizarSaldoTotal());

                    break;


                default:
                    System.out.println("\nPrograma finalizado!");
                  break;
            }
        }
        while (i !=4) ;

    }


}