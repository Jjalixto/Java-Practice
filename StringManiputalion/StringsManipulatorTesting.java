package StringManiputalion;
public class StringsManipulatorTesting {
    public static void main(String[] args) {
    
    // StringManipulator manipulator = new StringManipulator();
    //     String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
    //     System.out.println(str.trim()); // HolaMundo 

    // StringManipulator manipulator = new StringManipulator();
    //     char letter = 'n';
    //     int a = manipulator.getIndexOrNull("Coding", letter);
    //     int b = manipulator.getIndexOrNull("Hola Mundo", letter);
    //     int c = manipulator.getIndexOrNull("Saludar", letter);
    //     System.out.println(a); // 4
    //     System.out.println(b); // 7
    //     System.out.println(c); // -1

    StringManipulator manipulator = new StringManipulator();
    String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
    System.out.println(word); // olmundo
    }
}
