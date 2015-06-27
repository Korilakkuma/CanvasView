CanvasView.java
=========
  
Android Application Library
  
## Overview
  
This library defines API for drawing application.
  
## Usage

Application creates layout XML and Activity for using this library.  
For example,  
  
    activity_draw.xml
  
    ....

    <com.android.graphics.CanvasView
        android:id="@+id/canvas"
        android:layout_width="280dp"
        android:layout_height="280dp"
        android:layout_gravity="center_horizontal" />

    ....
  
    DrawActivity.java
  
    ....

    package com.graphics;

    import android.os.Bundle;
    import android.app.Activity;
    import android.view.Menu;

    public class DrawActivity extends Activity {
        private CanvasView canvas = null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_draw);

            // Create the instance of CanvasView
            this.canvas = (CanvasView)this.findViewById(R.id.canvas);
        }

        // ....
    }
  
Creating XML and Activity enables to draw canvas.
  
## API
  
### Undo / Redo / Clear
  
    this.canvas.undo();   // Undo
    this.canvas.redo();   // Redo
    this.canvas.clear();  // Clear canvas
  
### Mode
  
The application that use this library has 3 states.
  
    // Setter
    this.canvas.setMode(CanvasView.Mode.DRAW);    // for drawing
    this.canvas.setMode(CanvasView.Mode.TEXT);    // for drawing Text
    this.canvas.setMode(CanvasView.Mode.ERASER);  // for using Eraser

    // Getter
    CanvasView.Mode mode = this.canvas.getMode();
  
### Drawer
  
This libarary enable to draw Figures.
  
    // Setter
    this.canvas.setDrawer(CanvasView.Drawer.PEN);               // Use Pen Tool
    this.canvas.setDrawer(CanvasView.Drawer.LINE);              // Draw Line
    this.canvas.setDrawer(CanvasView.Drawer.RECTANGLE);         // Draw Rectangle
    this.canvas.setDrawer(CanvasView.Drawer.CIRCLE);            // Draw Circle
    this.canvas.setDrawer(CanvasView.Drawer.ELLIPSE);           // Draw Ellipse (Oval)
    this.canvas.setDrawer(CanvasView.Drawer.QUADRATIC_BEZIER);  // Draw Quadratic Bezier

    // Getter
    CanvasView.Drawer drawer = this.canvas.getDrawer();
  
### Background color
  
    // Setter
    this.canvas.setBaseColor(Color.WHITE);

    // Getter
    int backgroundColor = this.canvas.getBaseColor();
  
### Stroke Style
  
    // Setter
    this.canvas.setPaintStyle(Paint.Style.STROKE);
    this.canvas.setPaintStyle(Paint.Style.FILL);
    this.canvas.setPaintStyle(Paint.Style.FILL_AND_STROKE);

    // Getter
    Paint.Style strokeStyle = this.canvas.getPaintStyle();
  
### Stroke Color
  
    // Setter
    this.canvas.setPaintStrokeColor(Color.RED);

    // Getter
    int color = this.canvas.getPaintStrokeColor();
  
### Stroke Width
  
    // Setter
    this.canvas.setPaintStrokeWidth(2F);

    // Getter
    float strokeWidth = this.canvas.getPaintStrokeWidth();
  
### Alpha (Opacity)
  
    // Setter
    this.canvas.setOpacity(128);  // between 0 and 255

    // Getter
    int opacity = this.canvas.getOpacity();
  
### Blur
  
    // Setter
    this.canvas.setBlur(5F);  // greater than or equal to 0

    // Getter 
    float blur = this.canvas.getBlur();
  
### Line Cap
  
    // Setter
    this.canvas.setLineCap(Paint.Cap.BUTT);
    this.canvas.setLineCap(Paint.Cap.ROUND);
    this.canvas.setLineCap(Paint.Cap.SQUARE);

    // Getter
    Paint.Cap lineCap = this.canvas.getLineCap();
  
### Draw Text
  
    // Change Mode
    this.canvas.setMode(CanvasView.Mode.TEXT);

    // Setter
    this.canvas.setText("Canvas View");

    // Getter
    String text = this.canvas.getText();
  
### Font Family / Font Size
  
    // Setter
    this.canvas.setFontFamily(Typeface.DEFAULT);
    this.canvas.setFontFamily(Typeface.DEFAULT_BOLD);
    this.canvas.setFontFamily(Typeface.SANS_SERIF);
    this.canvas.setFontFamily(Typeface.SERIF);
    this.canvas.setFontFamily(Typeface.MONOSPACE);
    this.canvas.setFontSize(24F);  // greater than or equal to 0

    // Getter
    Typeface fontFamily = this.canvas.getFontFamily();
    float fontSize      = this.canvas.getFontSize();
  
### Get Canvas as Bitmap
  
If application requires to save current canvas as Bitmap, the following methods enable to save.
  
    Bitmap bitmap = this.canvas.getBitmap();
  
In the case of adjusting size,
  
    Bitmap bitmap = this.canvas.getScaleBitmap(300, 200);  // 300 x 200
  
In the case of using byte array of bitmap,
  
    // The 1st argument is format.
    // The 2nd argument is quality.
    byte[] bytes = this.canvas.getBitmapAsByteArray(CompressFormat.PNG, 100);
  
or,
  
    // Format is PNG. Quality is 100.
    byte[] bytes = this.canvas.getBitmapAsByteArray();
  
In the case of using the specific bitmap,
  
    // ....

    byte[] bytes = CanvasView.getBitmapAsByteArray(bitmap, CompressFormat.PNG, 100);
  
### Draw Bitmap to Canvas
  
From Bitmap,
  
    // ....

    this.canvas.drawBitmap(bitmap);
  ，
From byte array of bitmap
  
    // ....

    this.canvas.drawBitmap(bytes);
  
