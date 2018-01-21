import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,54,6);

        //Traditional Way....
        /*for( int i =0 ;i < values.size(); i++){
            System.out.println(values.get(i));
        }*/

        //java 5 forEach
        /*for( Integer i : values ){
            System.out.println(i);
        }*/

        //Anonymous inner class -> Consumer function -- Internal iterator rather than external
        //Functional Interface - is an interface has Single Abstract Method - SAM
        //This code has lot of ceremony
        /*values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        //Anonymous function (paramter -> body) - lambda expression
        //values.forEach((Integer value) -> System.out.println(value));

        //Java is intelligent enough to identify the type based on the context
        //Type inference
        //values.forEach((value) -> System.out.println(value));

        //values.forEach(value -> System.out.println(value));

        //**lamdas will not generate any anonymmous classes
        //**invokedynamic will be used instead - since it has right method signature

        //Using Java8 Method References
        //Used only in office space pattern - jus pass it through without any alteration
        values.forEach(System.out::println);
    }
}
