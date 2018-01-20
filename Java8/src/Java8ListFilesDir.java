import java.io.File;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Java8ListFilesDir {
    public static void main(String[] args) {
        File dir = new File("C:\\Softwares");
        
        //Print Names in upper case comma separated
        File[] children = dir.listFiles();
        if( children != null ){
            System.out.println(Stream.of(children)
                    .map(File::getName)
                    .map(String::toUpperCase)
                    .collect(joining(", ")));
        }
    }
}
