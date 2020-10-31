package repository;

import domain.Person;
import java.util.List;

public interface PersonRepository {
	public List<Person> findAll();

}