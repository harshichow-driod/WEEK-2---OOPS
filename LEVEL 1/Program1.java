class Animal{
    public String name;
    public int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
}
class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}
class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Bird is making sound");
    }
}
public class Program1{
    public static void main(String[] args) {
        Animal animal=new Animal("Dinosaur", 1008);
        Dog dog=new Dog("Jimmy", 7);
        Cat cat=new Cat("stuart",10);
        Bird bird=new Bird("Sparrow", 2);
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
