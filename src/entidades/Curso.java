/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author jaime
 */
public class Curso {

    private String codigo;
    private int creditos;
    private String nombre;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso(String codigo, int creditos, String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public String getTexto() {
        return this.nombre + " | " + this.codigo+ "| Cred:"+this.creditos;
    }

    public void agregarProfesor(Profesor profe) {
        if (this.profesores != null
                && this.profesores.size() >= 0) {
            profesores.add(profe);
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (this.estudiantes != null
                && this.estudiantes.size() >= 0) {
            estudiantes.add(estudiante);
        }
    }

}
