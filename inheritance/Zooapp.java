package inheritance;

class Animal {
 public void eat() {
     System.out.println("This animal is eating.");
 }
}


class Lion extends Animal {
 public void roar() {
     System.out.println("The lion roars.");
 }
}


public class Zooapp {
 public static void main(String[] args) {
     Lion lion = new Lion();
     
     lion.eat();   
     lion.roar();  
 }
}
