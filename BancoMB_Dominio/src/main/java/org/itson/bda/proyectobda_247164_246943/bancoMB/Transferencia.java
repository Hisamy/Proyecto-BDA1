
package org.itson.bda.proyectobda_247164_246943.bancoMB;

/**
 * Representa la información de la transaferencia realizada por un usuario.
 * @author Usuario
 */
public class Transferencia {
    private int folio;
    private int cuentaOrigen;
    private int numeroCuentaReceptor;
    private double monto;
    private String motivoPago;
    /**
     * Constructor por omisión.
     */
    public Transferencia() {
    }
    /**
     * Constructor con parametros de transferencia.
     * @param cuentaOrigen Regresa la cuenta origen de la transferencia.
     * @param numeroCuentaReceptor Regresa el numero de cuenta del receptor de la transferencia.
     * @param monto Regresa el monto de la transferencia.
     * @param motivoPago Regresa el motivo de pago de la transferencia.
     */
    public Transferencia(int cuentaOrigen, int numeroCuentaReceptor, double monto, String motivoPago) {
        this.cuentaOrigen = cuentaOrigen;
        this.numeroCuentaReceptor = numeroCuentaReceptor;
        this.monto = monto;
        this.motivoPago = motivoPago;
    }
    /**
     * Constructor con parametros de transferencia.
     * @param folio Regresa el folio de la transferencia.
     * @param cuentaOrigen Regresa la cuenta origen de la transferencia.
     * @param numeroCuentaReceptor Regresa el numero de cuenta del receptor de la transferencia.
     * @param monto Regresa el monto de la transferencia.
     * @param motivoPago Regresa el motivo de pago de la transferencia.
     */
    public Transferencia(int folio, int cuentaOrigen, int numeroCuentaReceptor, double monto, String motivoPago) {
        this.folio = folio;
        this.cuentaOrigen = cuentaOrigen;
        this.numeroCuentaReceptor = numeroCuentaReceptor;
        this.monto = monto;
        this.motivoPago = motivoPago;
    }

 
    
    /**
     * 
     * @return get del folio de la transferencia.
     */
    public int getFolio() {
        return folio;
    }
    /**
     * set del folio de la transferencia.
     * @param folio 
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
    /**
     * 
     * @return get del numero de cuenta del receptor.
     */
    public int getNumeroCuentaReceptor() {
        return numeroCuentaReceptor;
    }
    /**
     * Set del numero de cuenta del receptor.
     * @param numeroCuentaReceptor 
     */
    public void setNumeroCuentaReceptor(int numeroCuentaReceptor) {
        this.numeroCuentaReceptor = numeroCuentaReceptor;
    }
    /**
     * 
     * @return get del monto de la transferencia.
     */
    public double getMonto() {
        return monto;
    }
    /**
     * set del monto de la transferencia.
     * @param monto 
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    /**
     * 
     * @return get del motivo de pago de la transferencia.
     */
    public String getMotivoPago() {
        return motivoPago;
    }
    /**
     * set del motivo de pago de la transferencia.
     * @param motivoPago 
     */
    public void setMotivoPago(String motivoPago) {
        this.motivoPago = motivoPago;
    }
    /**
     * 
     * @return get de la cuenta de origen de la transferencia.
     */
    public int getCuentaOrigen() {
        return cuentaOrigen;
    }
    /**
     * set de la cuenta de origen.
     * @param cuentaOrigen 
     */
    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    
    
}
