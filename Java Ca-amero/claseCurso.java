package yakche;

/**
 *
 * @author usuario
 */
public class Curso {
    private String codigo;
    private String nombre;
    private String aula;
    private int nro_creditos;
    Curso(){}
    Curso(String cod,String nomb,String aul,int nro)
    {
        codigo=cod;
        nombre=nomb;
        aula=aul;
        nro_creditos=nro;
    }
    void poner_codigo(String cod)
    { codigo=cod; 
    }
    void poner_nombre(String nomb)
    {
        nombre=nomb;
    }
    void poner_aula(String aul)
    {
        aula=aul;
    }
    void poner_nrocred(int nro)
    {
        nro_creditos=nro;
    }
    String mostrar_codigo()
    {
        return codigo;
    }
    String mostrar_nombre()
    {
        return nombre;
    }
    String mostrar_aula()
    {
        return aula;
    }
    int mostrar_nrocred()
    {
        return nro_creditos;
    }
}
