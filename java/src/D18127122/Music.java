package D18127122;

import ie.tudublin.*;

public class Music extends Visual {

  float circles;
  float theta;

  public void settings() {
    size(800, 800, P3D);
  }

  public void setup() {
    surface.setResizable(true);
    startMinim();
    loadAudio("aspring.mp3");
    colorMode(HSB);

    getAudioPlayer().cue(0);
    getAudioPlayer().play();

    circles = 30;
    theta = 1.0f;
  }

  public void draw() {
    background(0);
    noFill();
    translate(width / 2, height / 2);
    strokeWeight(5);

    calculateAverageAmplitude();
    float amp = getAmplitude() / 5.0f;

    for (int i = 0; i < circles; i++) {
      float sine = sin(theta - map(i, 0, circles, 0, PI));
      float arc = map(sine, -1, 1, PI, TWO_PI);
      float color = map(sine, -1, 1, 0, 255);
      stroke(color, 255, 255);

      float w = i * 22;
      arc(0, 0, -w, -w, -(arc + PI), -arc);
      arc(0, 0, -w, -w, (arc - PI), arc);
    }
    theta += amp;
  }
}
