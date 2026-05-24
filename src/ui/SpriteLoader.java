package ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteLoader {

    private BufferedImage playerSprite;
    private BufferedImage zombieSprite;
    private BufferedImage wallSprite;
    private BufferedImage coinSprite;
    private BufferedImage exitSprite;

    public SpriteLoader() {
        try {
            playerSprite = ImageIO.read(new File("player.png"));
            zombieSprite = ImageIO.read(new File("zombie.png"));
            wallSprite = ImageIO.read(new File("wall.png"));
            coinSprite = ImageIO.read(new File("coin.png"));
            exitSprite = ImageIO.read(new File("exit.png"));
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
    public BufferedImage getWallSprite() {
        return wallSprite;
    }
    public BufferedImage getCoinSprite() {
        return coinSprite;
    }
    public BufferedImage getExitSprite() {
        return exitSprite;
    }

}
