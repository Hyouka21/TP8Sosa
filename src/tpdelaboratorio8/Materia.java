
package tpdelaboratorio8;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public boolean equals(Object ob){
    if(ob!=null && ob instanceof Materia){
    Materia m=(Materia)ob;
    return (getIdMateria()==(m.getIdMateria()))&& (getNombre().equals(m.getNombre())) && (getAnio()==m.getAnio());
    }else {return false;}
    }
    
    @Override
    public int hashCode(){
    return nombre.hashCode()+ anio+idMateria;
    }
}
