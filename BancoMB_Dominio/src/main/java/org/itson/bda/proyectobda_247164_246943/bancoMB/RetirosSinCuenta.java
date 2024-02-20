
package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;

/**
 * Representa la información de los retiros sin cuentas.
 * @author Usuario
 */
public class RetirosSinCuenta extends Transaccion{
    private Date fechaApertura;
    private int contrasenia;
    /**
     * Constructor por omisión.
     */
    public RetirosSinCuenta() {
    }
    /**
     * Constructor con parametros de retiros sin cuentas.
     * @param fechaApertura regresa la fecha de apertura de la cuenta.
     * @param contrasenia regresa la contraseña generada de retiros sin cuenta.
     * @param folio regresa el folio generado para retirar sin cuenta.
     * @param monto regresa el folio para retirar sin cuenta.
     */
    public RetirosSinCuenta(Date fechaApertura, int contrasenia, int folio, float monto) {
        super(folio, monto);
        this.fechaApertura = fechaApertura;
        this.contrasenia = contrasenia;
    }
    /**
     * Constructor con parametros de retiros sin cuenta.
     * @param fechaApertura regresa la fecha de apertura de la cuenta.
     * @param contrasenia regresa la contraseña generada de retiros sin cuenta.
     */
    public RetirosSinCuenta(Date fechaApertura, int contrasenia) {
        this.fechaApertura = fechaApertura;
        this.contrasenia = contrasenia;
    }
    /**
     * 
     * @return get fecha de apertura de retiro sin cuenta.
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }
    /**
     * set de fecha de apertura de retiro sin cuenta.
     * @param fechaApertura 
     */
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    /**
     * 
     * @return get de contraseñia de retiro sin cuenta.
     */
    public int getContrasenia() {
        return contrasenia;
    }
    /**
     * set contraseña de retiro sin cuenta.
     * @param contrasenia 
     */
    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
}
