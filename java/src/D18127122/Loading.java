package D18127122;

public class Loading implements UI {

  MainVisual mv;

  public Loading(MainVisual mv) {
    this.mv = mv;
  }

  float rotate = 0;

  @Override
  public void run() {
    mv.noStroke();
    mv.fill(0, 0, 0, 100);
    rotate += 0.1f;

    mv.rect(0, 0, mv.width, mv.height);
    mv.translate(400, 400);
    mv.rotate(rotate);

    mv.fill(255, 255, 255, 255);
    mv.ellipse(100, 100, 25, 25);
  }
}
