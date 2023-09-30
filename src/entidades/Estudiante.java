/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public  class Estudiante extends Persona {
    
    private String codigo;

    
    public Estudiante(String codigo, String nombre) {
        super(nombre);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
     public String getTexto() {
        return  this.nombre+ " | " + this.codigo;
    }
    
}
