
package org.itson.bda.proyectobda_247164_246943.bancoMB;

/**
 * Representa la información de la transacción realizada por un cliente.
 * @author Usuario
 */
public class Transaccion {
    private int folio;
    private float monto;
    /**
     * Constructor por omisión.
     */
    public Transaccion() {
    }

    /**
     * 
     * @param folio regresa ell folio de la transacción.
     * @param monto regresa el monto de la transacción.
     */
    public Transaccion(int folio, float monto) {
        this.folio = folio;
        this.monto = monto;
    }
    /**
     * 
     * @param monto regresa el monto de la transacción.
     */
    public Transaccion(float monto) {
        this.monto = monto;
    }
    /**
     * 
     * @return get del folio de la transacción.
     */
    public int getFolio() {
        return folio;
    }
    /**
     * regresa el set folio de la transacción.
     * @param folio 
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
    /**
     * 
     * @return getMonto del transacción.
     */
    public float getMonto() {
        return monto;
    }
    /**
     * regresa el monto de de la transacción.
     * @param monto 
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
    
}
