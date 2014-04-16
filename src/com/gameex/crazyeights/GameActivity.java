package com.gameex.crazyeights;

import com.gameex.crazyeights.views.GameView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GameActivity extends BaseGameActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		GameView gameView = new GameView(this);
		setContentView(gameView);
	}
}
