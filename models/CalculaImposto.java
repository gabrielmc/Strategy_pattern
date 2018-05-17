public class CalculaImposto{

    public double realizaCalculo(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }
}