package D18127122;

public class Music implements UI {

  MainVisual mv;
  Circle c;

  public Music(MainVisual mv, Circle c) {
    this.mv = mv;
    this.c = c;

    circles = 30;
    theta = 1.0f;
  }

  float circles;
  float theta;

  @Override
  public void run() {
    mv.background(0);
    mv.noFill();
    mv.translate(mv.width / 2, mv.height / 2);
    mv.strokeWeight(5);

    mv.calculateAverageAmplitude();
    float amp = mv.getAmplitude() / 5.0f;

    float pi = mv.PI;
    float twoPi = mv.TWO_PI;

    for (int i = 0; i < circles; i++) {
      float sine = mv.sin(theta - mv.map(i, 0, circles, 0, pi));
      float arc = mv.map(sine, -1, 1, pi, twoPi);
      float color = mv.map(sine, -1, 1, 0, 255);
      mv.stroke(color, 255, 255);

      float w = i * 22;

      switch (c) {
        case LEFT:
          mv.arc(0, 0, -w, -w, -(arc + pi), -arc);
          break;
        case RIGHT:
          mv.arc(0, 0, -w, -w, (arc - pi), arc);
          break;
        case BOTH:
          mv.arc(0, 0, -w, -w, -(arc + pi), -arc);
          mv.arc(0, 0, -w, -w, (arc - pi), arc);
          break;
      }
    }
    theta += amp;
  }
}
