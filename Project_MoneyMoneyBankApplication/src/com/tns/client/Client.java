package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BankFactory p=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(23456788,"Hritik Jain",500000,true);
		CurrentAcc c=new MMCurrentAcc(23456789,"Harshal Bokade",400000,40000);
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		System.out.println(s);
		System.out.println(c);

	}

}
