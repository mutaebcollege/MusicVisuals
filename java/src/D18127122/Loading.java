package D18127122;

import ie.tudublin.*;

public class Loading extends Visual {

  public void settings() {
    size(800, 800, P3D);
  }

  public void setup() {
    surface.setResizable(true);
    background(0);
  }

  float rotate = 0;

  public void draw() {
    noStroke();
    fill(0, 0, 0, 100);
    rotate += 0.1f;

    rect(0, 0, width, height);
    translate(400, 400);
    rotate(rotate);

    fill(255, 255, 255, 255);
    ellipse(100, 100, 25, 25);
  }
}
