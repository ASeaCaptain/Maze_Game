package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Coin extends SolidEntity {
	
	public static BufferedImage sprite;
	static {
		try {
			sprite = ImageIO.read(Coin.class.getResource("coin.png"));
		} catch (IOException | IllegalArgumentException e) {
			sprite = null;
		}
	}

	public Coin(int row, int col) {
		super(row, col);
		
	}

	@Override
	public void drawOn(Graphics2D g2) {
		// TODO Auto-generated method stub
		int x = getCol() * TILE_SIZE;
		int y = getRow() * TILE_SIZE;
		
		if (sprite != null) {
			g2.drawImage(sprite, x, y, TILE_SIZE, TILE_SIZE, null);
		} else {
			g2.setColor(new Color(116, 73, 54));
			g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
		}
	}



}
