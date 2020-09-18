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
   //snow nose 
   stroke(100);
   line(145,125,152,125,);
   line(145,125,148,134);
   line(152,125,148,134);
   //snow legs
   fill(52,235,255);
   stroke(0)
   rect(140,265,15,20);
   rect(160,265,15,20);
   //snow hands 
   stroke(0,0,255);
   line(90,186,65,220);
   line(208,180,240,215);
   
   
   
  
  
 

  
 
	

}