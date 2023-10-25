package Proyect_Class;

public class Project {
    
    private String nombre;
    private String descripcion;

    //constructor de la clase 

    public Project() {
    }
    public Project(String nombre) {
        this.nombre = nombre;
    }
    public Project(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //metodo para acceder y modificar los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
