package D18127122;

import ie.tudublin.*;

public class SphereWBox extends Visual {

  public void settings() {
    fullScreen(P3D);
  }

  public void keyPressed() {
    if (key == ' ') {
      getAudioPlayer().cue(0);
      getAudioPlayer().play();
    }
  }

  public void setup() {
    surface.setResizable(true);
    colorMode(HSB);
    noCursor();
    setFrameSize(256);
    startMinim();
    loadAudio("heroplanet.mp3");
  }

  float smoothedBoxSize = 0;

  public void draw() {
    calculateAverageAmplitude();
    background(0);
    noFill();
    lights();
    stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
    camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
    translate(0, 0, -250);

    float boxSize = 50 + (getAmplitude() * 300); //map(average, 0, 1, 100, 400);
    smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.2f);

    rotateY(angle);
    rotateX(angle);
    strokeWeight(1);
    sphere(smoothedBoxSize);
    box(smoothedBoxSize * 2);
    sphere(smoothedBoxSize / 2);

    angle += 0.025f;
  }

  float angle = 0;
}
