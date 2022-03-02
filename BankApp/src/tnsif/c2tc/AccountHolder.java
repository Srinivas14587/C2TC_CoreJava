package tnsif.c2tc;

import tnsif.c2tc.Applictaion.MMBankFactory;
import tnsif.c2tc.Applictaion.MMCurentAcc;
import tnsif.c2tc.Applictaion.MMSavingAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class AccountHolder {

	public static void main(String[] args) {
	BankFactory b=new MMBankFactory();
	SavingAcc sa=new MMSavingAcc(282928291,"Srinivas",1000);
	sa.withdraw(500);
	CurrentAcc ca= new MMCurentAcc(234556782,"santhosh",1000);
	ca.withdraw(500);

	}

}
