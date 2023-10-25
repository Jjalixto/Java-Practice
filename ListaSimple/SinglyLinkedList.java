package ListaSimple;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {   //constructor
    }

    //remueve un nodo al final de la lista 

    public void remove() {
        if (head == null) {
            // La lista está vacía, no hay nada que remover
            return;
        } else if (head.getNext() == null) {
            // La lista tiene solo un nodo, remover el head
            head = null;
        } else {
            // Encontrar el penúltimo nodo
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            // Remover el último nodo
            current.setNext(null);
        }
    }

    public void insertarAlFinal(int value) {
        Node nuevoNodo = new Node(value);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(nuevoNodo);
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
