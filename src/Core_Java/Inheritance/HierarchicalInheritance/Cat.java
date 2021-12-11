package Core_Java.Inheritance.HierarchicalInheritance;

public class Cat extends Animal {
	 void meow() {
		
		 System.out.println("Cat is meowing");

	}
	 public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		Dog d = new Dog();
		d.bark();
		Animal a = new Animal();
		a.eat();
			
	 }

}
