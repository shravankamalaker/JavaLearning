import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by KamalaSh on 16-01-2018.
 */
public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<Integer>();
        for(int i=0; i< 10; i++)
        exampleList.add(i);

        Stream<Integer> integerStream = exampleList.stream();
        Stream<Integer> integerParallelStream = exampleList.parallelStream();
        Stream<Integer> highNums = integerParallelStream.filter(p -> p > 6);
        
        highNums.forEach(p -> System.out.println("High Numns parallel"+ p));
        
        Stream<Integer> highNumsSeq = integerStream.filter( p -> p >6);
        highNumsSeq.forEach(p -> System.out.println("High Numns series"+ p));
    }
}
