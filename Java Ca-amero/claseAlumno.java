package yakche;

/**
 *
 * @author usuario
 */
public class Alumno {
    private String codigo;
    private String nombre;
    public Curso curso1;
    public Curso curso2;
    Alumno(String codigo,String nombre)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        curso1=new Curso();
        curso2=new Curso();
        
    }
    String mostrar_codigo()
    {
        return codigo;
    }
    String mostrar_nombre()
    {
        return nombre;
    }
}
