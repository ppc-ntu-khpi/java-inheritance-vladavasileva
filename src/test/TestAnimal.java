package test;

import domain.Tiger;

public class TestAnimal {

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Rychalkin");
          System.out.println("Tiger");
          tiger.hunt();
          tiger.eat();
          tiger.speak();
          tiger.play();
          tiger.sleep();
          
    }
}
