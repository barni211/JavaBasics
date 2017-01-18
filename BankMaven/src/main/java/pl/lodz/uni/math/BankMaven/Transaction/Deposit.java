package pl.lodz.uni.math.BankMaven.Transaction;

import java.util.Date;
import java.util.logging.Logger;

import pl.lodz.uni.math.BankMaven.User.Account;


public class Deposit extends Transaction{
	
	Logger logger = Logger.getAnonymousLogger();
	
	public Deposit(Account acc, Date date, String desc, Integer amount)
	{
		super(acc, date, desc, amount);
	}
	@Override
	public boolean doTransaction() {
		try
		{
			this.fromAccount.addToHistory(this);
			this.fromAccount.saldoMinus(this.amount);
			this.fromAccount.Deposit();
			//logger.info("Deposit transaction done. Number of transaction is " + this.fromAccount.countDeposits().toString());
			return true;
		}
		catch(Exception ex)
		{
			logger.info("Something went wrong. Transaction wasn't performed." + ex.toString());
			ex.printStackTrace();
			return false;
		}
	}
}
