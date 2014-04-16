package com.gameex.crazyeights.views;

import com.gameex.crazyeights.GameActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;

public class TitleView extends View {

	Context mContext;
	
	Paint textPaint;
	Paint inverseTextPaint;
	Paint buttonPaint;
	
	public TitleView(Context context) {
		super(context);
		
		mContext = context;
		
		textPaint = new Paint();
		textPaint.setAntiAlias(true);
		textPaint.setColor(Color.BLACK);
		textPaint.setTextSize(50);
		textPaint.setTextAlign(Align.CENTER);
		textPaint.setTypeface(Typeface.DEFAULT_BOLD);
		
		inverseTextPaint = new Paint();
		inverseTextPaint.setAntiAlias(true);
		inverseTextPaint.setColor(Color.WHITE);
		inverseTextPaint.setTextSize(30);
		inverseTextPaint.setTextAlign(Align.CENTER);
		inverseTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
		
		buttonPaint = new Paint();
		buttonPaint.setAntiAlias(true);
		buttonPaint.setColor(Color.BLACK);
	}

	@Override
	protected void onDraw(Canvas canvas){
		canvas.drawText("Crazy Eights", 220, 200, textPaint);
		
		canvas.drawRect(180, 400, 380, 460, buttonPaint);
		canvas.drawText("Play", 270, 430, inverseTextPaint);
	}
	
	public boolean onTouchEvent(MotionEvent event){
		int eventAction = event.getAction();
		int eventX = (int)event.getX();
		int eventY = (int)event.getY();
		
		switch(eventAction){
		case MotionEvent.ACTION_DOWN:
			//180, 400, 380, 460 Play button area
			if(eventX > 180 && eventX < 380 && eventY > 400 && eventY < 460){
				handlePlayClick();
			}
			break;
		case MotionEvent.ACTION_UP:
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		}
		invalidate();
		return true;
	}
	
	private void handlePlayClick(){
		Intent intent = new Intent(mContext, GameActivity.class);
		mContext.startActivity(intent);
	}
}
