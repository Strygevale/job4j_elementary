package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void henP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double res = SqArea.square(p, k);
        Assert.assertEquals(expected, res, 0.01);
    }

    @Test
    public void henP10K4Square4() {
        double p = 10;
        double k = 4;
        double expected = 4;
        double res = SqArea.square(p, k);
        Assert.assertEquals(expected, res, 0.01);
    }

    @Test
    public void henP12K2Square8() {
        double p = 12;
        double k = 2;
        double expected = 8;
        double res = SqArea.square(p, k);
        Assert.assertEquals(expected, res, 0.01);
    }
}