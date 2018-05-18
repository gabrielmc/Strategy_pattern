
package Impostos;
import models.IImposto;

public class INSSA implements IImposto{

    @Override
    public double calcula(double valor){
        return valor * 0.3;
    }
}
