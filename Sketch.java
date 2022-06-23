import processing.core.PApplet;

public class Sketch extends PApplet {
  // quadrant one variables
	int intLinex = 0;
  int oneLinex = 0;
  int width = 400;

  // quadrant two variables
  int intCirclex = 0;
  int intCircley = 20;
  int height = 10;

  // quadrant three variables
  int intGrad = 0;

  // quadrant four variables
  int rotateDial = 0;
  int rotatePed = 0;
  
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// first quadrant
    for (intLinex = 0; oneLinex <= width/2; oneLinex += width/20) {
      fill(0, 0, 0);
      line(oneLinex, 0, oneLinex, width/2);
      line(0, oneLinex, 200, oneLinex);
    }

  // second quadrant
    for (intCircley = 20; intCircley < 200; intCircley += 40) {
      for (intCirclex = 220; intCirclex < 400; intCirclex += 40) {
        fill(162, 47, 196);
        ellipse (intCirclex, intCircley, 17, 17);
        }
      
    

      
    }
    // third quadrant
    for (intGrad = 0; intGrad < 200; intGrad++) {
      fill(intGrad, intGrad, intGrad);
      stroke((int)(intGrad*1.275));
      rect(intGrad, 200, intGrad, 300);
    }

    // fourth quadrant
    stroke(0);
    fill(0);
    ellipse((float)(300), (float)(300), (float)(12), (float)(12));
    
    translate((float)(300), (float)(300));

    stroke(0);
    fill(255, 155, 0);
    ellipse(0, (20), 12, 40);
    for (rotatePed = 0; rotatePed < 9; rotateDial += 45, rotatePed ++){
      rotate(radians(rotateDial + 45));

      stroke(0);
      fill(200, 0, 10);
      ellipse(0, (20), 12, 40);
    }
  }
  
  // define other methods down here.
}