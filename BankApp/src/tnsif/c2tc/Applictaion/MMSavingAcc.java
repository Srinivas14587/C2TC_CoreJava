package tnsif.c2tc.Applictaion;

import tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accName, float accBal) {
		super(accno, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println(" Your Withdrawl Amount is "+accBal+ " Your Remianing Balance "+minbal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", getAccno()=" + getAccno() + ", getAccName()=" + getAccName()
				+ ", getAccBal()=" + getAccBal() +  "]";
	}

}
