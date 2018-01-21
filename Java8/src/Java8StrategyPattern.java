import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8StrategyPattern {
    public static int  totalValues(List<Integer> values, Predicate<Integer> selector){
        return values.stream()
                    .filter(selector)
                    .reduce(0, (c,e) -> c+e);
        //reduce starts with 0, e is the first element - then fold operation is performed
        //second time c is the result of the operation performed.
    }

    //Sending Lambda expressions
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        //Decide the strategy what is required and implementation is taken care
        System.out.println(totalValues(values, e->true));
        System.out.println(totalValues(values, e -> e % 2 == 0));
        System.out.println(totalValues(values, e -> e % 2 != 0));
    }
}
