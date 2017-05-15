package pruebas.caña;
import java.util.*;
/**
 *
 * @author Invitado
 */
public class PruebasCaña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int n;
        System.out.println("Digite el numero de elementos de su arreglo: ");
        n=l.nextInt();
        double m[]=new double [50];
        for(int i=0;i<n;i++)
        {
            m[i]=Double.parseDouble(l.next());
        }
        System.out.println("La raiz de 16 es: "+raiz(16.0));
     
    }
    public static double raiz(double r)
    { double s[]=new double[1];
    s[0]=5;
    double a;
   
    while(true)
    {
        a=s[0];
      s[0]=(a*a+r)/(2*a);
      if(s[0]-a<0.001 && -0.001<s[0]-a )
      {
          a=s[0];
          break;
      }
      
    }
      return s[0];   
    }
    
}
