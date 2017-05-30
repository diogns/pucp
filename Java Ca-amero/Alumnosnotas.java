package yakche;
import java.util.*;
/**
 *
 * @author usuario
 */
public class YaKche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,credi;
        String codigoa,codigoc,nombrea,nombrec,aula;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el numero de alumnos: ");
        n=leer.nextInt();
        Alumno alum[]=new Alumno[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite el nombre del alumno "+(i+1)+" : ");
            nombrea=leer.next();
            System.out.println("Digite el codigo de "+nombrea);
            codigoa=leer.next();
            alum[i]=new Alumno(codigoa,nombrea);
            
            System.out.println("Digite el nombre del curso 1 de "+nombrea);
            alum[i].curso1.poner_nombre(leer.next());
            System.out.println("Digite el codigo de "+alum[i].curso1.mostrar_nombre());
            alum[i].curso1.poner_codigo(leer.next());
            System.out.println("Digite el aula del curso "+alum[i].curso1.mostrar_nombre());
            alum[i].curso1.poner_aula(leer.next());
            System.out.println("Digite el numero de creditos del curso "+alum[i].curso1.mostrar_nombre());
            alum[i].curso1.poner_nrocred(leer.nextInt());
            
            System.out.println("Digite el nombre del curso 2 de "+nombrea);
            alum[i].curso2.poner_nombre(leer.next());
            System.out.println("Digite el codigo de "+alum[i].curso2.mostrar_nombre());
            alum[i].curso2.poner_codigo(leer.next());
            System.out.println("Digite el aula del curso "+alum[i].curso2.mostrar_nombre());
            alum[i].curso2.poner_aula(leer.next());
            System.out.println("Digite el numero de creditos del curso "+alum[i].curso2.mostrar_nombre());
            alum[i].curso2.poner_nrocred(leer.nextInt());
            
        }
        for (int i = 0; i <n; i++) {
            System.out.println("*******************");
            System.out.println("Alumno: "+alum[i].mostrar_nombre() );
            System.out.println("Codigo: "+alum[i].mostrar_codigo());
            System.out.println("Curso1: "+alum[i].curso1.mostrar_nombre());
            System.out.println("*** Codigo: "+alum[i].curso1.mostrar_codigo());
            System.out.println("** Aula: "+alum[i].curso1.mostrar_aula());
            System.out.println("** Creditos: "+alum[i].curso1.mostrar_nrocred());
            System.out.println("Curso2: "+alum[i].curso2.mostrar_nombre());
            System.out.println("*** Codigo: "+alum[i].curso2.mostrar_codigo());
            System.out.println("** Aula: "+alum[i].curso2.mostrar_aula());
            System.out.println("** Creditos: "+alum[i].curso2.mostrar_nrocred());
            System.out.println("*********************************");
            
        }
    }
    
}
