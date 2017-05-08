package parcial;
import java.util.*;

/**
 *
 * @author usuario
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,num,k;
        Scanner lector=new Scanner(System.in);
        System.out.println("Digite n:");
        n=lector.nextInt();
        ArrayList<Integer> m= new ArrayList<Integer>();
        ArrayList<Integer> res= new ArrayList<Integer>();
        System.out.println("Digite sus elementos: ");
        for(int i=0;i<n;i++)
        {
            num=lector.nextInt();
            m.add(num);
        }
        System.out.println("Digite su k: ");
        k=lector.nextInt();
        convertir(m,k,res);
        System.out.println("El array formado es: ");
        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }
    }
    public static void convertir(ArrayList<Integer> a,int k,ArrayList<Integer> b)
    {
        for(int i=0;i<a.size();i+=k)
        {
            int sum=0;
            for(int j=0;j<k;j++)
            { 
               if(i+j>=a.size()) break; 
               sum+=a.get(i+j);
            
            }
            b.add(sum);
        }
    }
    
}
