package ui;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

import model.GameModel;

public class GameComponent extends JComponent {

	private GameModel model;
	private SpriteGenerator sprites;
	private BufferedImage playerSprite;
	private BufferedImage zombieSprite;


	public GameComponent(GameModel model) {
		this.model = model;
		this.sprites = new SpriteGenerator();
		this.playerSprite = sprites.generatePlayerSprite();
		this.zombieSprite = sprites.generateZombieSprite();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

	// Minimal placeholder to test  it’s running
		g2.drawString("Final Project Starter: UI is running ✅", 20, 30);


	// TODO: draw based on model state
		model.getPlayer().drawOn(g2, playerSprite);
		
		for (Enemy enemy : model.getEnemies()) {
			enemy.drawOn(g2, zombieSprite);
		}
	}
}