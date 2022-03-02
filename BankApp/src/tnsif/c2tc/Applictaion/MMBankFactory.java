package tnsif.c2tc.Applictaion;

import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	public SavingAcc getNewSavingAccount(int accno,String accName, float accBal) {
		MMSavingAcc sa=new MMSavingAcc(accno,accName,accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accName, float accBal) {
		MMCurentAcc ca=new MMCurentAcc(accno,accName,accBal);
		return ca;
	}
	
}