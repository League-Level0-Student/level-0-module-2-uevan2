int x = 10;

void setup() {
    size(800, 200);
  fill(#00329B);
 ellipse(x, 100, 100, 100);
 
}

void draw() {
  
    //3. make it a nice color
  fill(#00329B);
    //4. if the mouse is pressed...
  if(mousePressed){
   fill(#00329B);
 ellipse(x, 100, 100, 100);
    //5. ... change the X co-ordinate so that the dot moves to the right
    x = x + 100;
  }
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
   
    //6. Make your dot move really fast so that it can win the race 
    //7. Use this method to play a ding when your dot crosses the finish line. 
    if(x > 800){
      playSound();
}

}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}