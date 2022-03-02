package tnsif.c2tc.framework;

public class BankAcc {
	private int accno;
    private String accName;
    private float accBal;
	
     public BankAcc(int accno, String accName, float accBal) {
		this.accno = accno;
		this.accName = accName;
		this.accBal = accBal;
	    
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
    
    public void withdraw(float accBal)
    {
    	System.out.println("The withdrawl amount is  "+ accBal);
    }
    public void deposite(float accBal)
    {
    	System.out.println("The deposited Amount is "+ accBal);
    }
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accName=" + accName + ", accBal=" + accBal + "]";
	}
	
}
	 

