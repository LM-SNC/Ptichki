package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Ricardo {
    class Trumpet{
        Vector2 position;
        float speed;

        public Trumpet(Vector2 position){
            this.position = position;
            speed = 2;

        }
        public void update(){
            position.x -= speed;
        }
    }

    Trumpet[] trumpets;
    Texture pmgTrumpets;
    int intervalTrumpets;

    public Ricardo(){
        pmgTrumpets = new Texture("ricardo.png");
        trumpets = new Trumpet[4];
        intervalTrumpets = 250;
        int startPositionX = 220;
        for (int i = 0; i < trumpets.length;i++){
            trumpets[i] = new Trumpet(new Vector2(startPositionX,0));
            startPositionX += 220;
        }

    }
    public void render(SpriteBatch batch){
        for (int i = 0; i < trumpets.length; i++) {
            batch.draw(pmgTrumpets,trumpets[i].position.x,trumpets[i].position.y);
        }
    }
    public void update(){
        for (int i = 0; i < trumpets.length; i++){
            trumpets[i].update();
        }
    }
}
