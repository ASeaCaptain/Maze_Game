package ui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class SpriteGenerator {

    public BufferedImage generatePlayerSprite() {
        BufferedImage img = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        g2d.setColor(new Color(116, 73, 54));
        g2d.fillRect(8, 4, 16, 16);
        
        g2d.setColor(new Color(0, 168, 168));
        g2d.fillRect(8, 20, 16, 12);
        
        g2d.dispose();
        return img;
    }

    public BufferedImage generateZombieSprite() {
        BufferedImage img = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        g2d.setColor(new Color(65, 113, 40));
        g2d.fillRect(8, 4, 16, 16);
        
        g2d.setColor(new Color(0, 168, 168));
        g2d.fillRect(8, 20, 16, 12);
        
        g2d.dispose();
        return img;
    }
<<<<<<< Updated upstream
    public BufferedImage generateWallSprite() {
        BufferedImage img = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        g2d.setColor(new Color(116, 73, 54));
        g2d.fillRect(8, 4, 16, 16);
        
        g2d.setColor(new Color(0, 168, 168));
        g2d.fillRect(8, 20, 16, 12);
        
        g2d.dispose();
        return img;
    }
    public BufferedImage generateCoinSprite() {
        BufferedImage img = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        g2d.setColor(new Color(116, 73, 54));
        g2d.fillRect(8, 4, 16, 16);
        
        g2d.setColor(new Color(0, 168, 168));
        g2d.fillRect(8, 20, 16, 12);
        
        g2d.dispose();
        return img;
    }
    public BufferedImage generateExitSprite() {
        BufferedImage img = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        
        g2d.setColor(new Color(116, 73, 54));
        g2d.fillRect(8, 4, 16, 16);
        
        g2d.setColor(new Color(0, 168, 168));
        g2d.fillRect(8, 20, 16, 12);
        
        g2d.dispose();
        return img;
    }
=======
>>>>>>> Stashed changes
}
