package com.sistemas.empresa;

import java.util.Scanner;

public class Empresa {
    private final String NombreEmpresa = "SEGUNDOSISTEMAS";
    private Empleado empleados[];
    private Cliente clientes[];

    private static int posicionEmpleado = 0;
    private static int posicionCliente = 0;

    private static final int MAX_EMPLEADOS = 10;
    private static final int MAX_CLIENTES = 10;

    Scanner sc = new Scanner(System.in);

    public Empresa() {
        this.empleados = new Empleado[MAX_EMPLEADOS];
        this.clientes = new Cliente[MAX_CLIENTES];
    }

    public void agregarEmpleado(Empleado empleado) {
        try {
            this.empleados[posicionEmpleado++] = empleado;
            System.out.println("Se ha agregado correctamente el empleado");
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Ha excedido el numero maximo de empleados");
        }
    }

    public void agregarCliente(Cliente cliente) {
        try {
            this.clientes[posicionCliente++] = cliente;
            System.out.println("Se ha agregado correctamente el cliente");
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Ha excedido el numero maximo de cliente");
        }
    }

    public void listarEmpleados() {
        for (int i = 0; i < posicionEmpleado; i++) {
            System.out.println(this.empleados[i]);
        }
    }

    public void listarCliente() {
        for (int i = 0; i < posicionCliente; i++) {
            System.out.println(this.clientes[i]);
        }
    }
    public double calcularSalario(){
        double acumSalario=0;
        for(int i=0;i<posicionEmpleado;i++){
            acumSalario+=empleados[i].calcularSalario();
        }
        return acumSalario;
    }
}
