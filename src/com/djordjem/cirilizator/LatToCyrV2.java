package com.djordjem.cirilizator;

public class LatToCyrV2 implements Transliterator {

  public String toCyr(String lat) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < lat.length(); i++) {
      String c = charAtPos(lat, i);
      String cNext = charAtPos(lat, i + 1);
      String doubleToken = cNext == null ? null : c.concat(cNext);
      if (doubleToken != null && translatable(doubleToken)) {
        sb.append(CharMap.pairs.get(doubleToken));
        i++;
      } else if (translatable(c)) {
        sb.append(CharMap.pairs.get(c));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  private String charAtPos(String string, int position) {
    return position >= string.length() ? null : string.substring(position, position + 1);
  }

  private boolean translatable(String token) {
    return CharMap.pairs.containsKey(token);
  }
}
