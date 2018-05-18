package models;

public class CalculaImposto{

    public double realizaCalculo(Orcamento orcamento, IImposto imposto){
        return imposto.calcula(orcamento);
    }
}