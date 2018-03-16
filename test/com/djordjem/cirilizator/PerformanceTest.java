package com.djordjem.cirilizator;

public class PerformanceTest {

  public static void main(String... args) {

    Transliterator v1 = new LatToCyr();
    Transliterator v2 = new LatToCyrV2();

    String text = "LoredŽ Džpsum DŽolor sitdž ameđ, consectetur adipiscing elit. Vestibulum non fringilla massa, id semper nunc. Curabitur ut efficitur diam. Sed dolor libero, pharetra eu facilisis at, vestibulum quis nisl. Duis tristique ut neque vitae tincidunt. Vestibulum gravida eros ac rutrum tempus. Aenean lacinia vehicula odio, in eleifend justo rhoncus sit amet. Suspendisse potenti. Praesent sapien lorem, volutpat eget tempus nec, tempus at nunc. Nunc ante libero, euismod eget lobortis non, sodales congue leo. Nam ac erat pharetra, fringilla diam ac, porttitor dolor";

    Long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      v1.toCyr(text);
    }
    System.out.println("Trajanje v1: " + (System.currentTimeMillis() - start));


    start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      v2.toCyr(text);
    }
    System.out.println("Trajanje v2: " + (System.currentTimeMillis() - start));

    if (v1.toCyr(text).equals(v2.toCyr(text))) {
      System.out.println("text je jednak");
    } else {
      System.out.println("text nije jednak");
    }

    System.out.println(v2.toCyr(text));
  }

}
