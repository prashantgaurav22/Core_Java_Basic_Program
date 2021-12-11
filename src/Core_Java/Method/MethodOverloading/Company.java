package Core_Java.Method.MethodOverloading;

public class Company {
	
	void ProvideSalary()
	{
		int a = 35000;
		System.out.println("Company Basic Salary is:"+a);
	}
void ProvideSalary(int a, float b)
{
	System.out.println("Company Basic Salary is:"+a+" "+"And D.A is:"+b);
	double c = a+b;
	System.out.println("Company Basic Salary and HRA Allowance is:"+c);
	//return "Company Basic+D.A total Salary is:"+c;
}
void ProvideSalary(double b, int a) 
{
	System.out.println("Company Basic Salary is:"+a+" "+"Comapny Travelling Allowance is:"+b);
	double c = a+b;
	System.out.println("Comapny Total Basic Salary+Travelling Allowance is:"+c);
}
void ProvideSalary(int a, float b, int c )
{
	System.out.println("Company Basic Salary is:"+a+" "+"And D.A is:"+b+" "+"Company Travelling Allowance is"+c);
	float d = a+b+c;
	System.out.println("Company Provide Total Salary including Basic+D.A+Travelling Allowance is:"+d);
}
public static void main(String[] args) {
	Company k = new Company();
	k.ProvideSalary();
    //k.ProvideSalary(35000, 1500);
    k.ProvideSalary(2225.60, 35000);
    //k.ProvideSalary(35000, 1750.25, 2225.60);
}
}
