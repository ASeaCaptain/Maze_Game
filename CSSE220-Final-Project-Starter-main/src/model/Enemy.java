package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Enemy extends Entity {

	private BufferedImage sprite;

	public Enemy(int row, int col) {
		super(row, col);
		try {
			sprite = ImageIO.read(Enemy.class.getResource("zombie.png"));
		} catch (IOException | IllegalArgumentException e) {
			sprite = null;
		}
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
}