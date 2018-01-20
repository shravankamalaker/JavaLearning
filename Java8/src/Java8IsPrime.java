import java.util.stream.IntStream;

public class Java8IsPrime {
    public static void main(String args[]){
        System.out.print(isPrime(5));
    }
    
    public static boolean isPrime(int number){
        return number > 1 && 
                IntStream.range(2,number-1)
                        .noneMatch( i -> number % i ==0);
    }
}
