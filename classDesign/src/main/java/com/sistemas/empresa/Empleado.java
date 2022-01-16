package com.sistemas.empresa;

public class Empleado extends Persona {
    private int idEmpleado;
    private int horasTrabajadas;
    private final double valorHora = 8;
    private static int contEmpleado;

    public Empleado(String nombre, String apellido, String direccion, long celular, int horasTrabajadas) {
        super(nombre, apellido, direccion, celular);
        this.idEmpleado = ++contEmpleado;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {
        double salario;
        salario = this.valorHora * this.horasTrabajadas;
        return salario;
    }

    @Override
    public String toString() {
        return
                "idEmpleado=" + idEmpleado + super.toString() +
                        " Horas Trabajadas=" + horasTrabajadas +
                        " Valor Hora=" + valorHora;
    }
}
