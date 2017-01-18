package pl.lodz.uni.math.BankMaven.User;

import java.util.ArrayList;
import java.util.List;

import pl.lodz.uni.math.BankMaven.Bank.Bank;
import pl.lodz.uni.math.BankMaven.Transaction.Transaction;;

public class Account {
	private User user;
	private Integer number;
	private Bank bank;
	private List<Transaction> history = new ArrayList<Transaction>();
	private Integer depositCounter;
	private Integer checkCounter;
	private Integer saldo;

	public Account(User us, Integer number, Bank bank)
	{
		this.user=us;
		this.number=number;
		this.bank=bank;
		this.depositCounter=1000;
		this.checkCounter=100;
		this.saldo=0;
	}
	
	public void addToHistory(Transaction t)
	{
		history.add(t);
	}
	
	public List<Transaction> getHistory() throws Exception 
	{
		if(history.isEmpty())
		{
			throw new Exception("Lista jest pusta.");
		}
		else
		{
			return this.history;
		}
	}
	
	public void saldoPlus(int value) throws Exception
	{
		if(value < 0 )
		{
			throw new Exception("Nie można dodać wartości ujemnej, niż 0");
		}
		else
		{
			this.saldo+=value;
		}
	}
	
	public void saldoMinus(int value)
	{
		this.saldo-=value;
	}
	
	public Integer getSaldo()
	{
		return this.saldo;
	}
	
	public Integer countDeposits()
	{
		return depositCounter;
	}
	
	public void Deposit()
	{
		depositCounter++;
	}
	
	public void Check()
	{
		checkCounter++;
	}
	
	public Integer countChecks()
	{
		return this.checkCounter;
	}
	
	
}
