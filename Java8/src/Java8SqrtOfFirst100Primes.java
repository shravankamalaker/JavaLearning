import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java8SqrtOfFirst100Primes {

    public static void main(String[] args) {
        List<Double> sumoffirst100Primes = 
                Stream.iterate(1, e -> e+1 )
                .filter(Java8SqrtOfFirst100Primes::isPrime)
                .map(Math::sqrt)
                .limit(100)
                .collect(toList());
        System.out.print("sumoffirst100Primes=>"+sumoffirst100Primes.size() + "\nsumoffirst100Primes get 0 = "+sumoffirst100Primes.get(0));
    }
    public static boolean isPrime(int number){
        return number > 1 && IntStream.range(2,number-1)
                .noneMatch( i -> number % i ==0);
    }
}
