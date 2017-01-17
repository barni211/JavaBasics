package pl.lodz.uni.math.DaoFactorMaven.DaoFactor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.lodz.uni.math.DaoFactorMaven.Person.Person;

public class DaoFactor implements IDaoFactor {
	private static IDaoFactor dao = new DaoFactor();
	Map<EDaoFactory, IDaoFactor> types = new HashMap<EDaoFactory, IDaoFactor>();
	{
		types.put(EDaoFactory.DB, DaoDB.getInstance());
		types.put(EDaoFactory.XML, DaoXML.getInstance());
		types.put(EDaoFactory.WEB, DaoWEB.getInstance());
	}

	protected DaoFactor() {
	}

	public static DaoFactor getInstance() {
		return (DaoFactor) dao;
	}

	public void setSource(EDaoFactory value) {
		this.dao = types.get(value);
	}

	// @Override
	public Person getPersonById(int value) {
		return dao.getPersonById(value);// throw new
										// UnsupportedOperationException("Not
										// supported yet."); //To change body of
										// generated methods, choose Tools |
										// Templates.
	}

	// @Override
	public List<Person> selectAllUsers() {
		return dao.selectAllUsers();
	}

}
