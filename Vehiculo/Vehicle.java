package Vehiculo;

class Vehicle {
    private int numberOfWheels;
    private String color;
    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String color) {
        this.color = color;      // es para especificar que es un atributo de la clase y no de parametros 
                                //de un metodo ten en cuenta eso
    }
}