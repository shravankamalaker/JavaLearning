import java.util.function.Consumer;

/**
 * This is called as Execute around method becuz we dont allow the user to create or modify the object
 * We give "use" method - which does things around the method - i.e., before and after - clean up method
 */
public class Java8ExecuteAround {
    public static void main(String[] args) {
        Resource.use(
            resource -> {
                resource.op1();
                resource.op2();
            }
        );
    }
}

class Resource{
    private Resource(){
        System.out.println("Creating....");
    }
    public void op1(){
        System.out.println("Operation 1");
    }
    public void op2(){
        System.out.println("Operation 2");
    }
    public void close(){
        System.out.println("CLosing");
    }
    public static void use(Consumer<Resource> block){
        Resource resource = new Resource();
        try{
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}
