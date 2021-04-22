package D18127122;

import ie.tudublin.*;

public class WallPaper extends Visual {

  float x1[] = new float[] {
    random(500.0f),
    random(500.0f),
    random(500.0f),
    random(500.0f),
  };
  float y1[] = new float[] {
    random(500.0f),
    random(500.0f),
    random(500.0f),
    random(500.0f),
  };
  float x2[] = new float[] {
    random(1.5f),
    random(1.5f),
    random(1.5f),
    random(1.5f),
  };
  float y2[] = new float[] {
    random(1.5f),
    random(1.5f),
    random(1.5f),
    random(1.5f),
  };

  public void settings() {
    size(800, 800, P3D);
  }

  public void setup() {
    surface.setResizable(true);
    background(0);
  }

  public void draw() {
    for (int i = 0; i < 4; i++) {
      x1[i] += x2[i];
      y1[i] += y2[i];

      if (x1[i] < 0) {
        x1[i] = 0;
        x2[i] = -x2[i];
      }

      if (y1[i] < 0) {
        y1[i] = 0;
        y2[i] = -y2[i];
      }

      if (x1[i] > width) {
        x1[i] = width;
        x2[i] = -x2[i];
      }

      if (y1[i] > height) {
        y1[i] = height;
        y2[i] = -y2[i];
      }
    }

    blendMode(ADD);
    noStroke();

    int steps = 1000;
    for (int i = 0; i <= steps; i++) {
      float t = i / (float) steps;
      fill(t * 5, (1 - t) * 2, t * 2);

      float ex = bezierPoint(x1[0], x1[1], x1[2], x1[3], t);
      float ey = bezierPoint(y1[0], y1[1], y1[2], y1[3], t);

      ellipse(ex, ey, 2, 2);
    }
  }
}
