import java.util.ArrayList;

public class Extrato {

    int id_extrato;

    double saldo_total, valor_extratoGasto, valor_extratoGanho;

    //indentação das classes
    Usuario user = new Usuario();

    double getGasto(double valorGasto){
      valor_extratoGasto =+ valorGasto;
      return valor_extratoGasto;
    }

    double getGanho(double valorGanho){
        valor_extratoGanho =+ valorGanho;
        return valor_extratoGanho;
    }

    //consultar extrato

    Extrato consultarExtrato(int id_extrato){
        Extrato lista = New Object ArrayList = null;
        ArrayList;
        return Extrato;
    }

    double realizarSaldoTotal(){
        saldo_total = valor_extratoGanho - valor_extratoGasto;
        return saldo_total;
    }

}
