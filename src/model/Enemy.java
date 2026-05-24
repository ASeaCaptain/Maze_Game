package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
<<<<<<< Updated upstream
import javax.imageio.ImageIO;

public class Enemy extends Entity {

	public int cooldown;
	public static BufferedImage sprite;
	static {
		try {
			sprite = ImageIO.read(Enemy.class.getResource("zombie.png"));
=======

import javax.imageio.ImageIO;

public class Coin extends SolidEntity {
	
	public static BufferedImage sprite;
	static {
		try {
			sprite = ImageIO.read(Coin.class.getResource("coin.png"));
>>>>>>> Stashed changes
		} catch (IOException | IllegalArgumentException e) {
			sprite = null;
		}
	}

<<<<<<< Updated upstream
	public Enemy(int row, int col, int dRow, int dCol) {
		super(row, col);
		this.dRow = dRow;
		this.dCol = dCol;
		this.cooldown = 0;
=======
	public Coin(int row, int col) {
		super(row, col);
>>>>>>> Stashed changes
		
	}

	@Override
	public void drawOn(Graphics2D g2) {
<<<<<<< Updated upstream
=======
		// TODO Auto-generated method stub
>>>>>>> Stashed changes
		int x = getCol() * TILE_SIZE;
		int y = getRow() * TILE_SIZE;
		
		if (sprite != null) {
			g2.drawImage(sprite, x, y, TILE_SIZE, TILE_SIZE, null);
		} else {
<<<<<<< Updated upstream
			g2.setColor(new Color(65, 113, 40));
=======
			g2.setColor(new Color(116, 73, 54));
>>>>>>> Stashed changes
			g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
		}
	}

<<<<<<< Updated upstream
	@Override
	public void update() {
		if(cooldown <= 0) {
			this.lastdRow = this.dRow;
			this.lastdCol = this.dCol;
			this.row += this.dRow;
			this.col += this.dCol;
			this.cooldown = 6;
		}
		cooldown -= 1;
	}

	@Override
	public void reverse() {
		this.cooldown = 0;
		super.reverse();
	}


}
=======


}
>>>>>>> Stashed changes
