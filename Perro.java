

/**
 *
 * @author Daniela
 */
public class Perro {
    //Atributos
    private String nombre;
    private String raza;
    private String loalidad;
    private int cedula_dueño;
    private String nombre_dueño;
    private int telefono_dueño;
    private String dia_asistencia;
    
   //Construnctor
    public Perro(String nombre,String raza,String loalidad,int cedula_dueño,String nombre_dueño,int telefono_dueño,String dia_asistencia;)
   
    {   this.nombre = nombre;
    this.raza = raza;
    this.loalidad = loalidad;
    this.cedula_dueño = cedula_dueño;
    this.nombre_dueño = nombre_dueño;
    this.telefono_dueño = telefono_dueño;
    this.dia_asistencia= dia_asistencia;
    }
    //Getters
    public String getnombre()
    {
        return nombre;
    }
    public String getraza()
    {
        return raza;
    }
    public String getloalidad()
    {
        return loalidad;
    }
    public int getcedula_dueño()
    {
        return cedula_dueño;
    }
    public String getnombre_dueño()
    {
        return nombre_dueño;
    }
    public int gettelefono_dueño()
    {
        return telefono_dueño;
    }
    public String getdia_asistencia()
    {
        return dia_asistencia;
    }
 
    //Setters
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setraza (String raza)
    {
        this.raza = raza;
    }
    public void setloalidad (String loalidad)
    {
        this.loalidad = loalidad;
    }
    public void setcedula_dueño (int cedula_dueño)
    {
        this.cedula_dueño = cedula_dueño;
    }
    public void setnombre_dueño (String nombre_dueño)
    {
        this.nombre_dueño = nombre_dueño;
    }
    public void settelefono_dueño ( int telefono_dueño)
    {
        this.telefono_dueño = telefono_dueño;
    }
    public void setdia_asistencia (String dia_asistencia)
    {
        this.dia_asistencia = dia_asistencia;
    }
   
