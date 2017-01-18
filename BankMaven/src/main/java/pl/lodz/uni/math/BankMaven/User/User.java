package pl.lodz.uni.math.BankMaven.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import pl.lodz.uni.math.BankMaven.Bank.Bank;


public class User {
	Logger logger = Logger.getAnonymousLogger();
	private String firstName;
	private String lastName;
	private Integer wireOutCounter;
	private List<Account> userAccounts = new ArrayList<Account>();
	public User(String fname, String lname)
	{
		this.firstName=fname;
		this.lastName=lname;
		this.wireOutCounter=0;
	}
	public void wireOut()
	{
		wireOutCounter++;
	}
	
	public boolean addAccount(Integer number, Bank bank)
	{
		try
		{
		Account acc = new Account(this, number, bank);
		userAccounts.add(acc);
		logger.info("New account to user " + this.firstName + " " + this.lastName + " successfull added");
		return true;
		}
		catch (Exception ex)
		{
			logger.info("Account wasn't created. " + ex.toString());
			ex.printStackTrace();
			return false;
		}
	}
	
	public void deleteAccount(Account acc)
	{
		userAccounts.remove(acc);
	}
	
	public Integer countWireOuts()
	{
		return this.wireOutCounter;
	}

	
}
