package task_9;

public class Bankaccount {
	
private String Accountholdername;
private long Accountnumber;
private double Accountbalance;


	public void setAccountholdername(String Accountholdername) {
		this.Accountholdername=Accountholdername;
	}
	
	public void setAccountnumber(long Accountnumber) {
		this.Accountnumber=Accountnumber;
	}
	
	public void setAccountbalance(double Balance)
		{
		if (Accountbalance>=0) 
		{
		this.Accountbalance=Balance;	
		}
		else 
		{
		System.out.println("Insufficient funds");
		}
		}
		
	public String getAccountholdername()
	{
	return Accountholdername;
	}
	public long getAccountnumber() 
	{
	return Accountnumber;
	}
	public double getAccountbalance() 
	{
	return Accountbalance;
	}

public static void main(String[] args) {
		
	Bankaccount BK = new Bankaccount();
	BK.setAccountholdername("Barkavi");
	BK.setAccountnumber(900456781);
	BK.setAccountbalance(12345);
	
	System.out.println(BK.getAccountholdername());
	System.out.println(BK.getAccountnumber());
	System.out.println(BK.getAccountbalance());
	
}

}