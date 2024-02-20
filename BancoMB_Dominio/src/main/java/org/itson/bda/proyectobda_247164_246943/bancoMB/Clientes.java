/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.bda.proyectobda_247164_246943.bancoMB;

import java.sql.Date;

/**
 * Representa información sobre los clientes del programa BancoMB.
 * @author 00000246943_00000247164
 */
public class Clientes {

   
    private Integer id;
    private Date fechaNacimiento;
    private String correo;
    private Integer clave;
    private String nombre, apellidoMaterno, apellidoPaterno;
    private int edad;
    private int idDomicilio;
    
    /**
     * Constructor por omisión de Clientes.
     */
    public Clientes() {
    }
    
    /**
     * Parametros del constructor del cliente.
     * @param clave regresa la clave de cuatro digitos del cliente.
     * @param correo regresa el correo eléctronico del cliente.
     * @param fechaNacimiento regresa la fecha de nacimiento del cliente.
     * @param nombre regresa el nombre del cliente.
     * @param apellidoMaterno regresa el apellido materno del cliente.
     * @param apellidoPaterno  regresa el apellido paterno del cliente.
     */
    public Clientes(Integer clave,String correo, Date fechaNacimiento, String nombre, String apellidoMaterno, String apellidoPaterno) {
        this.clave = clave;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
    }
    
    
    /**
     * Parametros del constructor del cliente con id.
     * @param id regresa el id  del cliente.
     * @param clave regresa la clave de cuatro digitos del cliente.
     * @param correo regresa el correo eléctronico del cliente.
     * @param fechaNacimiento regresa la fecha de nacimiento del cliente.
     * @param nombre regresa el nombre del cliente.
     * @param apellidoMaterno regresa el apellido materno del cliente.
     * @param apellidoPaterno regresa el apellido paterno del cliente.
     */
    public Clientes(Integer id,Integer clave,String correo ,Date fechaNacimiento, String nombre, String apellidoMaterno, String apellidoPaterno) {
        this.id = id;
        this.clave = clave;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
  
    }
    /**
     * Parametros del constructor del cliente con id y domicilio.
     * @param id regresa el id  del cliente.
     * @param clave regresa la clave de cuatro digitos del cliente.
     * @param correo regresa el correo eléctronico del cliente.
     * @param fechaNacimiento regresa la fecha de nacimiento del cliente.
     * @param nombre regresa el nombre del cliente.
     * @param apellidoMaterno regresa el apellido materno del cliente.
     * @param apellidoPaterno regresa el apellido paterno del cliente.
     * @param numeroDomicilio regresa el numero de domicilio del cliente.
     */
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
    
    /**
     * 
     * @return Get del id del cliente.
     */
    public Integer getId() {
        return id;
    }
    /**
     * set del id de cliente.
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 
     * @return Get de la fecha de nacimiento del cliente.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * set de la fecha de nacimiento del cliente.
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * 
     * @return Get del nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * set del nombre del cliente.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Get del apellido materno del cliente.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * Set del apellido materno del cliente.
     * @param apellidoMaterno 
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    /**
     * 
     * @return Get del apellido paterno del cliente
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    /**
     * Set del apellido paterno del cliente
     * @param apellidoPaterno 
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    /**
     * 
     * @return Get de la edad del cliente.
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Set de la edad del cliente.
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }
    /**
     * set del domicilio del cliente.
     * @param idDomicilio 
     */
    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }
    /**
     * 
     * @return get del correo eléctronico del cliente.
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Set del correo eléctronico del cliente.
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * 
     * @return Get de la clave del cliente.
     */
    public Integer getClave() {
        return clave;
    }
    /**
     * Set de la clave del cliente.
     * @param clave 
     */
    public void setClave(Integer clave) {
        this.clave = clave;
    }
    
  

    
    
    
}

