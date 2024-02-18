
package org.itson.bda.proyectobda_247164_246943.dtos;

import java.sql.Date;
import java.time.LocalDateTime;


public class RetiroSinCuentaNuevoDTO{
    private int folio;
    private int contrasenia;
    private Float monto;
    private LocalDateTime fechaGenerada;

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    
    public int getClave() {
        return contrasenia;
    }

    public void setClave(int clave) {
        this.contrasenia = clave;
    }

    public LocalDateTime getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(LocalDateTime fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
    
    
}
