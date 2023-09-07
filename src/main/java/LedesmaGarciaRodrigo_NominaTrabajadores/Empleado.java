package LedesmaGarciaRodrigo_NominaTrabajadores;

//Rodrigo ledesma Garcia

public class Empleado {

    private String nombre;
    private String apellidos;
    private String id;

    public Empleado(String nombre, String apellidos, String id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double ingresos(){
        return 0;

    }

    @Override
    public String toString() {
        return "Empleado" +
                "\nNombre del empleado: " + nombre  +
                "\nApellidos del empleado: " + apellidos  +
                "\nId del empleado: " + id +
                "\n ";
    }
}
