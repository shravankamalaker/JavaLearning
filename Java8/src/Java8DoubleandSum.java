import java.util.Arrays;
import java.util.List;

/**
 * @author Shravan
 */
public class Java8DoubleandSum {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        //traditional way...
        /*int total = 0;
        for( Integer e : values ){
            total += e * 2;
        }
        System.out.println("Total = "+total);*/

        //Mapping operation - eliminating immutability
        System.out.println(
                values.stream()
        .map(e->e*2)
        .reduce(0,(c,e)->c+e));

    }
}
