package ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

import model.Enemy;
import model.GameModel;

public class GameComponent extends JComponent implements KeyListener {

	private GameModel model;

	public GameComponent(GameModel model) {
		this.model = model;
		
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

	// Minimal placeholder to test  it’s running
		g2.drawString("Final Project Starter: UI is running ✅", 20, 30);


	// TODO: draw based on model state
		model.getPlayer().drawOn(g2);
		
		for (Enemy enemy : model.getEnemies()) {
			enemy.drawOn(g2);
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			model.movePlayerUp();
		} else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			model.movePlayerDown();
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
			model.movePlayerLeft();
		} else if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			model.movePlayerRight();
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}