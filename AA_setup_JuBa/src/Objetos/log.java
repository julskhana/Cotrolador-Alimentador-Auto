/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author julian
 */
public class log implements Serializable{
    
    private int id;
    private String nombre;
    private String descripcion;
    private String valor;
    private Date fecha_hora;
    private String tipo;
    private String prioridad;
    private float temperatura;
    private int id_evento;
    
    //cosntructor 

    public log(int id, String nombre, String descripcion,String valor, Date fecha_hora, String tipo, String prioridad, float temperatura, int id_evento, int dispositivo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha_hora = fecha_hora;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.temperatura = temperatura;
        this.id_evento = id_evento;
    }
    
    //constructor para ingresar a base de datos

    public log(String nombre, String descripcion,String valor, Date fecha_hora, String tipo, String prioridad, float temperatura, int id_evento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha_hora = fecha_hora;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.temperatura = temperatura;
        this.id_evento = id_evento;
    }
    
    //constructor vacio
    public log() {
    }

    //set
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    //get

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getValor() {
        return valor;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public int getId_evento() {
        return id_evento;
    }

}
