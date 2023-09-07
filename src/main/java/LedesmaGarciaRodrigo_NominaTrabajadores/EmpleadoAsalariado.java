package LedesmaGarciaRodrigo_NominaTrabajadores;

//Rodrigo ledesma Garcia

public class EmpleadoAsalariado extends Empleado{

    private double salario;


    public EmpleadoAsalariado(String nombre, String apellidos, String id, double salario) {
        super(nombre, apellidos, id);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double ingresos() {
        return getSalario();
    }

    @Override
    public String toString() {
        return "Empleado Asalariado "+
                "\nNombre del empleado: "+ getNombre()+
                "\nApellidos del empleado: "+getApellidos()+
                "\nSalario del empleado: "+ingresos()+" MXN mensuales."+
                "\n ";
    }
}
