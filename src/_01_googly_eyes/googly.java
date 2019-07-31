
package _01_googly_eyes;

import org.jointheleague.graphical.robot.Robot;

public class googly {
	
	public static void main(String[] args) {
		
		
		
		
		
	
	
	
		PImage face;
	    void setup(){
	       size(600,600);
	        face = loadImage("oopo.jpeg");
	           face.resize(width,height);
	            
	      }

	      void draw(){
	        background(face);
	        
	        ellipse(165, 313, 130, 130);
	        ellipse(430, 310, 130, 130);
	        ellipse(165, 313, 50, 50);
	        ellipse(430, 310, 50, 50);
	        
	        if(mousePressed){
	          fill(250,0,0);
	        }
	        else{
	          fill(0,0,255);
	        } 
	       ellipse(mouseX, mouseY, 100, 100); 
	    
	      }
	
	
	

			

	}
	
	}
   