import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Porta_retrato extends PApplet {

PImage imagem1;
PImage imagem2;
PImage imagem3;
PImage imagem4;
PImage imagem5;
PImage imagem6;
PImage imagem7;
PImage imagem8;

public void setup() {
  
  imagem1 = loadImage("image1.jpg");
  imagem2 = loadImage("image2.jpg");
  imagem3 = loadImage("image3.jpg");
  imagem4 = loadImage("image4.jpg");
  imagem5 = loadImage("image1a.jpg");
  imagem6 = loadImage("image2a.jpg");
  imagem7 = loadImage("image3a.jpg");
  imagem8 = loadImage("image4a.jpg");
  background(155);
}

public void draw() {
  image(imagem1,0,0);
  image(imagem2,400,0);
  image(imagem3,0,400);
  image(imagem4,400,400);
}

public void mousePressed(){
 if((mouseX>0) && (mouseY>0) && (mouseX<100) && (mouseY<100))
   image(imagem5,100,100);
 else if((mouseX>400) && (mouseY>0) && (mouseX<500) && (mouseY<100))
   image(imagem6,100,100);
 else if((mouseX>0) && (mouseY>400) && (mouseX<100) && (mouseY<500))
   image(imagem7,100,100);
 else if((mouseX>400) && (mouseY>400) && (mouseX<500) && (mouseY<500))
   image(imagem8,100,100);
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Porta_retrato" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
