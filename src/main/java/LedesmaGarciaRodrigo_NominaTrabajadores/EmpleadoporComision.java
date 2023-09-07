package LedesmaGarciaRodrigo_NominaTrabajadores;

public class EmpleadoporComision extends Empleado{


    //Rodrigo ledesma Garcia

    private double porcentajePorComision;
    private double ventasBrutas;

    public EmpleadoporComision(String nombre, String apellidos, String id, double porcentajePorComision, double ventasBrutas) {
        super(nombre, apellidos, id);
        this.porcentajePorComision = porcentajePorComision;
        this.ventasBrutas = ventasBrutas;
    }

    public double getPorcentajePorComision() {
        return porcentajePorComision;
    }

    public void setPorcentajePorComision(double porcentajePorComision) {
        this.porcentajePorComision = porcentajePorComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    @Override
    public double ingresos() {
        return ((getVentasBrutas())*(getPorcentajePorComision()));
    }

    @Override
    public String toString() {
        return "Empleado por Comision"+
                "\nNombre del empleado "+getNombre()+
                "\nApellido del empleado "+getApellidos()+
                "\nVentas brutas mensuales "+getVentasBrutas()+
                "\nPorcentaje de comision "+getPorcentajePorComision()+" %"+
                "\nSalario del empleado "+ingresos()+" MXN."+
                "\n ";

    }
}
