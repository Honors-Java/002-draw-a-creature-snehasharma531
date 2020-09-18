void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  background(255,255,0);
  //snow head
   fill(0);
   stroke(0);
   ellipse(150,200,125,120);
   //snow body
   fill(255);
   stroke(0);
   ellipse(150,120,70,70);
   //snow eyes
   fill(255,0,0);
   stroke(0);
   rect(132,108,10,8);
   rect(162,108,10,8);
   //snow nose using tiangle
   stroke(100)
   triangle(146,123,160,123,150,132);
 
   //snow legs
   fill(52,235,255);
   stroke(0)
   rect(140,265,15,20);
   rect(160,265,15,20);
   //snow hands 
   stroke(0,0,255);
   line(90,186,65,220);
   line(208,180,240,215);
   //ceated snow ear using triangle 
   fill(214,25,89);
  triangle(125,95,126,75,138,86);
   triangle(150,85,158,70,165,86);
   
  
  
 

  
 
	

}