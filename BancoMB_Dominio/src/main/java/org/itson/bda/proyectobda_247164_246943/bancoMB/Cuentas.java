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
    private float saldo;
    
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
     */
    public Cuentas(Integer numeroCuenta, Date fechaApertura, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }
    /**
     * Constructor con parametros de la cuenta sin el numero de cuenta.
     * @param fechaApertura regresa la fecha de apertura de la cuenta.
     * @param saldo regresa el saldo de la cuenta.
     */
    public Cuentas(Date fechaApertura, float saldo) {
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
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
    public float getSaldo() {
        return saldo;
    }
    /**
     * set del saldo de la cuenta.
     * @param saldo 
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}
