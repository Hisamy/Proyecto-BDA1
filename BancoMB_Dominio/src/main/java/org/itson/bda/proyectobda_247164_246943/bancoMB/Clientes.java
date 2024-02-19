/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;


public class Clientes {

   
    private Integer id;
    private Date fechaNacimiento;
    private String correo;
    private Integer clave;
    private String nombre, apellidoMaterno, apellidoPaterno;
    private int edad;
    private int idDomicilio;

    public Clientes() {
    }

    public Clientes(Integer clave,String correo, Date fechaNacimiento, String nombre, String apellidoMaterno, String apellidoPaterno) {
       this.clave = clave;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
    }
    
    

    public Clientes(Integer id,Integer clave,String correo ,Date fechaNacimiento, String nombre, String apellidoMaterno, String apellidoPaterno) {
        this.id = id;
        this.clave = clave;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
  
    }
    
    public Clientes(Integer id,Integer clave,String correo ,Date fechaNacimiento, String nombre, String apellidoMaterno, String apellidoPaterno,
            Integer numeroDomicilio) {
        this.id = id;
        this.clave = clave;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.idDomicilio = numeroDomicilio;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }
    
  

    
    
    
}

