package com.djordjem.cirilizator;

public class CyrToLatAction extends AbstractTransliterationAction {

  private CyrToLat transliterator = new CyrToLat();

  @Override
  public String transliterate(String text) {
    return transliterator.toLat(text);
  }
}