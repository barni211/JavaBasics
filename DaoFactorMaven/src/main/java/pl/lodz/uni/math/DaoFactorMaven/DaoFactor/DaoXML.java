package pl.lodz.uni.math.DaoFactorMaven.DaoFactor;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;

import pl.lodz.uni.math.DaoFactorMaven.Person.Person;

public class DaoXML implements IDaoFactor {
	private static IDaoFactor instance = null;

	public static IDaoFactor getInstance() {
		if (instance == null) {
			instance = new DaoXML();
		}
		return instance;
	}

	private DaoXML() {
		
	}

	// @Override
	public Person getPersonById(int value) {
		Person p1 = EasyMock.createMock(Person.class);
		return p1;
	}

	// @Override
	public List<Person> selectAllUsers() {
		return new ArrayList<Person>();
	}


}