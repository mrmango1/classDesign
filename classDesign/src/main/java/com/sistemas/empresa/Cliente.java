package com.sistemas.empresa;

public class Cliente extends Persona {
    private int idCliente;
    private boolean vip;
    private static int contCliente = 0;

    public Cliente(String nombre, String apellido, String direccion, long celular, boolean vip) {
        super(nombre, apellido, direccion, celular);
        this.idCliente = ++contCliente;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return
                "idCliente=" + idCliente + super.toString() +
                        " vip=" + vip ;
    }
}
