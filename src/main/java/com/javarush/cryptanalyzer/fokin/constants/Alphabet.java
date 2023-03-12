package com.javarush.cryptanalyzer.fokin.constants;

public class Alphabet {
    public static final String lettersUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String lettersLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final String numbers = "0123456789";

//    TODO проверить набор символов
    public static final String symbols = ".,\"-?:!;', '";

    public static final String ALPHABET = lettersUpperCase + lettersLowerCase + numbers + symbols;

}
