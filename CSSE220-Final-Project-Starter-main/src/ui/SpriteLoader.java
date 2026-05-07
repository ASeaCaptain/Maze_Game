package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteLoader {

    private BufferedImage playerSprite;
    private BufferedImage zombieSprite;

    public SpriteLoader() {
        try {
            playerSprite = ImageIO.read(new File("images/player.png"));
            zombieSprite = ImageIO.read(new File("images/zombie.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getPlayerSprite() {
        return playerSprite;
    }

    public BufferedImage getZombieSprite() {
        return zombieSprite;
    }
}
