package pl.lodz.uni.math.DaoFactorMaven.DaoFactor;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

import pl.lodz.uni.math.DaoFactorMaven.Person.Person;

public class DaoDB implements IDaoFactor {
	private static DaoDB instance = null;

	private DaoDB() {
	}

	public static DaoDB getInstance() {
		if (instance == null)
			instance = new DaoDB();
		return instance;
	}

	// @Override
	public Person getPersonById(int value) {
		Person per = EasyMock.createMock(Person.class);
		return per;// new Person(value);//throw new
					// UnsupportedOperationException("Not supported yet."); //To
					// change body of generated methods, choose Tools |
					// Templates.
	}

	// @Override
	public List<Person> selectAllUsers() {
		return new ArrayList<Person>();
	}

}