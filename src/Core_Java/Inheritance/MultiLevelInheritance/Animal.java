package Core_Java.Inheritance.MultiLevelInheritance;

public class Animal 
{
  void eat()
		{
			System.out.println("Animal eats");
		}
	public static void main(String[] args) {
	 BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	 Dog d = new Dog();
		d.bark();
		d.eat();
	Animal a = new Animal();
		a.eat();
 		
	}
	
}
