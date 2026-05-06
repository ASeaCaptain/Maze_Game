package model;

import java.awt.Graphics2D;

public class Player extends Entity{
	
	private static final int TILE_SIZE = 40;
	
	public Player(int row, int col) {
		super(row, col);
	}

//	/**
//	 * @return the row
//	 */
//	public int getRow() {
//		return row;
//	}
//
//	/**
//	 * @return the col
//	 */
//	public int getCol() {
//		return col;
//	}
//	
	public void drawOn(Graphics2D g2, BufferedImage sprite) {
		int x = getCol() * TILE_SIZE;
		int y = getRow() * TILE_SIZE;
		
		g2.drawImage(sprite, x, y, TILE_SIZE, TILE_SIZE, null);
	}
	
	public void moveBy(int dRow, int dCol) {
		setRow(getRow() + dRow);
		setCol(getCol() + dCol);
	}

}
