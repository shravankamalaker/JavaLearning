import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by KamalaSh on 16-01-2018.
 */
public class Java8HighOrderFunctions {

    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<>();
        for(int i=0; i< 10; i++)
        exampleList.add(i);

        exampleList.forEach( p-> System.out.println(p));
        
        Predicate<Integer> p = number -> number % 2  == 0;
        System.out.println( p.test(9) );
        
        Predicate<Integer> isGreaT = isGT(4);
        System.out.println(isGreaT.test(16));

        Predicate<Integer> isGrea = isGT(124);
        System.out.println(isGrea.test(16));
    }
    
    private static Predicate<Integer> isGT(int l){
        return number -> number > l;
    }
}
