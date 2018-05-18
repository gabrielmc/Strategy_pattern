
package Impostos;

import models.IImposto;

public class IMCS implements IImposto{

    @Override
    public double calcula(double valor){
        return valor * 0.5;
    }
}