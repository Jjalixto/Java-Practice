package Proyect_Class;

public class ProjectTest {
    
    public static void main(String[] args) {
        
    // Crear un nuevo objeto de la clase Project
    Project proyecto = new Project("Proyecto Ejemplo", "Este es un proyecto de ejemplo");

    // Acceder a los campos del objeto
    System.out.println(proyecto.getNombre()); // Imprimirá "Proyecto Ejemplo"
    System.out.println(proyecto.getDescripcion()); // Imprimirá "Este es un proyecto de ejemplo"

    // Modificar los campos del objeto
    proyecto.setNombre("Nuevo Proyecto");
    proyecto.setDescripcion("Esta es la nueva descripción");
    
    }
}