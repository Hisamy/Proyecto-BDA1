
package org.itson.bda.proyectobda_247164_246943.bancoMB;


public class Domicilio {
    private int numeroDomicilio;
    private String calle, colonia;
    private int CP;
    private int numeroCasa;

    public Domicilio() {
    }

    
    public Domicilio(int numeroDomicilio, String calle, String colonia, int CP, int numeroCasa) {
        this.numeroDomicilio = numeroDomicilio;
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numeroCasa = numeroCasa;
    }

    public Domicilio(String calle, String colonia, int CP, int numeroCasa) {
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numeroCasa = numeroCasa;
    }

    public int getNumero_domicilio() {
        return numeroDomicilio;
    }

    public void setNumero_domicilio(int numero_domicilio) {
        this.numeroDomicilio = numero_domicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    
    
    
}
