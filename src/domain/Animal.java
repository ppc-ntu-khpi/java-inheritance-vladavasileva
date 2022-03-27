package domain;

public class Animal {

    protected String name;

    protected  int weight;

    protected  int age;

    public Animal() {
        name = "generic animal"; 
        weight = 130; 
        age = 20; 
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
      System.out.println("Animal is speaking...");  
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\name:\t" + name + "\nweight:\t=" + weight + "\nage:\t" + age;
    }

    
}
