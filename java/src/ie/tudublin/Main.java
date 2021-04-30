package ie.tudublin;

import D18127122.*;

public class Main {

  public void mainUI() {
    String[] a = { "MAIN" };
    processing.core.PApplet.runSketch(a, new MainVisual());
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.mainUI();
  }
}
