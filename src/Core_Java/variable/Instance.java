package Core_Java.variable;
public class Instance {
 int rollnum = 10;
 int idnum;
 void goToSchool () 
{
	/*
	int n = 15;
	int x = n+rollnum;
	System.out.println(x);
	*/
	}
public static void main(String[] args) {
	Instance s = new Instance();
    System.out.println(s.rollnum);	
    
    Instance t = new Instance();
    t.rollnum = 20;
    System.out.println(t.rollnum);
    
    Instance u = new Instance();
    System.out.println(u.idnum);
    
    //assign value to idnum
    u.idnum=25;
    System.out.println(u.idnum);
    System.out.println(u.rollnum);
}
}

