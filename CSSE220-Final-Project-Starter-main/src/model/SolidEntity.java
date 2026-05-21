package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public abstract class SolidEntity extends Collidable {

	protected int row;
	protected int col;
	protected static final int TILE_SIZE = 40;
	
	public SolidEntity(int row, int col) {
		this.row = row;
		this.col = col;

	}
	
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}
	
	public abstract void drawOn(Graphics2D g2);
	
	public Rectangle getBounds() {
		return new Rectangle(col*TILE_SIZE, row*TILE_SIZE, TILE_SIZE, TILE_SIZE);
	}
	
	public boolean collideWith(Collidable other) {
		return this.getBounds().intersects(other.getBounds());
	}
	
}
