package pl.lodz.uni.math.DaoFactorMaven.DaoFactor;

import java.util.List;

import pl.lodz.uni.math.DaoFactorMaven.Person.Person;

public interface IDaoFactor {
	public Person getPersonById(int value);

	public List<Person> selectAllUsers();
}
