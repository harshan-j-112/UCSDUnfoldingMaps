package module2;
import processing.core.*;
public class SunClock extends PApplet{
	private static final long serialVersionUID = 1L;
	 PImage backgroundImg;
	 String url = "https://unsplash.com/photos/mOcdke2ZQoE";
	public void setup() {
		size(600,600);
		 background(255);
		 
		//PImage backgroundImg; 
		backgroundImg = loadImage(url,"png"); 
		//this.background(backgroundImg);
		backgroundImg.resize(0,height);
		image(backgroundImg,0,0);

	}
	public void draw() {
		
		
	}
}
