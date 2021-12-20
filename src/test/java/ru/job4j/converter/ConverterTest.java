package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert160RblThen2Euro() {
        float rub = 160;
        float euro = 2;
        float out = Converter.rubleToEuro(rub);
        float eps = 0.0001f;
        Assert.assertEquals(euro, out, eps);
    }

    @Test
    public void whenConvert210RblThen3Dollar() {
        float rub = 210;
        float dollar = 3;
        float out = Converter.rubleToDollar(rub);
        float eps = 0.0001f;
        Assert.assertEquals(dollar, out, eps);
    }

}