package pl.lodz.uni.math.BankMaven.Transaction;

import java.util.Date;
import java.util.logging.Logger;

import pl.lodz.uni.math.BankMaven.User.Account;
import pl.lodz.uni.math.BankMaven.User.User;



public class WireOut extends Transaction{
	private Account toAccount;
	private User user;
	private String swift;
	Logger logger = Logger.getAnonymousLogger();

	public WireOut(User user, Account fromAcc,Account toAcc, Date date, String desc, Integer amount,String swift)
	{
		super(fromAcc, date, desc, amount);
		this.toAccount=toAcc;
		this.swift=swift;
		this.user=user;
	}
	@Override
	public boolean doTransaction() {
		try
		{
		this.fromAccount.addToHistory(this);
		this.fromAccount.saldoMinus(this.amount);
		this.toAccount.saldoPlus(this.amount);
		user.wireOut();
		logger.info("Wire-out transaction done. The number of transaction is " + this.user.countWireOuts());
		return true;
		}
		catch (Exception ex)
		{
			logger.info("Something went wrong. Transaction wasn't performed." + ex.toString());
			ex.printStackTrace();
			return false;
		}
	}
}
