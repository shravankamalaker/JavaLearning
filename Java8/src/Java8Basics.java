import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

/**
 * Created by KamalaSh on 16-01-2018.
 */
public class Java8Basics {

    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<>();
        for(int i=0; i< 10; i++)
        exampleList.add(i);
        
        exampleList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("For each integer = "+integer);
            }
        });
        
        MyConsumer myConsumer = new MyConsumer();
        exampleList.forEach(myConsumer);
    }
    
    static class MyConsumer implements Consumer<Integer>{
        @Override
        public void accept(Integer integer) {
            System.out.println("inside method each integer = "+integer);
        }
    }


    public static void testStringJoinerMethod() throws Exception {
        StringJoiner stringJoiner = new StringJoiner("-");
        stringJoiner.add("Shravan");stringJoiner.add("Kumar");stringJoiner.add("Kamalaker");stringJoiner.add("ADP");
     
        System.out.println("Joined String = "+stringJoiner);
    }

}
