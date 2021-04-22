package ie.tudublin;

import D18127122.*;
import example.*;

public class Main {

  public void startUI() {
    String[] a = { "MAIN" };
    processing.core.PApplet.runSketch(a, new WallPaper1());
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.startUI();
  }
}
