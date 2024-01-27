package test

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomNumberGeneratorTest {
@Test
public void testGenerateRandomNumber() {
    RandomNumberGenerator rng = new RandomNumberGenerator();
    int expectedMin = 250;
    int expectedMax = 700;

    for (int i = 0; i < 100; i++) {
        int randomNumber = rng.generateRandomNumber();
        assertTrue("Generated number is outside the expected range", randomNumber >= expectedMin && randomNumber <= expectedMax);
    }
}