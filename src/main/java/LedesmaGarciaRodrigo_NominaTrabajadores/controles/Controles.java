package LedesmaGarciaRodrigo_NominaTrabajadores.controles;

//Rodrigo ledesma Garcia

import LedesmaGarciaRodrigo_NominaTrabajadores.EmpleadoAsalariado;
import LedesmaGarciaRodrigo_NominaTrabajadores.EmpleadoBaseMasComision;
import LedesmaGarciaRodrigo_NominaTrabajadores.EmpleadoPorHoras;
import LedesmaGarciaRodrigo_NominaTrabajadores.EmpleadoporComision;


public class Controles {
    public static void main(String[] args) {

        EmpleadoAsalariado asalariado = new EmpleadoAsalariado("Mario","Lopez","123",30000.67
        );
        EmpleadoAsalariado asalariado1 = new EmpleadoAsalariado("Maria","Martines","124",45000.33
        );
        EmpleadoAsalariado asalariado2 = new EmpleadoAsalariado("Diana","Cavendish","125",50000.88
        );



        EmpleadoPorHoras porHoras = new EmpleadoPorHoras("Lorena", "Herrera","234",100, 500);

        EmpleadoPorHoras porHoras1 = new EmpleadoPorHoras("Fernando", "Salsedo","237",120, 480);

        EmpleadoPorHoras porHoras2 = new EmpleadoPorHoras("Manuel", "Suares","239",80, 750);



        EmpleadoporComision porComision = new EmpleadoporComision("Barbara","Saigado","678",14, 400);

        EmpleadoporComision porComision1 = new EmpleadoporComision("Maria","Sanchez","777",17, 900);

        EmpleadoporComision porComision2 = new EmpleadoporComision("Valeria","Garcia","999",19, 760);


        EmpleadoBaseMasComision baseMasComision  = new EmpleadoBaseMasComision("Moira", "Gutietres","343",.13, 700, 28500.00);

        EmpleadoBaseMasComision baseMasComision1  = new EmpleadoBaseMasComision("Marlena", "Rodriguez","111",.17, 600, 18500.00);

        EmpleadoBaseMasComision baseMasComision2  = new EmpleadoBaseMasComision("Pancho", "Perez","911",.11, 500, 17577.00);


        System.out.println(" ");
        System.out.println("====================== EMPLEADOS ASALARIADOS ======================");
        System.out.println(asalariado);
        System.out.println(asalariado1);
        System.out.println(asalariado2);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("====================== EMPLEADOS POR HORA ======================");
        System.out.println(porHoras);
        System.out.println(porHoras1);
        System.out.println(porHoras2);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("====================== EMPLEADOS POR COMISION ======================");
        System.out.println(porComision);
        System.out.println(porComision1);
        System.out.println(porComision2);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("====================== EMPLEADOS BASE MAS COMISION ======================");
        System.out.println(baseMasComision);
        System.out.println(baseMasComision1);
        System.out.println(baseMasComision2);
        System.out.println("-----------------------------------------------------------------------------------");

    }
}
