package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 80;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static void main(String[] args) {
        float rubEu = 160;
        float rubDollar = 210;
        float euro = 2;
        float dollar = 3;
        float outEu = Converter.rubleToEuro(rubEu);
        float outDollar = Converter.rubleToDollar(rubDollar);
        boolean passedEu = euro == outEu;
        boolean passedDollar = dollar == outDollar;
        System.out.println("160 rubles are 2 euro. Test result : " + passedEu);
        System.out.println("210 rubles are 3 dollar. Test result : " + passedDollar);
    }
}
