package dao;

import domain.Person;
import java.sql.Date;
import java.util.List;
import java.util.ArrayList;
import repository.*;

public class PersonTestData implements PersonRepository {

	private List<Person> persons = new ArrayList<>();

	public List<Person> findAll() {
		persons.add(new Person(1, "��������", "����", "�����������", Date.valueOf("2004-09-25"), "male"));
		persons.add(new Person(2, "�����", "����", "�����", Date.valueOf("2006-08-15"), "male"));
		persons.add(new Person(3, "���������", "����", "���������", Date.valueOf("2010-03-09"), "male"));
		persons.add(new Person(4, "�������", "����", "�������������", Date.valueOf("2001-06-12"), "male"));
		return persons;
	}

}