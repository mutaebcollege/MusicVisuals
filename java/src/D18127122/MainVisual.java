package D18127122;

import ie.tudublin.*;

public class MainVisual extends Visual {

  public void settings() {
    size(800, 800, P3D);
  }

  Loading loading;
  WallPaper wallPaper;
  Music music;

  public void setup() {
    surface.setResizable(true);
    background(0);
    startMinim();
    loadAudio("aspring.mp3");

    getAudioPlayer().cue(0);
    getAudioPlayer().play();

    loading = new Loading(this);
    wallPaper = new WallPaper(this);
    music = new Music(this);
  }

  int which = 0;

  public void keyPressed() {
    clear();
    colorMode(RGB);
    blendMode(BLEND);
    if (keyCode >= '0' && keyCode <= '2') {
      which = keyCode - '0';
    }
  }

  float rotate = 0;

  public void draw() {
    switch (which) {
      case 0:
        loading.run();
        break;
      case 1:
        blendMode(ADD);
        noStroke();
        wallPaper.run();
        break;
      case 2:
        colorMode(HSB);
        music.run();
        break;
      default:
        loading.run();
        break;
    }
  }
}
