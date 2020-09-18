
package tpdelaboratorio8;


public class Colegio {


    public static void main(String[] args) {
     
        Materia ing = new Materia(1,"Ingles",1);
        Materia mat = new Materia(2,"Matematica",1);
        Materia lab = new Materia(3,"Laboratorio",1);
        Alumno alum1= new Alumno(1001,"Lopez","Martin");
        Alumno alum2= new Alumno(1002,"Martinez","Brenda");
        alum1.agregarMateria(mat);
        alum1.agregarMateria(lab);
        alum1.agregarMateria(ing);
        alum2.agregarMateria(mat);
        alum2.agregarMateria(lab);
        alum2.agregarMateria(ing);
        alum2.agregarMateria(lab); 
        System.out.println(alum1.cantidadMaterias());
        System.out.println(alum2.cantidadMaterias());
        
    }
    
}
