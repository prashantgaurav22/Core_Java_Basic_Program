package Core_Java.Method.MethodOverloading;

public class Bar {
	void suppliesDrink()
	{
		System.out.println("Bar Supplies Beer");
	}
	void suppliesDrink(String drinkName)
	{
		System.out.println("Bar Supplies"+" "+drinkName);
	}
	void suppliesDrink(int price,String drinkName)
	{
		System.out.println("Bar Supplies"+" "+drinkName+" "+"of the cost"+" "+price);
	}
	void suppliesDrink(String drinkName, int price) 
	{
		System.out.println("Bar supplies"+" "+drinkName+" "+"of the cost"+" "+price);
	}
	public static void main(String[] args) {
		Bar b = new Bar();
		b.suppliesDrink();
		b.suppliesDrink("Vodka");
		b.suppliesDrink(340, "Old Monk");
		b.suppliesDrink("RS", 970);
				
	}
}
