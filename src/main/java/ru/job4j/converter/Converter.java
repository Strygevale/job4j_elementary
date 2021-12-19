package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 83;
        return rsl;
    }

    public static float rubleToDollar(float value) {
            float rsl = value / 74;
            return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(200);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("200 rubles are " + dollar + " dollar");
    }
}
