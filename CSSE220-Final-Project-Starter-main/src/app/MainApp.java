package app;

import javax.swing.SwingUtilities;

import ui.GameWindow;
import model.GameModel;

/**
 * MainApp starts the program
 * @author Ben and Jerry's
 */
public class MainApp {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
		new MainApp().run();
		});
		}
	
	// This runs only once at startup:
	// MainApp creates and connects objects (no game logic here)
	public void run() {
		GameModel model = new GameModel("\\Users\\seaworb\\Documents\\Maze_Game\\CSSE220-Final-Project-Starter-main\\src\\model\\level1.txt");
		GameWindow window = new GameWindow(model);
		window.show();
	}
	
}