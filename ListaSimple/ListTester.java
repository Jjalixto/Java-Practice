package ListaSimple;

public class ListTester {
    public static void main(String[] args) {
        
        SinglyLinkedList listaEnlazada = new SinglyLinkedList();

        // Agregar nodos a la lista enlazada (ejemplo)
        listaEnlazada.insertarAlFinal(10);
        listaEnlazada.insertarAlFinal(20);
        listaEnlazada.insertarAlFinal(30);

        listaEnlazada.printValues(); // Imprimirá "10 -> 20 -> 30 -> null"

        listaEnlazada.remove();
        listaEnlazada.printValues(); // Imprimirá "10 -> 20 -> null"
    }
}

