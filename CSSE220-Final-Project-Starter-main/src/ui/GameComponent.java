package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.Timer;

import model.Coin;
import model.Enemy;
import model.GameModel;
import model.Wall;

public class GameComponent extends JComponent implements KeyListener {

	private GameModel model;
	private Timer timer;
	private boolean win;
	private boolean lose;

	public GameComponent(GameModel model) {
		this.model = model;
		this.win = false;
		this.lose = false;
		timer = new Timer(30, e -> {
			model.updateAll();
			if(model.isLose()) {
				displayLose();
			}
			if(model.isWin()) {
				displayWin();
			}
			repaint();
		});

		timer.start();
		
		setFocusable(true);
		addKeyListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		


	// TODO: draw based on model state
		model.getPlayer().drawOn(g2);
		
		for (Enemy enemy : model.getEnemies()) {
			enemy.drawOn(g2);
		}
		for (Wall w : model.getWalls()) {
			w.drawOn(g2);
		}
		for (Coin c : model.getCoins()) {
			c.drawOn(g2);
		}
		
		model.getExit().drawOn(g2);
		
		
		g2.setColor(Color.GREEN);
		
		g2.drawString("Health: " + model.getPlayer().getHealth() + " Score: " + model.getPlayer().getScore(), 20, 30);
		
		if(win) {
			g2.drawString("You Win", 40, 60);
		}
		if(lose) {
			g2.drawString("You Lose", 40, 60);
		}
		
		
	}
	
	public void displayWin() {
		timer.stop();
		win = true;
		repaint();
	}
	
	public void displayLose() {
		timer.stop();
		lose = true;
		repaint();
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			model.setPlayerDRow(-1);
		} else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			model.setPlayerDRow(1);
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
			model.setPlayerDCol(-1);
		} else if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			model.setPlayerDCol(1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}