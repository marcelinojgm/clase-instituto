import java.util.ArrayList;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
  
    private String nombre;
    private int edad;
    private final int NUM_CLASE ;
    private final  int LAST_NUM_CLASE;
  
    
    /**
     * Crea a un alumno
     * @param nombre nombre del alumno
     * @param edad edad del alumno
     */
    public Alumno(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad   = edad;
        NUM_CLASE = LAST_NUM_CLASE +1;
        LAST_NUM_CLASE += 1;
        
       
    }

   
}
