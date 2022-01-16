package empresa;

import com.sistemas.empresa.Cliente;
import com.sistemas.empresa.Empleado;
import com.sistemas.empresa.Empresa;

import java.util.Scanner;

public class SegundoSistemas {
    public static void main(String[] args) {
        int opP, opE, horasTrabajadas;
        String nombre, apellido, direccion, strVip;
        long celular;
        boolean boolVip;

        Empresa empresa = new Empresa();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu Principal");
            System.out.println("1.-Empleados");
            System.out.println("2.-Clientes");
            System.out.println("3.-Salir");
            opP = sc.nextInt();
            switch (opP) {
                case 1:
                    do {
                        System.out.println("Menu Empleados");
                        System.out.println("1. Agregar Empleado");
                        System.out.println("2. Total Salarios");
                        System.out.println("3. Listar Empleados");
                        System.out.println("4. Salir");
                        opE = sc.nextInt();
                        switch (opE) {
                            case 1:
                                System.out.println("Nombre");
                                nombre = sc.next();
                                System.out.println("Apellido");
                                apellido = sc.next();
                                System.out.println("Direccion");
                                direccion = sc.next();
                                System.out.println("Celular");
                                celular = sc.nextLong();
                                System.out.println("Horas Trabajadas");
                                horasTrabajadas = sc.nextInt();
                                Empleado empleado = new Empleado(nombre, apellido, direccion, celular, horasTrabajadas);
                                empresa.agregarEmpleado(empleado);
                                break;
                            case 2:
                                System.out.println(empresa.calcularSalario());
                                break;
                            case 3:
                                empresa.listarEmpleados();
                                break;
                            case 4:
                                System.out.println("Saliendo al Menu Principal");
                                break;
                            default:
                                System.out.println("Opción Invalida");
                                break;

                        }
                    }
                    while (opE != 4);
                case 2:
                    do {
                        System.out.println("Menu Empleados");
                        System.out.println("1. Agregar Cliente");
                        System.out.println("2. Listar Clientes");
                        System.out.println("3. Salir");
                        opE = sc.nextInt();
                        switch (opE) {
                            case 1:
                                System.out.println("Nombre");
                                nombre = sc.next();
                                System.out.println("Apellido");
                                apellido = sc.next();
                                System.out.println("Direccion");
                                direccion = sc.next();
                                System.out.println("Celular");
                                celular = sc.nextLong();
                                System.out.println("Vip(si/no)");
                                strVip = sc.next();
                                if(strVip.equalsIgnoreCase("si")){
                                    boolVip=true;
                                }
                                else{
                                    boolVip=false;
                                }
                                Cliente cliente = new Cliente(nombre, apellido, direccion, celular, boolVip);
                                empresa.agregarCliente(cliente);
                                break;
                            case 2:
                                empresa.listarCliente();
                                break;
                            case 3:
                                System.out.println("Saliendo al Menu Principal");
                                break;
                            default:
                                System.out.println("Opción Invalida");
                                break;

                        }
                    }
                    while (opE != 3);
                case 3:
                    System.out.println("Saliendo del Programa");
                    break;
                default:
                    System.out.println("Opción Invalida");
            }
        }
        while (opP != 3);
    }
}
