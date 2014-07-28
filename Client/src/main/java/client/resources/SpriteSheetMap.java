package client.resources;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.io.IOException;
import java.util.HashMap;

import resources.Registry;

/**
 * Created by rbooth on 7/24/14.
 */
public class SpriteSheetMap extends HashMap<Byte, SpriteSheet> {
    public static final byte RED_PADDLE = (byte) 0;
    public static final byte BLUE_PADDLE = (byte) 1;
    public SpriteSheetMap() {
        SpriteSheet redPaddle = null;
        SpriteSheet bluePaddle = null;
        try {
            redPaddle = new SpriteSheet(Registry.getResources("redPaddleSprite.jpg"), 20, 200);
            bluePaddle = new SpriteSheet(Registry.getResources("bluePaddleSprite.jpg"), 20, 200);
        } catch (SlickException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.put(RED_PADDLE, redPaddle);
        this.put(BLUE_PADDLE, bluePaddle);
    }
}
