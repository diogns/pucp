package pruebascañ;
import java.util.*;

/**
 *
 * @author Invitado
 */
public class Pruebascañ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector m=new Vector();
        Scanner lector=new Scanner(System.in);
        int n;
        float sum=0;
        n=lector.nextInt();
        while(n!=1)
        {
            m.add(n);
            sum=sum+n;
            if(n%2==0)
            {
                n=n/2;
            }
            else
            {
                n=n*3+1;
            }
        }
        m.add(1);
        System.out.print("La serie es: ");
        for(int i=0;i<m.size();i++)
        {
        System.out.print(m.elementAt(i)+" ");
        }
        
        System.out.println("\nEl promedio es: "+(sum/m.size()));
        
    }
    
}
