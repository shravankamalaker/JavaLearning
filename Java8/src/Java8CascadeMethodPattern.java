import java.util.function.Consumer;

public class Java8CascadeMethodPattern {
    public static void main(String[] args) {
        Resource1.use(
                resource -> 
                    resource.op1()
                            .op2()
        );
    }
}

class Resource1{
    private Resource1(){
        System.out.println("Creating....");
    }
    public Resource1 op1(){
        System.out.println("Operation 1");
        return this;
    }
    public Resource1 op2(){
        System.out.println("Operation 2");
        return this;
    }
    public void close(){
        System.out.println("CLosing");
    }
    public static void use(Consumer<Resource1> block){
        Resource1 resource = new Resource1();
        try{
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}
