    // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int dotX = 75;
    int dotY = 500;
    int dotSize = 150;
    
    void setup() {
      size(1000, 1000);
    }
    
    void draw() {
      //2. set the background color of your sketch
      background(0, 0, 0);
      //3. draw an ellipse. Make sure it fits in the window.
      fill(0, 0, 0);
      ellipse(dotX, dotY, dotSize, dotSize);
      //5. use the variables created in step 4 in place of the numbers
      //   in your ellipse
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance = getDistance(dotX, dotY, mouseX, mouseY);
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
    
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance <= 75)
      {
        //8b.  set the x and y of the ellipse to a random location on the window
        
        dotX = (int) random(0, 925);
        dotY = (int) random(0, 925);
        println("you got the dot");
      }
      else
      {
        println("you were "+distance+" pixels away from the center of the dot");
        
      }
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    