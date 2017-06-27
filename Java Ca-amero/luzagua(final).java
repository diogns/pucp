public class Consumo {
    private String cliente;
    private double monto;
    private double cantidadkw;
    private double cantidadmetro;
    Consumo()
    {   monto=0;
        cantidadkw=0;
        cantidadmetro=0;
    }
    Consumo(String cliente)
    {
        this.cliente=cliente;
    }
    public void ponerCliente(String cliente)
    {
        this.cliente=cliente;
    }
    public void ponerMonto(double mont)
    {
        monto=mont+this.monto;
    }
    public String mostrarCliente()
    {
        return cliente;
    }
     public double mostrarMonto()
    {
        return monto;
    }
     public void ponerCantidadkw(double can1)
     {
         cantidadkw=can1;
     }
     public double mostrarCantidadkw()
    {
        return cantidadkw;
    }
    public void ponerCantidametro(double can2)
     {
         cantidadmetro=can2;
     }
    public double mostrarCantidametro()
    {
        return cantidadmetro;
    } 
}


public class ConsumoLuz extends Consumo {
    private double kilosactual;
    private double kilosanterior;
    ConsumoLuz(String cliente,double kilosanterior,double kilosactual)
    {
        super(cliente);
        this.kilosactual=kilosactual;
        this.kilosanterior=kilosanterior;
    }
    public void calcularLuz()
    {
        double mon;
        mon=(kilosactual-kilosanterior)*0.45;
        mon=mon*1.05;
        ponerMonto(mon);
    }
    public void ponerCantidadkw()
    {
        super.ponerCantidadkw(kilosactual-kilosanterior);
    }
}


public class ConsumoAgua extends Consumo{
    private double metroactual;
    private double metroanterior;
    ConsumoAgua(String cliente,double metroanterior,double metroactual)
    {
        super(cliente);
        this.metroanterior=metroanterior;
        this.metroactual=metroactual;
    }
    public void calcularAgua()
    {
        double mon;
        mon= (metroactual-metroanterior)*0.35;
        ponerMonto(mon);
    }
    public void ponerCantidametro()
    {
        super.ponerCantidametro(metroactual-metroanterior);
    }
    
}

public class Pruebasluzagua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector= new Scanner(System.in);
        int n;
        String nombre;
        double kilanterior,kilactual,monto,metanterior,metactual;
        System.out.println("Digite la cantidad de clientes: ");
        n=lector.nextInt();
        ConsumoLuz consumol[]= new ConsumoLuz[n];
        ConsumoAgua consumoa[]=new ConsumoAgua[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el nombre de su cliente "+(i+1));
            nombre=lector.next();
            System.out.println("Digite los kilowats del mes anterior: ");
            kilanterior=Double.parseDouble(lector.next());
            System.out.println("Digite los kilowats del mes actual: ");
            kilactual=Double.parseDouble(lector.next());
            System.out.println("Dgite los metros cubicos del mes anterior ");
            metanterior=Double.parseDouble(lector.next());
            System.out.println("Dgite los metros cubicos del mes actual ");
            metactual=Double.parseDouble(lector.next());
            consumol[i]=new ConsumoLuz(nombre,kilanterior,kilactual);
            consumol[i].calcularLuz();
            consumol[i].ponerCantidadkw();
            consumoa[i]= new ConsumoAgua(nombre,metanterior,metactual);
            consumoa[i].calcularAgua();
            consumoa[i].ponerCantidametro();
            System.out.println("*******************************************************************");
        System.out.println("Nombre del cliente: "+consumol[i].mostrarCliente());
        System.out.println("La cantidad de kilowats consumidos es: "+consumol[i].mostrarCantidadkw());
        System.out.println("La cantidad de metros cubicos de agua consumidos: "+consumoa[i].mostrarCantidametro());
        System.out.println("El monto a pagar por los servicios es: "+(consumol[i].mostrarMonto()+consumoa[i].mostrarMonto())+" soles");
        System.out.println("*******************************************************************");
            
        }
    }
    
}

