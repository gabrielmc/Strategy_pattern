public class TesteApp{

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);
        CalculaImposto calculador = new CalculaImposto();

        double issValor  = calculador.realizaCalculo(orcamento, iss);
        double icmsValor = calculador.realizaCalculo(orcamento, icms);

        System.ou.println(issValor);
        System.ou.println(icmsValor);

    }
}