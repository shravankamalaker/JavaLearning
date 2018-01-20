import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Java8OptionalNull {
    public static void main(String[] args) {
        List<Timeslot> timeslots = Arrays.asList(
                new Timeslot(),new Timeslot(),new Timeslot(),new Timeslot(),new Timeslot(),new Timeslot(),new Timeslot());
        //If available schedule return with the frst available else null - handle null also
        Timeslot firstval = timeslots.stream()
                .filter(Timeslot::isAvailable)
                .findFirst()
                .orElse(new Timeslot());

        System.out.println("Fisrt value = "+ firstval);
        Optional firstValue =
                timeslots.stream()
                        .filter(Timeslot::isAvailable)
                        .findFirst();

        if( firstValue.isPresent()){
            firstValue.get();
        }
        System.out.println("firstValue = "+ firstValue);
                
        
    }
}

class Timeslot{
    static  Random random = new Random();
    
    public void schedule(){
        
    }
    public boolean isAvailable(){
        return random.nextBoolean();
    }
}