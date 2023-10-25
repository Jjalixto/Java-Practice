package Puzzles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Coleccion {
    

    public Object numbertwo;

    void numberone(int [] arr){
        int sum = 0;
    ArrayList<Integer> ejerciciouno = new ArrayList<Integer>();
    for(int i = 0; i<arr.length; i++){
        sum = sum + arr[i];
        if(arr[i]>10){
            // System.out.println(arr[i]);
            ejerciciouno.add(arr[i]);
        }
        }
        System.out.println(ejerciciouno);
        System.out.println(sum);
    }

    void numbertwo(String [] arr){
        ArrayList<String> ejerciciodos = new ArrayList<String>();
        for(int i=0; i<arr.length;i++){
            ejerciciodos.add(arr[i]);
        }
        System.out.println(ejerciciodos);
    }

    void mezclar(String[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length()>5){
                System.out.println(arr[i]);
            }
        }
    }

    void letras(Character[] alfabeto){
        for(int i = 0; i < 26;i++){
            alfabeto[i] = (char)('A'+i);
        }
        
    }

    static void esVocal(char c){
        c = Character.toUpperCase(c);
        if( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            System.out.println("La primera letra del arreglo es "+ c);
        }else{
            System.out.println("La ultima letra del arreglo es "+ c);
        }
    }

    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        int[] numerosAleatorios = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Arreglo de números aleatorios:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        return numerosAleatorios;
    }

        public static int[] aleatorioMaxMin(int cantidad, int min, int max) {
        int[] numerosAleatorios = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Arreglo de números aleatorios:");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        return numerosAleatorios;
    }


      // 5
    int[] exerciseFive(int quantity, int min, int max) {
    int[] numbers = new int[quantity];
    Random random = new Random();

    for (int i = 0; i < quantity; i++) {
    numbers[i] = random.nextInt(max - min + 1) + min;
    }

    Arrays.sort(numbers);

    return numbers;
    }

    String exerciseFix(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder string = new StringBuilder();
    
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char character = characters.charAt(index);
            string.append(character);
        }
    
        return string.toString();
    }

    String[] exerciseSeven(int quantity, int length) {
        String[] arrayStrings = new String[quantity];
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
        for (int i = 0; i < quantity; i++) {
            StringBuilder string = new StringBuilder();
        for (int j = 0; j < length; j++) {
            int index = random.nextInt(characters.length());
            char character = characters.charAt(index);
            string.append(character);
        }
            arrayStrings[i] = string.toString();
        }
    
        return arrayStrings;
    }
}


