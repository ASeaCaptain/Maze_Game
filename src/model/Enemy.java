package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemy extends Entity {

	public int cooldown;
	public static BufferedImage sprite;
	static {
		try {
			sprite = ImageIO.read(Enemy.class.getResource("zombie.png"));
		} catch (IOException | IllegalArgumentException e) {
			sprite = null;
		}
	}

	public Enemy(int row, int col, int dRow, int dCol) {
		super(row, col);
		this.dRow = dRow;
		this.dCol = dCol;
		this.cooldown = 0;
		
	}

	@Override
	public void drawOn(Graphics2D g2) {
		int x = getCol() * TILE_SIZE;
		int y = getRow() * TILE_SIZE;
		
		if (sprite != null) {
			g2.drawImage(sprite, x, y, TILE_SIZE, TILE_SIZE, null);
		} else {
			g2.setColor(new Color(65, 113, 40));
			g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
		}
	}

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