public class Consumo {
    private int numclientes;
    private double monto=0;
    Consumo(){}
    Consumo(int numclientes,double monto)
    {
        this.numclientes=numclientes;
        this.monto=monto;
    }
    public void ponerNumcliente(int numclientes)
    {
        this.numclientes=numclientes;
    }
    public void ponerMonto(double mont)
    {
        monto=mont+this.monto;
    }
    public int mostrarNumcliente()
    {
        return numclientes;
    }
     public double mostrarMonto()
    {
        return monto;
    }
}
public class ConsumoLuz extends Consumo{
    private double kilosactual;
    private double kilosanterior;
    ConsumoLuz(int numcliente,double kilosactual,double kilosanterior)
    {
        super(numcliente,0);
        this.kilosactual=kilosactual;
        this.kilosanterior=kilosanterior;
    }
    public void calcularLuz()
    {
        double mon;
        mon=(kilosactual-kilosanterior)*0.45;
        ponerMonto(mon);
    }
    
}
