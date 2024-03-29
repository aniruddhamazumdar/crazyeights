package com.gameex.crazyeights.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CustomView extends View {

	private Paint redPaint;
	private int circleX;
	private int circleY;
	private float radius;
	
	public CustomView(Context context) {
		super(context);
		
		redPaint = new Paint();
		redPaint.setAntiAlias(true);
		redPaint.setColor(Color.RED);
		circleX = 100;
		circleY = 100;
		radius = 30;
	}

	protected void onDraw(Canvas canvas){
		canvas.drawCircle(circleX, circleY, radius, redPaint);
	}
	
}
