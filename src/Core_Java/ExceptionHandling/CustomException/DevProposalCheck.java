package Core_Java.ExceptionHandling.CustomException;

public class DevProposalCheck
{
  void checkProposal(String girlName)
  {
	  if(girlName.equals("ShraddhaKapoor"))
		  
	  {
		  System.out.println("Accept the proposal");
	  }
	  
	  else
	  {
		  throw new LoveException("Rejected");
	  }
}
  public static void main(String[] args) {
	DevProposalCheck d = new DevProposalCheck();
	d.checkProposal("ShraddhaKapoor");
}
}