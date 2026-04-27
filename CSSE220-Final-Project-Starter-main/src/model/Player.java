package model;

import java.awt.Graphics2D;

public class Player {
	
	private int row;
	private int col;
	private static final int TILE_SIZE = 40;
	
	public Player(int row, int col) {
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
	
	public void drawOn(Graphics2D g2) {
		int x = this.col * TILE_SIZE;
		int y = this.row * TILE_SIZE;
		
		g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
	}
	
	public void moveBy(int dRow, int dCol) {
		this.row += dRow;
		this.col += dCol;
	}

}
