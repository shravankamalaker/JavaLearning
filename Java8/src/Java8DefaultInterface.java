
interface Fly{
    default public void takeOff(){
        System.out.println("FLy::takeOff");
    };
    default public void turn(){
        System.out.println("FLy::turn");
    };
    default public void cruise(){
        System.out.println("FLy::cruise");
    };
    default public void land(){
        System.out.println("FLy::land");
    };

}
interface FastFly extends Fly{
    default public void takeOff(){
        System.out.println("FastFly::takeOff");
    }
}

class Vehicle{
    public void  land(){
        System.out.println("Vehicle::land");
    }
}

class SeaPlane extends Vehicle implements FastFly, Sail{
    @Override
    public void cruise() {
        System.out.println("Seaplane::cruise");
        FastFly.super.cruise();//If we call with super then it refers to default methods
        //If called directly it will check for static method in interface
    }
}

interface Sail{
    default public void cruise(){
        System.out.println("Sail::Cruise");
    }
}

//Default Methods Rules
//
// 1. Defult methods gets ingerited automatically
// 2. We can override default methods, if not found checks for hierarchy and gets it
// 3. Methods in class hierarchy rule
// 4. If there is a collision between the methods

//--Abstract Class vs Interface
//Abstract class can have state but INterfacs do not have state
//We can have fields in Abstract class but not in Interfaces
//We cannot inherit from more than one abstract class whereas with interface we can implement many

public class Java8DefaultInterface {
    public void use(){
        SeaPlane seaPlane = new SeaPlane();
        seaPlane.takeOff();
        seaPlane.cruise();
        seaPlane.turn();
        seaPlane.land();//Method in class hierarchy rules
    }
    public static void main(String[] args) {
        new Java8DefaultInterface().use();
    }
}
