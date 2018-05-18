
package appTeste;
import Impostos.*;
import models.*;


public class Teste {

    public static void main(String[] args) {
        IImposto iss = new ISS();
        IImposto icms = new IMCS();
        IImposto inssa = new INSSA();

        Orcamento orcamento = new Orcamento(500.0);
        CalculaImposto calculador = new CalculaImposto();

        double issValor  = calculador.realizaCalculo(orcamento.getValor(), iss);
        double icmsValor = calculador.realizaCalculo(orcamento.getValor(), icms);
        double inssaValor = calculador.realizaCalculo(orcamento.getValor(), inssa);

        System.out.println(issValor);
        System.out.println(icmsValor);
        System.out.println(inssaValor);

    }
}