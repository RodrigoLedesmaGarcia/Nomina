package LedesmaGarciaRodrigo_NominaTrabajadores;

public class EmpleadoBaseMasComision extends EmpleadoporComision{

    private double salariobase;

    public EmpleadoBaseMasComision(String nombre, String apellidos, String id, double porcentajePorComision, double ventasBrutas, double salariobase) {
        super(nombre, apellidos, id, porcentajePorComision, ventasBrutas);
        this.salariobase = salariobase;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public double ingresos() {
        return (getSalariobase()+(getPorcentajePorComision()*getVentasBrutas()));
    }

    @Override
    public String toString() {
        return "Empleado base mas comision" +
                "\nNombre del empleado " + getNombre() +
                "\nApellido del empleado " + getApellidos() +
                "\nVentas brutas mensuales " + getVentasBrutas() +
                "\nPorcentaje de comision " + getPorcentajePorComision()+" %"+
                "\nSalario base "+getSalariobase()+" MXN."+
                "\nSalario del empleado " + ingresos() +" MXN."+
                "\n ";
    }
}
