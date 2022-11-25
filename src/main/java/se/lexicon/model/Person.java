package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
	private static int counter = 0;
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	
	public Person(String firstName, String lastName, LocalDate birthDate, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.id = ++counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) { Person.counter = counter;}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return id == person.id &&
				Objects.equals(firstName, person.firstName) &&
				Objects.equals(lastName, person.lastName) &&
				Objects.equals(birthDate, person.birthDate) &&
				gender == person.gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, birthDate, gender);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Person{");
		sb.append("id=").append(id);
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", birthDate=").append(birthDate);
		sb.append(", gender=").append(gender);
		sb.append('}');
		return sb.toString();
	}
}
