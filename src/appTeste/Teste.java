
package appTeste;
import Impostos.*;
import models.*;


public class Teste {

    public static void main(String[] args) {
        IImposto iss = new ISS();
        IImposto icms = new IMCS();

        Orcamento orcamento = new Orcamento(500.0);
        CalculaImposto calculador = new CalculaImposto();

        double issValor  = calculador.realizaCalculo(orcamento, iss);
        double icmsValor = calculador.realizaCalculo(orcamento, icms);

        System.out.println(issValor);
        System.out.println(icmsValor);

    }
}