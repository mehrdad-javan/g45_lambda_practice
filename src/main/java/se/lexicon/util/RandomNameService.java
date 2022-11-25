package se.lexicon.util;

import se.lexicon.data.CSVReader;

import java.util.List;

public class RandomNameService {
	
	private static final RandomNameService INSTANCE;
	
	static {
		INSTANCE = new RandomNameService();
	}
	
	public static RandomNameService getInstance() {
		return INSTANCE;
	}
	
	private final List<String> maleFirstNames;
	private final List<String> femaleFirstNames;
	private final List<String> lastNames;
	
	private RandomNameService() {
		maleFirstNames = CSVReader.getInstance().getMaleFirstNames();
		femaleFirstNames = CSVReader.getInstance().getFemaleFirstNames();
		lastNames = CSVReader.getInstance().getLastNames();
	}
	
	public String getRandomMaleFirstName() {
		return maleFirstNames.get(RandomNumberGenerator.getInstance().getRandomInt(0, maleFirstNames.size()-1));
	}
	
	public String getRandomFemaleFirstName() {
		return femaleFirstNames.get(RandomNumberGenerator.getInstance().getRandomInt(0, femaleFirstNames.size()-1));
	}
	
	public String getRandomLastName() {
		return lastNames.get(RandomNumberGenerator.getInstance().getRandomInt(0, lastNames.size()-1));
	}
	
	

}
