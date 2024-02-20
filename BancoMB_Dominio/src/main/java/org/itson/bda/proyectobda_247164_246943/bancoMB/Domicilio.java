
package org.itson.bda.proyectobda_247164_246943.bancoMB;

/**
 * Información acerca del domicilio del cliente.
 * @author Usuario
 */
public class Domicilio {
    private int numeroDomicilio;
    private String calle, colonia;
    private int CP;
    private int numeroCasa;
    /**
     * Constructor por omisión.
     */
    public Domicilio() {
    }

    /**
     * Constructor con parámetros de domicilio.
     * @param numeroDomicilio regresa el número de domicilio del domicilio.
     * @param calle regresa la calle del domicilio.
     * @param colonia regresa la colonia del domicilio.
     * @param CP regresa el codigo postal de domicilio.
     * @param numeroCasa regresa el número de casa del domicilio.
     */
    public Domicilio(int numeroDomicilio, String calle, String colonia, int CP, int numeroCasa) {
        this.numeroDomicilio = numeroDomicilio;
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numeroCasa = numeroCasa;
    }
    /**
     * Constructor de parametros del domicilio sin numero de domicilio
     * @param calle regresa la calle del domicilio.
     * @param colonia regresa la colonia del domicilio.
     * @param CP regresa el codigo postal de domicilio.
     * @param numeroCasa regresa el número de casa del domicilio.
     */
    public Domicilio(String calle, String colonia, int CP, int numeroCasa) {
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numeroCasa = numeroCasa;
    }
    /**
     * 
     * @return get de número de domicilio.
     */
    public int getNumero_domicilio() {
        return numeroDomicilio;
    }
    /**
     * set del número de domicilio.
     * @param numero_domicilio 
     */
    public void setNumero_domicilio(int numero_domicilio) {
        this.numeroDomicilio = numero_domicilio;
    }
    /**
     * 
     * @return get de la calle del domicilio.
     */
    public String getCalle() {
        return calle;
    }
    /**
     * set de la calle del domicilio.
     * @param calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * 
     * @return get de la colonia del domicilio.
     */
    public String getColonia() {
        return colonia;
    }
    /**
     * set de la colonia del domicilio.
     * @param colonia 
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    /**
     * 
     * @return get del codigo postal del domicilio.
     */
    public int getCP() {
        return CP;
    }
    /**
     * set del codigo postal del domicilio.
     * @param CP 
     */
    public void setCP(int CP) {
        this.CP = CP;
    }
    /**
     * 
     * @return get del numero de casa del domicilio.
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }
    /**
     * set del numero de casa del domicilio.
     * @param numeroCasa 
     */
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }
    
    
    
    
}
