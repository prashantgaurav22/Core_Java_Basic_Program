package Core_Java.Collection.Comparable;

public class Student implements Comparable<Student>{
	 int rollNum;
	 String Name;
	 double per;
	 
	 public Student(int rollNum,String Name,double per)
	 {
		 this.rollNum=rollNum;
		 this.Name=Name;
		 this.per=per;
	 }
	@Override
	public int compareTo(Student s) 
	{
		if(rollNum==rollNum)
			{
			return 0;
			}
	 else if(rollNum<s.rollNum)
		{
			return 1;
		}
	 else
	 {
		 return -1;
		}
		

	}
}
	