package com.djordjem.cirilizator;

import java.util.HashMap;
import java.util.Map;

public class CharMap {

  public static Map<String, String> pairs = new HashMap<>();

  static {
    pairs.put("lj", "љ");
    pairs.put("LJ", "Љ");
    pairs.put("Lj", "Љ");
    pairs.put("lJ", "љ");

    pairs.put("dž", "џ");
    pairs.put("DŽ", "Џ");
    pairs.put("Dž", "Џ");
    pairs.put("dŽ", "џ");

    pairs.put("nj", "њ");
    pairs.put("NJ", "Њ");
    pairs.put("Nj", "Њ");
    pairs.put("nJ", "њ");

    pairs.put("a", "а");
    pairs.put("b", "б");
    pairs.put("v", "в");
    pairs.put("g", "г");
    pairs.put("d", "д");
    pairs.put("đ", "ђ");
    pairs.put("e", "е");
    pairs.put("ž", "ж");
    pairs.put("z", "з");
    pairs.put("i", "и");
    pairs.put("j", "ј");
    pairs.put("k", "к");
    pairs.put("l", "л");
    pairs.put("m", "м");
    pairs.put("n", "н");
    pairs.put("o", "о");
    pairs.put("p", "п");
    pairs.put("r", "р");
    pairs.put("s", "с");
    pairs.put("t", "т");
    pairs.put("ć", "ћ");
    pairs.put("u", "у");
    pairs.put("f", "ф");
    pairs.put("h", "х");
    pairs.put("c", "ц");
    pairs.put("č", "ч");
    pairs.put("š", "ш");
    pairs.put("A", "А");
    pairs.put("B", "Б");
    pairs.put("V", "В");
    pairs.put("G", "Г");
    pairs.put("D", "Д");
    pairs.put("Đ", "Ђ");
    pairs.put("E", "Е");
    pairs.put("Ž", "Ж");
    pairs.put("Z", "З");
    pairs.put("I", "И");
    pairs.put("J", "Ј");
    pairs.put("K", "К");
    pairs.put("L", "Л");
    pairs.put("M", "М");
    pairs.put("N", "Н");
    pairs.put("O", "О");
    pairs.put("P", "П");
    pairs.put("R", "Р");
    pairs.put("S", "С");
    pairs.put("T", "Т");
    pairs.put("Ć", "Ћ");
    pairs.put("U", "У");
    pairs.put("F", "Ф");
    pairs.put("H", "Х");
    pairs.put("C", "Ц");
    pairs.put("Č", "Ч");
    pairs.put("Š", "Ш");
  }
}
