package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(140F);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(180F);
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}