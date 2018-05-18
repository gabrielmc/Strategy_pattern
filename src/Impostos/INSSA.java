
package Impostos;
import models.Orcamento;
import models.IImposto;

public class INSSA implements IImposto{

    @Override
    public double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0.5;
    }
}
