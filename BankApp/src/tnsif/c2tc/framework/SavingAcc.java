package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc{
	
	public SavingAcc(int accno, String accName, float accBal) {
		super(accno, accName, accBal);
		// TODO Auto-generated constructor stub
	}
	private  static boolean isSalary=true;
	protected static final  float  minbal=1000;
	
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		SavingAcc.isSalary = isSalary;
	}
	
	public static float getMinbal() {
		return minbal;
	}
	

}
