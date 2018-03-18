package com.djordjem.cirilizator;

public class LatToCyrAction extends AbstractTransliterationAction {

  private LatToCyr transliterator = new LatToCyr();

  @Override
  public String transliterate(String text) {
    return transliterator.toCyr(text);
  }
}