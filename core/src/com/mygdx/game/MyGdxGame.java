package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Background background;
	Bird bird;
	Ricardo ricardo;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Background();
		bird = new Bird();
		ricardo = new Ricardo();
	}

    @Override
    public void render () {
        update();
		Gdx.gl.glClearColor(0, 0, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        background.update();
        background.render(batch);
		bird.render(batch);
		ricardo.render(batch);
        batch.end();
    }
	public void update(){
		background.update();
		ricardo.update();
		bird.update();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
