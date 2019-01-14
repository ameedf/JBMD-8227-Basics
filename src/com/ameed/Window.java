package com.ameed;

public class Window {
	int x;
	int y;
	int width;
	int height;
	String bgcolor;

	
	
	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	}

	public int getX() {
		System.out.println(x);
		return x;
	}

	public int getY() {
		return y;
	}

	public void setSize(int newWidth, int newHeight) {
		width = newWidth;
		height = newHeight;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
