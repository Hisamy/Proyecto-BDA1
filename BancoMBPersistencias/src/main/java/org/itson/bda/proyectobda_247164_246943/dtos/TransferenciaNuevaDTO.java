
package org.itson.bda.proyectobda_247164_246943.dtos;


public class TransferenciaNuevaDTO {
     private int folio;
     private int numeroCuentaOrigen;
    private int numeroCuentaReceptor;
    private double monto;
    private String motivoPago;

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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivoPago() {
        return motivoPago;
    }

    public void setMotivoPago(String motivoPago) {
        this.motivoPago = motivoPago;
    }

    public int getNumeroCuentaOrigen() {
        return numeroCuentaOrigen;
    }

    public void setNumeroCuentaOrigen(int numeroCuentaOrigen) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
    }
    
    
    
}
