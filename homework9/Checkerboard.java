import java.awt.Color;
import java.awt.Graphics;

public class Checkerboard {

	public static void main(String[] args) {
			// Author: Caleb Lewis
			// Assignment: Homework #9
		
			int rows = 8; // 8x8 for 64 squares
			int columns = 8;
			
			int squareHeight = 25; // 25px height & width
			int squareWidth = 25;
			
			Color[] colors = {new Color(0xFF0000), new Color(0x000000)}; // colors to alternate between
			
			int width = rows * squareWidth;
			int height = columns * squareHeight;
			
			DrawableFrame df = new DrawableFrame("Checkerboard");
			df.show();
			df.setSize(width, height);
			
			Graphics g = df.getGraphicsContext();
			int currentColor = 0;
			
			for (int i = 0; i < columns; i++) {
				
				// columns
				int heightPlacement = squareHeight * i;
				
				for (int j = 0; j < rows; j++) {
					// rows
					currentColor = changeColor(currentColor);
					Color usedColor = colors[currentColor];
					
					g.setColor(usedColor);
					g.fillRect(squareWidth * j, heightPlacement, squareWidth, squareHeight);
				}
				
				if(rows % 2 == 0){ 
					// if the number of rows is even, we'll need to change the first color on the next line.
					currentColor = changeColor(currentColor);
				}
			}
			
			df.repaint();
	}
	
	public static int changeColor(int currentColor){
		// assume that we're alternating between two colors..
		if(currentColor == 0){
			return 1;
		}else{
			return 0;
		}
	}
}

