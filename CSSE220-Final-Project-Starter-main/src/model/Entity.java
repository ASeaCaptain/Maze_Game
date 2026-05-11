package model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Entity {
	
	protected int row;
	protected int col;
	protected static final int TILE_SIZE = 40;
	
	public Entity(int row, int col) {
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
	
//	public void drawOn(Graphics2D g2, BufferedImage sprite) {
//		int x = this.col * TILE_SIZE;
//		int y = this.row * TILE_SIZE;
//		
//		g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
//	}
	
	public void moveBy(int dRow, int dCol) {
		this.row += dRow;
		this.col += dCol;
	}
	
	public abstract void drawOn(Graphics2D g2);

}
