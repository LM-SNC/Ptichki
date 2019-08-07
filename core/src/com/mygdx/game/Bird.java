package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bird {
     Texture imgBird;
     Vector2 positionBird;
     float y;
     float gravity;
     float jump;

    public Bird(){
        imgBird = new Texture("bird.png");
        positionBird = new Vector2(100,380);
        y = 0;
        gravity = -0.5f;
    }

    public void render(SpriteBatch batch){
        batch.draw(imgBird,positionBird.x,positionBird.y);

    }

    public void update(){
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
           y = 10;
            System.out.println("Прыжок был активирован");
        }
        if(Gdx.input.isKeyJustPressed(Input.Keys.Q)){
            y = 15;
            System.out.println("Супер прыжок был активирован");
        }
        y += gravity;
        positionBird.y += y;
    }
}
