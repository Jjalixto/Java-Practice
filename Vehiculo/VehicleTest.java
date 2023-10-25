package Vehiculo;

class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle(); //se instancia de la clase Vehicle y se crea una variable bike o car 
        Vehicle car = new Vehicle();
        bike.setNumberOfWheels(2); //se pone la variable con el metodo que va retornar en este caso es el setter
        bike.setColor("rojo");// se esta retornando con un setter color
        int bikeWheels = bike.getNumberOfWheels(); //mediante esta variable se esta recuperando el valor dado(2)numero
        String bikeColor = bike.getColor(); //mediante esta variable se esta recuperando el valor dado("rojo") color
        car.setNumberOfWheels(4);//color de la bicicleta
        car.setColor("verde");//color del carro
        int carWheels = car.getNumberOfWheels(); //solo se esta recupernado los metodos y las funciones que contienen
        String carColor = car.getColor();// hasta aqui no esta imprimiendo nada ojito 
        System.out.println("Objeto Bicicleta - Llantas: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Objeto Carro - Llantas: " + carWheels + ", Color: " + carColor);
    }
}
//recuerda que el metodo this.xxx es como si fuera una variable en si this.age = ageParam es igual a age = ageParam
