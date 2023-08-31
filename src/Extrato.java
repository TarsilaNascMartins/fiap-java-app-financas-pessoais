public class Extrato {

    int cd_extrato;

    double saldo_total, valorgasto, valorganho;

    //indentação das classes
    Usuario user = new Usuario();
    Gasto gasto = new Gasto();
    Ganho ganho = new Ganho();

    void enviarGasto(double valorGasto){
      valorgasto = valorGasto;
    }

    void enviarGanho(double valorGanho){
        valorganho = valorGanho;

    }

    double realizarSaldoTotal(){
        saldo_total = valorgasto - valorganho;
        return saldo_total;
    }

}
