package tnsif.c2tc.Applictaion;

import tnsif.c2tc.framework.CurrentAcc;

public class MMCurentAcc extends CurrentAcc {

	public MMCurentAcc(int accno, String accName, float accBal) {
		super(accno, accName, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accBal) {
		System.out.println("You Withdrawl Amount is  "+accBal+" Your Remaining  Credit Balance " +creditLimit);
	}
  
}


