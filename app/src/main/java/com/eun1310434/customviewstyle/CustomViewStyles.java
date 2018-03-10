/*=====================================================================
□ Infomation
  ○ Data : 10.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 다양한 뷰 그리기
     - 사각형(실선, 채우기, 점선) 그리기
     - 원(실선, 채우기, 점선) 그리기
     - 글자 (실선, 채우기)
     - 잘라내기

□ Study
  ○
=====================================================================*/
package com.eun1310434.customviewstyle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Region;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomViewStyles extends View {
	
	private Paint paint;
	public CustomViewStyles(Context context) {
		super(context);
		setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
		paint = new Paint();
	}

	public CustomViewStyles(Context context, @Nullable AttributeSet attrs, Paint paint) {
		super(context, attrs);
		paint = new Paint();
	}

	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		onDrawRectangleStroke_a(canvas);
		onDrawRectangleFill_a(canvas);
		onDrawRectangleStroke_b(canvas);
		onDrawRectangleFill_b(canvas);
		onDrawCircleStroke_a(canvas);
		onDrawCircleStroke_b(canvas);
		onTextStroke(canvas);
		onTextFill(canvas);
		onDrawClipping(canvas);
	}

	public void onDrawRectangleStroke_a(Canvas canvas){
		// Rectangle #1 Stroke
		paint.setStyle(Style.STROKE); //실선
		paint.setStrokeWidth(5.0F); // 실선굵기
		paint.setColor(Color.RED);
		canvas.drawRect(10, 10, 200, 200, paint);
	}

	public void onDrawRectangleFill_a(Canvas canvas){
		// Rectangle #1 Fill
		paint.setStyle(Style.FILL);
		paint.setColor(Color.GREEN);
		canvas.drawRect(210, 10, 400, 200, paint);
	}

	public void onDrawRectangleStroke_b(Canvas canvas){
		// Rectangle #2 Stroke
		DashPathEffect dashEffect = new DashPathEffect(new float[]{5,5}, 1);//점선
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(3.0F);
		paint.setPathEffect(dashEffect);
		paint.setColor(Color.CYAN);
		canvas.drawRect(410, 10, 600, 200, paint);
	}

	public void onDrawRectangleFill_b(Canvas canvas){
		// Rectangle #2 Fill
		paint.setStyle(Style.FILL);
		paint.setARGB(128, 100, 0, 100);
		canvas.drawRect(610, 10, 800, 200, paint);
	}

	public void onDrawCircleStroke_a(Canvas canvas){
		// Circle #1 Stroke
		paint = new Paint();
		paint.setStyle(Style.STROKE); //실선
		paint.setStrokeWidth(5.0F); // 실선굵기
		paint.setColor(Color.RED);
		canvas.drawCircle(10 + 100, 210 + 100, 100, paint);
	}

	public void onDrawCircleStroke_b(Canvas canvas){
		// Circle #2 Stroke
		paint.setStyle(Style.FILL);
		paint.setColor(Color.GREEN);
		paint.setAntiAlias(true);
		canvas.drawCircle(10 + 100*3, 210 + 100, 100, paint);
	}

	public void onTextStroke(Canvas canvas){
		// Text #1 Stroke
		paint.setStyle(Style.STROKE);
		paint.setStrokeWidth(5);
		paint.setColor(Color.BLACK);
		paint.setTextSize(150);
		canvas.drawText("Stroke Text", 10, 600, paint);
	}

	public void onTextFill(Canvas canvas){
		// Text #2 Fill
		paint.setStyle(Style.FILL);
		paint.setColor(Color.WHITE);
		paint.setTextSize(150);
		canvas.drawText("Fill Text", 10, 750, paint);
	}

	public void onDrawClipping(Canvas canvas){
		// Clipping
		canvas.clipRect(10, 10, 250, 800 + 270, Region.Op.REPLACE);
		paint.setStyle(Style.FILL);
		paint.setColor(Color.RED);
		canvas.drawRect(10, 800, 320, 800 + 340, paint);
	}


}
