package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(181,"Ankita", 500, true);
		NormalAcc n=new GSNormalAcc(182,"Pratyenchya",500,50);
		System.out.println("Prime Account");
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		//System.out.println(s.getNewPrimeAcc(1, "Hritik", 1100, true));
		System.out.println(p);
		//System.out.println(s.getNewNormalAcc(2, "Anoop", 1000, 50));
		System.out.println(n);
	}

}
