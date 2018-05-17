public class IMCS implements Imposto{

    @Override
    public double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0.5;
    }
}