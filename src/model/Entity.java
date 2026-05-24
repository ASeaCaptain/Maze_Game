package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

<<<<<<< Updated upstream
public abstract class Entity extends Collidable {
	
	protected int row;
	protected int col;
	protected int dRow;
	protected int dCol;
	protected int lastdRow;
	protected int lastdCol;
	protected static final int TILE_SIZE = 40;
	
	public Entity(int row, int col) {
		this.row = row;
		this.col = col;
		this.dRow = 0;
		this.dCol = 0;
=======
public abstract class SolidEntity extends Collidable {

	protected int row;
	protected int col;
	protected static final int TILE_SIZE = 40;
	
	public SolidEntity(int row, int col) {
		this.row = row;
		this.col = col;

>>>>>>> Stashed changes
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
	
<<<<<<< Updated upstream
	
	/**
	 * @return the dRow
	 */
	public int getdRow() {
		return dRow;
	}

	/**
	 * @param dRow the dRow to set
	 */
	public void setdRow(int dRow) {
		this.dRow = dRow;
	}

	/**
	 * @return the dCol
	 */
	public int getdCol() {
		return dCol;
	}

	/**
	 * @param dCol the dCol to set
	 */
	public void setdCol(int dCol) {
		this.dCol = dCol;
	}

//	public void moveBy(int dRow, int dCol) {
//		this.row += dRow;
//		this.col += dCol;
//	}
	
	public void update() {
		this.lastdRow = this.dRow;
		this.lastdCol = this.dCol;
		this.row += this.dRow;
		this.col += this.dCol;

	}
	
=======
>>>>>>> Stashed changes
	public abstract void drawOn(Graphics2D g2);
	
	public Rectangle getBounds() {
		return new Rectangle(col*TILE_SIZE, row*TILE_SIZE, TILE_SIZE, TILE_SIZE);
	}
	
	public boolean collideWith(Collidable other) {
		return this.getBounds().intersects(other.getBounds());
	}
	
<<<<<<< Updated upstream
	public void reverse() {
		dRow = -lastdRow;
		dCol = -lastdCol;
	}
	
	public void undoMove() {
		this.row -= this.lastdRow;
		this.col -= this.lastdCol;
	}

}

	
=======
}
>>>>>>> Stashed changes
