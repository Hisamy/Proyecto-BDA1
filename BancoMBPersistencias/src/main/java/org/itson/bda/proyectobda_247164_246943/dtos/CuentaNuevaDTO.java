
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;
import org.itson.bda.proyectobda_247164_246943.bancoMB.Clientes;


public class CuentaNuevaDTO {
    private Integer numeroCuenta;
    private Date fechaApertura;
    private double saldo;
    private Clientes idCliente;

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
