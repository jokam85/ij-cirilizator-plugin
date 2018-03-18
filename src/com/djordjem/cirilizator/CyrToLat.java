package com.djordjem.cirilizator;

public class CyrToLat {

  public String toLat(String cyr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < cyr.length(); i++) {
      sb.append(transliterate(charAtPos(cyr, i)));
    }
    return sb.toString();
  }

  private String transliterate(String c) {
    return CharMap.cyrToLat.getOrDefault(c, c);
  }

  private String charAtPos(String string, int position) {
    return position >= string.length() ? null : string.substring(position, position + 1);
  }

}
