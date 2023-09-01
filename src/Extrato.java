public class Extrato {

    int id_extrato;

    double saldo_total, valor_extratoGasto, valor_extratoGanho;

    //indentação das classes
    Usuario user = new Usuario();
    Gasto gasto = new Gasto();

    Ganho ganho = new Ganho();

    void getGasto(double valorGasto){
      valor_extratoGasto = valorGasto;
    }

    void getGanho(double valorGanho){
        valor_extratoGanho = valorGanho;

    }

    //consultar extrato

    Extrato consultarExtrato(int id_extrato){
        return null;
    }

    double realizarSaldoTotal(){
        saldo_total = valor_extratoGasto - valor_extratoGanho;
        return saldo_total;
    }

}
