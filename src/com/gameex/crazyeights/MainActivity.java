package com.gameex.crazyeights;

import com.example.crazyeights.R;
import com.gameex.crazyeights.views.CustomView;
import com.gameex.crazyeights.views.TitleView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends BaseGameActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TitleView titleView = new TitleView(this);
		titleView.setKeepScreenOn(true);
		setContentView(titleView);
	}
}
