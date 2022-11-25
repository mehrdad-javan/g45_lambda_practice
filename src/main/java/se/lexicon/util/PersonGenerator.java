package se.lexicon.util;



import se.lexicon.model.Gender;
import se.lexicon.model.Person;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class PersonGenerator {
	
	private static final PersonGenerator INSTANCE;
	
	private PersonGenerator() {		
	}
	
	static {
		INSTANCE = new PersonGenerator();
	}
	
	public static PersonGenerator getInstance() {
		return INSTANCE;
	}
	
	public List<Person> generate(int amount){
		List<Person> persons = new ArrayList<>();
		for(int i=0 ; i<amount; i++) {
			Gender gender = getRandomGender();
			String firstName;
			String lastName;
			int year;
			
			if(gender == Gender.FEMALE) {
				firstName = RandomNameService.getInstance().getRandomFemaleFirstName();
			}else {
				firstName = RandomNameService.getInstance().getRandomMaleFirstName();
			}
			
			lastName = RandomNameService.getInstance().getRandomLastName();
			
			year = RandomNumberGenerator.getInstance().getRandomInt(1930, 2019);

			persons.add(new Person(firstName, lastName, generateBirthDate(year), gender));
		}
		return persons;
		
	}

	private LocalDate generateBirthDate(int year){
		return Year.isLeap(year) ?
				LocalDate.ofYearDay(year, RandomNumberGenerator.getInstance().getRandomInt(1,366)) :
				LocalDate.ofYearDay(year, RandomNumberGenerator.getInstance().getRandomInt(1,365));
	}
	
	private Gender getRandomGender() {
		boolean isFemale = RandomNumberGenerator.getInstance().getRandomBoolean();		
		return isFemale ? Gender.FEMALE : Gender.MALE;
	}
	

}
