package domain;

import java.sql.Date;

public class Person {

	private int id;
	private String lastname;
	private String name;
	private String secondname;
	private Date birhday;
	private String gender;

	public Person(int id, String lastname, String name, String secondname, Date birhday, String gender) {

			this.id = id;
			this.lastname = lastname;
			this.name = name;
			this.secondname = secondname;
			this.birhday = birhday;
			this.gender = gender;
	}

	public String toString() {
		return String.format("%s %s %s %s %s %s ", id, lastname, name, secondname, birhday, gender);


	}
}