package models;

public class CalculaImposto{

    public double realizaCalculo(double valor, IImposto imposto){
        return imposto.calcula(valor);
    }
}