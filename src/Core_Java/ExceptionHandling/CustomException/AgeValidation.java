package Core_Java.ExceptionHandling.CustomException;

public class AgeValidation
{
	void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Welcome to Vote");
		}
		else
		{
			try 
			{
				throw new InvalidAgeException("Not Valid age for Voting");
			}
			catch(InvalidAgeException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		AgeValidation a = new AgeValidation();
		a.checkAge(19);
	}
}