package model;

import java.awt.Rectangle;

public abstract class Collidable {
	
	public abstract Rectangle getBounds();
	
	public abstract boolean collideWith(Collidable other);

}
