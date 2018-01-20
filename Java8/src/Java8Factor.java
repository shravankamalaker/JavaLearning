import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Factor {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9) ;
        int factor = 2;
        Stream st = integerList.stream()
                .map(e -> e * factor);
        //factor = 44; -- compiler complains that factor should be final
        st.forEach(System.out::println);
        
        //Alternatively
        int[] factorAr = new int[] {2};
        Stream stAr = integerList.stream()
                .map(e -> e * factorAr[0]);
        factorAr[0] = 44; //-- compiler doesnot complain
        stAr.forEach(System.out::println);


    }
}
