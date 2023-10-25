package Pitagora;

public class Pitagora {
    public static void main(String[] args) {  //aqui se declaran las variables que se necesiten, luego se llama a una funcion, y la funcion tiene que devolver
        calcularHipotenusa(6, 10);
    }

    public static void calcularHipotenusa(int catetoA, int catetoB) {
        //La hipotenusa es el lado opuesto del ángulo recto.
        //Calcular el valor de c dados los valores catetoA y catetoB
        double catetoC = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
        System.out.println(catetoC);
    }
}
