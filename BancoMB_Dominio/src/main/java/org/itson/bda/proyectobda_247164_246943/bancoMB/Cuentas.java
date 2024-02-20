/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;

/**
 * Representa la información de las cuentas pertenecientes a los clientes del bancoMB.
 * @author Usuario
 */
public class Cuentas {
    
    private Integer numeroCuenta;
    private Date fechaApertura;
    private double saldo;
<<<<<<< HEAD
    private int idCliente;
=======
>>>>>>> e151d9ecee6963e4b54424c12fcb2d7b2226d498
    
    /**
     * Constructor por omisión de cuentas.
     */
    public Cuentas() {
    }

    /**
     * Constructor con parametros de la cuenta.
     * @param numeroCuenta regresa el numero de cuenta de la cuenta.
     * @param fechaApertura regresa la fecha de apertura de la cuenta.
     * @param saldo regresa el saldo de la cuenta.
     * @param idCliente
     */
<<<<<<< HEAD
    public Cuentas(Integer numeroCuenta, Date fechaApertura, double saldo, int idCliente) {
=======
    public Cuentas(Integer numeroCuenta, Date fechaApertura, double saldo) {
>>>>>>> e151d9ecee6963e4b54424c12fcb2d7b2226d498
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }
    /**
     * Constructor con parametros de la cuenta sin el numero de cuenta.
     * @param fechaApertura regresa la fecha de apertura de la cuenta.
     * @param saldo regresa el saldo de la cuenta.
     * @param idCliente
     */
<<<<<<< HEAD
    public Cuentas(Date fechaApertura, double saldo, int idCliente) {
=======
    public Cuentas(Date fechaApertura, double saldo) {
>>>>>>> e151d9ecee6963e4b54424c12fcb2d7b2226d498
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.idCliente = idCliente;
    }
    /**
     * 
     * @return get numero de cuenta de la cuenta.
     */
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Set de numero de cuenta de la cuenta.
     * @param numeroCuenta 
     */
    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * 
     * @return get de la fecha de apertura de la cuenta.
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }
    /**
     * set de la fecha de apertura de la cuenta.
     * @param fechaApertura 
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    /**
     * 
     * @return get del saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * set del saldo de la cuenta.
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    

    
}
