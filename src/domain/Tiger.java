package domain;

public class Tiger extends Predator {

    private String kind;

    public Tiger(String name, int weight, int age, String kind) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind; 

    }

    public Tiger() {
        this("Screatchkin",130,4,"Bengal");
    }

    public Tiger(String name) {
        this(name,130,4,"Bengal");
    }

    public void play() {
        System.out.println("Animal is playing...");
        
    }

    @Override
    public void hunt() {
        System.out.println("Animal is hunting for an antelope...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nkind:\t"+this.kind+"\n\nThis is TIGER!";
    }

    @Override
    public void sleep() {
         System.out.println("Animal is sleeping on green grass...");
    }

    @Override
    public void speak() {
         System.out.println("Roar!Roar!");
    }

    @Override
    public void eat() {
         System.out.println("Tiger eats meat!");
    }
    
    
}
