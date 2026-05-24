package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Player extends Entity {
	
	public static BufferedImage sprite;
	static {
		try {
			sprite = ImageIO.read(Player.class.getResource("player.png"));
		} catch (IOException | IllegalArgumentException e) {
			sprite = null;
		}
	}
	
	private int health;
	private int score;
	private int invincible;


	public Player(int row, int col) {
		super(row, col);
		this.health = 3;
		this.score = 0;
		this.invincible = 0;
	}

	@Override
	public void drawOn(Graphics2D g2) {
		int x = getCol() * TILE_SIZE;
		int y = getRow() * TILE_SIZE;
		
		if (sprite != null) {
			g2.drawImage(sprite, x, y, TILE_SIZE, TILE_SIZE, null);
		} else {
			g2.setColor(new Color(116, 73, 54));
			g2.fillRect(x, y, TILE_SIZE, TILE_SIZE);
		}
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}
	
	public void takeDamage() {
		if(invincible <= 0) {
			health -= 1;
			invincible = 10;
		}
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
	public void gainPoints() {
		score += 100;
	}

	@Override
	public void update() {
		super.update();
		this.dRow = 0;
		this.dCol = 0;
		if(invincible > 0) invincible -= 1;
	}

}