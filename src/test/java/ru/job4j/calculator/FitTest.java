package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan184Then96() {
        short height = 184;
        double expected = 96;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.99);
    }

    @Test
    public void whenWoman169Then67() {
        short height = 169;
        double expected = 67;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.99);
    }
}