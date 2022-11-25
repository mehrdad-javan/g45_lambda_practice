package se.lexicon.util;

import java.util.Random;

public class RandomNumberGenerator {
	
	private static final RandomNumberGenerator INSTANCE;
	
	static {
		INSTANCE = new RandomNumberGenerator();
	}
	
	private RandomNumberGenerator() {}
	
	public static RandomNumberGenerator getInstance() {
		return INSTANCE;
	}
	
	private static final Random rng = new Random();
	
	public int getRandomInt(int min, int max) {
		return rng.nextInt((max-min) + 1) + min;
	}
	
	public boolean getRandomBoolean() {
		return rng.nextBoolean();
	}

}
