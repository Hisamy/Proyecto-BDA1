
package org.itson.bda.proyectobda_247164_246943.bancoMB;


public class Transferencia {
    private int folio;
    private int cuentaOrigen;
    private int numeroCuentaReceptor;
    private float monto;
    private String motivoPago;

    public Transferencia() {
    }

    public Transferencia(int cuentaOrigen, int numeroCuentaReceptor, float monto, String motivoPago) {
        this.cuentaOrigen = cuentaOrigen;
        this.numeroCuentaReceptor = numeroCuentaReceptor;
        this.monto = monto;
        this.motivoPago = motivoPago;
    }

    public Transferencia(int folio, int cuentaOrigen, int numeroCuentaReceptor, float monto, String motivoPago) {
        this.folio = folio;
        this.cuentaOrigen = cuentaOrigen;
        this.numeroCuentaReceptor = numeroCuentaReceptor;
        this.monto = monto;
        this.motivoPago = motivoPago;
    }

 
    

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getNumeroCuentaReceptor() {
        return numeroCuentaReceptor;
    }

    public void setNumeroCuentaReceptor(int numeroCuentaReceptor) {
        this.numeroCuentaReceptor = numeroCuentaReceptor;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getMotivoPago() {
        return motivoPago;
    }

    public void setMotivoPago(String motivoPago) {
        this.motivoPago = motivoPago;
    }

    public int getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(int cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    
    
}
