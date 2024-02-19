
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

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public LocalDateTime getFechaGenerada() {
        return fechaGenerada;
    }

    public void setFechaGenerada(LocalDateTime fechaGenerada) {
        this.fechaGenerada = fechaGenerada;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
}
