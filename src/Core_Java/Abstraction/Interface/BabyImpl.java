package Core_Java.Abstraction.Interface;

public class BabyImpl implements ICat,IDog{

	@Override
	public void eat() 
	{
	 System.out.println("Animal is Eating.");	
	}

	@Override
	public void Bark() 
	{
	 System.out.println("Dog is Barking.");	
	}

	@Override
	public void Meow() 
	{
     System.out.println("Cat is Meowing.");		
	}
	
	public static void main(String[] args) 
	{
	 BabyImpl b = new BabyImpl();
	 b.Bark();
	 b.eat();
	 b.Meow();
	}
}
