package holamundojava;

import java.util.*;


/**
 *
 * @author usuario
 */
public class Holamundojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        int m,n;
        System.out.println("Digite la cantidad elementos de su primer array: ");
        m=lector.nextInt();
        System.out.println("Digite la cantidad de elemntos de su segundo array: ");
        n=lector.nextInt();
        int v1[]=new int[m];
        System.out.println("Digite los elementos de su primer array");
        for(int i=0;i<m;i++)
        {
            v1[i]=lector.nextInt();
        }
        int v2[]=new int[n];
        System.out.println("Digite los elementos de su segundo array");
        for(int i=0;i<n;i++)
        {
            v2[i]=lector.nextInt();
        }
        int v3[]=new int[m+n];
        Hallar(v1,v2,v3);
        System.out.println("El array formado es: ");
        for(int i=0;i<(m+n);i++)
        {
            System.out.print(v3[i]+" ");
        }

    }
    public static void Hallar(int a[],int b[],int c[])
    {  int cont=0,cont2=0;
        for(int i=0;i<c.length;i++)
        { 
            if(i%2==0 && cont<a.length)
            {
                c[i]=a[cont];
                cont++;
            }
            else if(cont2<b.length)
            {
                c[i]=b[cont2];
                cont2++;
            }
            else {
                c[i]=a[cont];
                cont++;
            }
        }
    }
}
