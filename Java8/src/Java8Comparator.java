import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {
    public static void printSorted(List<Person> personList, Comparator<Person> comparator){
        personList.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sara", 12),
                new Person("Mark", 43),
                new Person("Bob", 12),
                new Person("Jill", 64)
        );
        
        //Comparator<Person> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        //printSorted(people,comparator);

        printSorted(people,Comparator.comparing(Person::getName));
        
        //Compare based on the age
        printSorted(people,Comparator.comparing(Person::getAge));

        //Compare based on the age aif age = equal then compare based on name
        printSorted(people,Comparator.comparing(Person::getAge)
        .thenComparing(Person::getName));
        
        
        //System.out.println(people);
    }
}

