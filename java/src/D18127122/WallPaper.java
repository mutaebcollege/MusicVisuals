package D18127122;

public class WallPaper implements UI {

  MainVisual mv;
  float x1[] = new float[4];
  float y1[] = new float[4];
  float x2[] = new float[4];
  float y2[] = new float[4];

  public WallPaper(MainVisual mv) {
    this.mv = mv;
    x1 =
      new float[] {
        mv.random(500),
        mv.random(500),
        mv.random(500),
        mv.random(500),
      };

    y1 =
      new float[] {
        mv.random(500),
        mv.random(500),
        mv.random(500),
        mv.random(500),
      };

    x2 =
      new float[] {
        mv.random(1.5f),
        mv.random(1.5f),
        mv.random(1.5f),
        mv.random(1.5f),
      };

    y2 =
      new float[] {
        mv.random(1.5f),
        mv.random(1.5f),
        mv.random(1.5f),
        mv.random(1.5f),
      };
  }

  @Override
  public void run() {
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

      if (x1[i] > mv.width) {
        x1[i] = mv.width;
        x2[i] = -x2[i];
      }

      if (y1[i] > mv.height) {
        y1[i] = mv.height;
        y2[i] = -y2[i];
      }
    }

    int steps = 1000;
    for (int i = 0; i <= steps; i++) {
      float t = i / (float) steps;
      mv.fill(t * 5, (1 - t) * 2, t * 2);

      float ex = mv.bezierPoint(x1[0], x1[1], x1[2], x1[3], t);
      float ey = mv.bezierPoint(y1[0], y1[1], y1[2], y1[3], t);

      mv.ellipse(ex, ey, 2, 2);
    }
  }
}
