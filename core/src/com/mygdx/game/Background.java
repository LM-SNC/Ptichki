package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {
    class BackgroundImg{
        private Texture imgBackground;
        private Vector2 position;
        public BackgroundImg(Vector2 position){
            imgBackground = new Texture("background-scene---drawing2.png");
           this.position = position;

        }

    }

    private BackgroundImg[] backgroundImgs;
    private int speed;
    public Background(){
        speed = 2;
        backgroundImgs = new BackgroundImg[2];
        backgroundImgs[0] = new BackgroundImg(new Vector2(0,0));
        backgroundImgs[1] = new BackgroundImg(new Vector2(1024,0));
    }

    public void render(SpriteBatch batch){
        for(int i = 0; i < backgroundImgs.length; i++){
            batch.draw(backgroundImgs[i].imgBackground, backgroundImgs[i].position.x, backgroundImgs[i].position.y);
        }
    }

    public void update(){
        for (int i = 0; i < backgroundImgs.length; i++){
            backgroundImgs[i].position.x -= speed;
        }
        if (backgroundImgs[0].position.x < -1024) {
            backgroundImgs[0].position.x = 0;
            backgroundImgs[1].position.x = 1024;
        }
    }
}
