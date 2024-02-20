
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;

/**
 * Representa la información de las cuentas pertenecientes a los clientes del bancoMB.
 *
 */
public class Cuentas {
    
    private Integer numeroCuenta;
    private Date fechaApertura;
    private double saldo;
    private Clientes idCliente;
    

    public Cuentas(Date fechaApertura, double saldo, Clientes idCliente) {
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }

    public Cuentas(Integer numeroCuenta, Date fechaApertura, double saldo, Clientes idCliente) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }



    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    

    
}
