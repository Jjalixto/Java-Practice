package Puzzles;
// import java.util.Collections;
// import java.util.List;
// import java.util.Random;
// import java.util.Arrays;

class Codeexample {
        public static void main(String[] args) {
        Coleccion coleccion = new Coleccion(); //se instancia la clase
        // ArrayList<Integer> numeros = new ArrayList<Integer>();
        // numeros.add(5);
        // numeros.add(4);
        // numeros.add(3);
        // numeros.add(2);
        // numeros.add(1);
        
        // Collections.shuffle(numeros);
        // System.out.println(numeros); // [5, 4, 3, 2, 1]
        // Collections.sort(numeros);
        // System.out.println(numeros); // [1, 2, 3, 4, 5]
        // Random r = new Random();
        // System.out.println(r.nextInt()); // Sin límites
        // System.out.println(r.nextInt(5)); // Con límites entre 0 y 5


        // int [] arr = {3,5,1,2,7,9,8,13,25,32};
        // coleccion.numberone(arr);
        // String[] name = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // // coleccion.mezclar(name);
        // ArrayList<String> numeros = new ArrayList<String>();
        // numeros.add(name[0]);
        // numeros.add(name[1]);
        // numeros.add(name[2]);
        // numeros.add(name[3]);
        // numeros.add(name[4]);

        // Collections.shuffle(numeros);
        // System.out.println(numeros);
        // coleccion.mezclar(name);


        // Character[] alfabeto = new Character[26];
        // coleccion.letras(alfabeto); 
        // List<Character> alfabetoList = Arrays.asList(alfabeto);
        // Collections.shuffle(alfabetoList);
        // char primera = alfabetoList.get(0);
        // char ultima = alfabetoList.get(alfabetoList.size()-1);
        // Coleccion.esVocal(primera);
        // Coleccion.esVocal(ultima);
        // System.out.println(alfabetoList);
        // Coleccion.generarNumerosAleatorios(10, 55, 100);
        
        // int[] ramdomNumbers = coleccion.exerciseFive(10, 55, 100);
        // System.out.println("Números aleatorios generados:");
        // for (int num : ramdomNumbers) {
        // System.out.println(num);
        // }
        // System.out.println("Valor mínimo: " + ramdomNumbers[0]);
        // System.out.println("Valor máximo: " + ramdomNumbers[ramdomNumbers.length - 1]);

        String randomString = coleccion.exerciseFix(5);
        System.out.println("Cadena aleatoria " + randomString);

        String[] randomStrings = coleccion.exerciseSeven(10, 5);
        System.out.println("Arreglo de cadenas aleatorias:");
        for (String result : randomStrings) {
            System.out.println(result);
        }
    }
}




