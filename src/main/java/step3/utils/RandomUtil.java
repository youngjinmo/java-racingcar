package step3.utils;

import java.util.Random;

public class RandomUtil implements RandomGenerator {

    private static final int BOUND_OF_RANDOM_NUM = 10;
    private int RANDOM_NUMBER;

    public RandomUtil() {
        this.RANDOM_NUMBER = new Random().nextInt(BOUND_OF_RANDOM_NUM);
    }

    @Override
    public int getRandom() {
        return RANDOM_NUMBER;
    }
}