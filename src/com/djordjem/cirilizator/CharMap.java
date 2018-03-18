package com.djordjem.cirilizator;

import java.util.HashMap;
import java.util.Map;

public class CharMap {

  public static Map<String, String> latToCyr = new HashMap<>();
  public static Map<String, String> cyrToLat = new HashMap<>();

  private static void addPair(String lat, String cyr) {
    latToCyr.put(lat, cyr);
    cyrToLat.put(cyr, lat);
  }

  static {
    addPair("LJ", "Љ");
    addPair("Lj", "Љ");
    addPair("lJ", "љ");
    addPair("lj", "љ");

    addPair("DŽ", "Џ");
    addPair("Dž", "Џ");
    addPair("dŽ", "џ");
    addPair("dž", "џ");

    addPair("NJ", "Њ");
    addPair("Nj", "Њ");
    addPair("nJ", "њ");
    addPair("nj", "њ");

    addPair("a", "а");
    addPair("b", "б");
    addPair("v", "в");
    addPair("g", "г");
    addPair("d", "д");
    addPair("đ", "ђ");
    addPair("e", "е");
    addPair("ž", "ж");
    addPair("z", "з");
    addPair("i", "и");
    addPair("j", "ј");
    addPair("k", "к");
    addPair("l", "л");
    addPair("m", "м");
    addPair("n", "н");
    addPair("o", "о");
    addPair("p", "п");
    addPair("r", "р");
    addPair("s", "с");
    addPair("t", "т");
    addPair("ć", "ћ");
    addPair("u", "у");
    addPair("f", "ф");
    addPair("h", "х");
    addPair("c", "ц");
    addPair("č", "ч");
    addPair("š", "ш");
    addPair("A", "А");
    addPair("B", "Б");
    addPair("V", "В");
    addPair("G", "Г");
    addPair("D", "Д");
    addPair("Đ", "Ђ");
    addPair("E", "Е");
    addPair("Ž", "Ж");
    addPair("Z", "З");
    addPair("I", "И");
    addPair("J", "Ј");
    addPair("K", "К");
    addPair("L", "Л");
    addPair("M", "М");
    addPair("N", "Н");
    addPair("O", "О");
    addPair("P", "П");
    addPair("R", "Р");
    addPair("S", "С");
    addPair("T", "Т");
    addPair("Ć", "Ћ");
    addPair("U", "У");
    addPair("F", "Ф");
    addPair("H", "Х");
    addPair("C", "Ц");
    addPair("Č", "Ч");
    addPair("Š", "Ш");
  }
}
