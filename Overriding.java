//Superclass
class Animal{
public void makeSound(){
System.out.println("Some generic sound");
}//end of makeSound Method
}//end of class animal

//subclass Dog
class Dog extends Animal{
public void makeSound(){
System.out.println("Bark");
}//end of overriding make sound method
}//end of subclass Dog

//Subclass Cat
class Cat extends Animal{
public void makeSound(){
System.out.println("Meow");
}//end of overriding makeSound Method
}//end of subclass cat

public class Overriding{
public static void main(String [] args){
Animal dog = new Dog();
Animal cat = new Cat();

//call the make sound method of the dog class
dog.makeSound();
cat.makeSound();
}//end of main method
}//end of main class
