package listExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listExceptions{
    public static void main(String[] args) {
        
        try {
            ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("Hola Mundo");
            myList.add(48);
            myList.add("Adios Mundo");

            for(int i = 0; i < myList.size(); i++) {
            }

        } catch (Exception e) {
            System.out.println("Este codigo tiene un error");
        }

        try {
            List<String> listaStrings = new ArrayList<>();
                listaStrings.add("10");
                listaStrings.add("20");
                listaStrings.add("30");
                listaStrings.add("40");
                listaStrings.add("50");
            List<Integer> listaEnteros = listaStrings.stream().map(Integer::parseInt).collect(Collectors.toList()); 
            System.out.println(listaEnteros);   
        } catch (Exception e) {
            System.out.println("El codigo fallo");
        }
    }
}