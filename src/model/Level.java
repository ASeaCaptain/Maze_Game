package model;

import java.util.ArrayList;

public class Level {
	
	private final ArrayList<String> rows;
	
    public Level(ArrayList<String> rows) {
        this.rows = rows;
    }

	/**
	 * @return the rows
	 */
	public ArrayList<String> getRows() {
		return rows;
	}
    

}
