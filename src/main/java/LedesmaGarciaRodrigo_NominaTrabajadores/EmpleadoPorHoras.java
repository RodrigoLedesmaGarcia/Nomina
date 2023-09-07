package LedesmaGarciaRodrigo_NominaTrabajadores;

//Rodrigo ledesma Garcia

public class EmpleadoPorHoras extends Empleado{

    private double horasTrabajadas;
    private double sueldoporHora;

    public EmpleadoPorHoras(String nombre, String apellidos, String id, double horasTrabajadas, double sueldoporHora) {
        super(nombre, apellidos, id);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoporHora = sueldoporHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoporHora() {
        return sueldoporHora;
    }

    public void setSueldoporHora(double sueldoporHora) {
        this.sueldoporHora = sueldoporHora;
    }

    @Override
    public double ingresos() {
        return ((getHorasTrabajadas())*(getSueldoporHora()));
    }

    @Override
    public String toString() {
        return "Empleado por horas"+
                "\nNombre del empleado: "+getNombre()+
                "\nApellidos del empleado "+getApellidos()+
                "\nHoras trabajadas al mes "+getHorasTrabajadas()+
                "\nSueldo por hora trabajada "+getSueldoporHora()+" MXN."+
                "\nSalario del empleado "+ingresos()+ " MXN."+
                "\n ";
    }
}
