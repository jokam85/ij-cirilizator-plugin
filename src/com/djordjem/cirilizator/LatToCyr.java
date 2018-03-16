package com.djordjem.cirilizator;

public class LatToCyr implements Transliterator {

  public String toCyr(String lat) {
    final String[] buffer = new String[1];
    buffer[0] = lat;
    CharMap.pairs.forEach((l, c) ->
            buffer[0] = buffer[0].replaceAll(l, c)
    );
    return buffer[0];
  }

}
