
package tpdelaboratorio8;

import java.util.*;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    Set<Materia> materias= new HashSet<>();
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarMateria(Materia m){
    materias.add(m);
    }
    public int cantidadMaterias(){
    return materias.size();
    }
    
    
    
}
