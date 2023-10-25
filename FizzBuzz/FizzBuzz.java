package FizzBuzz;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        // lógica de fizzbuzz aquí
            if(number%3==0 && number%5==0){
                return("FizzBuzz");
            }else if(number%3==0){
                return("Fizz");
            }else if(number%5==0){
                return("Buzz");
            }else if(number%2==0){
                System.out.println(number);
            }
                return null;
    }
}