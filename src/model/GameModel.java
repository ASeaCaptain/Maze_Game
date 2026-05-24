package model;


import java.util.ArrayList;

/**
 * Stores the current state of the game and controls the main game rules.
 * 
 * This is where the game keeps track of objects such as the player,
 * walls, gems, zombies, score, lives, and levels.
 * 
 * GameModel should update the game state, but it should not draw anything.
 * Drawing belongs in GameComponent.
 */

public class GameModel {
	
	// Work on the lab to complete GameModel and Player for initial setup
	
	private Player player;
	private ArrayList<Enemy> enemies = new ArrayList<>();
<<<<<<< Updated upstream
	private ArrayList<Wall> walls = new ArrayList<>();
	private ArrayList<Coin> coins = new ArrayList<>();
	private Exit exit;
	private int playerDRow;
	private int playerDCol;
	private boolean win;
	private boolean lose;
	
	public GameModel(String levelName) {
		Level level = LevelIO.loadLevel(levelName);
		for(int i = 0; i < level.getRows().size(); i++) {
			for(int j = 0; j < level.getRows().get(i).length(); j++) {
				if(level.getRows().get(i).charAt(j) == 'P') this.player = new Player(i,j);
				if(level.getRows().get(i).charAt(j) == 'E') this.exit = new Exit(i,j);
				if(level.getRows().get(i).charAt(j) == 'W') this.walls.add(new Wall(i,j));
				if(level.getRows().get(i).charAt(j) == 'C') this.coins.add(new Coin(i,j));
				if(level.getRows().get(i).charAt(j) == 'H') this.enemies.add(new Enemy(i,j,0,1));
				if(level.getRows().get(i).charAt(j) == 'V') this.enemies.add(new Enemy(i,j,1,0));
			}
		}
		this.win = false;
		this.lose = false;
=======
	
	public GameModel() {
		this.player = new Player(5, 5);
		this.enemies.add(new Enemy(7, 7));
>>>>>>> Stashed changes
	}

	/**
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}
	
<<<<<<< Updated upstream

=======
	public void movePlayerUp() {
		player.moveBy(-1, 0);
	}
	
	public void movePlayerDown() {
		player.moveBy(1, 0);
	}
	
	public void movePlayerLeft() {
		player.moveBy(0, -1);
	}
	
	public void movePlayerRight() {
		player.moveBy(0, 1);
	}
>>>>>>> Stashed changes

	/**
	 * @return the enemies
	 */
	public ArrayList<Enemy> getEnemies() {
		return enemies;
	}
	
<<<<<<< Updated upstream
	public void updateAll() {
		player.update();
		for(Enemy e : enemies) {
			e.update();
		}
		
		player.setdRow(playerDRow);
		player.setdCol(playerDCol);
		playerDRow = 0;
		playerDCol = 0;
		
		for(int i = 0; i < walls.size(); i++) {
			Wall w = walls.get(i);
			if(w.collideWith(player)) {
				player.reverse();
			}
		}
		for(int i = 0; i < enemies.size(); i++) {
			Enemy e = enemies.get(i);
			if(e.collideWith(player)) {
				player.takeDamage();
				player.reverse();
			}
		}
		for(int i = coins.size() - 1; i >= 0; i--) {
			Coin c = coins.get(i);
			if(c.collideWith(player)) {
				coins.remove(i);
				player.gainPoints();
			}
		}
		for(int i = 0; i < enemies.size(); i++) {
			for(int j = 0; j < walls.size(); j++) {
				Enemy e = enemies.get(i);
				Wall w = walls.get(j);
				if(e.collideWith(w)) {
					e.reverse();
				}
			}
		}
		if(player.getHealth() <= 0) {
			lose = true;
		}
		else if(player.collideWith(exit) && coins.size() == 0) {
			win = true;
		}
	}

	/**
	 * @return the walls
	 */
	public ArrayList<Wall> getWalls() {
		return walls;
	}

	/**
	 * @return the coins
	 */
	public ArrayList<Coin> getCoins() {
		return coins;
	}

	/**
	 * @return the exit
	 */
	public Exit getExit() {
		return exit;
	}

	/**
	 * @return the playerDRow
	 */
	public int getPlayerDRow() {
		return playerDRow;
	}

	/**
	 * @param playerDRow the playerDRow to set
	 */
	public void setPlayerDRow(int playerDRow) {
		this.playerDRow = playerDRow;
	}

	/**
	 * @return the playerDCol
	 */
	public int getPlayerDCol() {
		return playerDCol;
	}

	/**
	 * @param playerDCol the playerDCol to set
	 */
	public void setPlayerDCol(int playerDCol) {
		this.playerDCol = playerDCol;
	}

	/**
	 * @return the win
	 */
	public boolean isWin() {
		return win;
	}

	/**
	 * @return the lose
	 */
	public boolean isLose() {
		return lose;
	}
=======
	
>>>>>>> Stashed changes
	



	
}

