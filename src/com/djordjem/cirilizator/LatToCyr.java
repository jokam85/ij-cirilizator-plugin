package com.djordjem.cirilizator;

public class LatToCyr {

  public String toCyr(String lat) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < lat.length(); i++) {
      String c = charAtPos(lat, i);
      String cNext = charAtPos(lat, i + 1);
      String doubleToken = cNext == null ? null : c.concat(cNext);
      if (doubleToken != null && canBeTransliterated(doubleToken)) {
        sb.append(CharMap.latToCyr.get(doubleToken));
        i++;
      } else if (canBeTransliterated(c)) {
        sb.append(CharMap.latToCyr.get(c));
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  private String charAtPos(String string, int position) {
    return position >= string.length() ? null : string.substring(position, position + 1);
  }

  private boolean canBeTransliterated(String token) {
    return CharMap.latToCyr.containsKey(token);
  }
}
