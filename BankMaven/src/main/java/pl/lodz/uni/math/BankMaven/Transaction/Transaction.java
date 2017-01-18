package pl.lodz.uni.math.BankMaven.Transaction;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import pl.lodz.uni.math.BankMaven.User.Account;


//import pl.lodz.uni.math.ETransaction;

public abstract class Transaction {
	protected Account fromAccount;
	protected Date date;
	protected String description;
	protected Integer amount;
	//protected static Map<ETransaction, Transaction> transList = new HashMap<ETransaction, Transaction>();
	public abstract boolean doTransaction();
	
	
	protected Transaction(Account acc, Date date, String desc, Integer amount)
	{
		this.fromAccount=acc;
		this.date=date;
		this.description=desc;
		this.amount=amount;
	}
	
}
