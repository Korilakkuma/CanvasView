package com.android.graphics;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import android.test.ActivityInstrumentationTestCase2;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

import main.canvasview.MainActivity;

public class CanvasViewTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity = null;
    private CanvasView canvas     = null;

    public CanvasViewTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

        this.activity = this.getActivity();
        this.canvas   = this.activity.getCanvas();
    }

    @Test
    public void testGetMode() throws Exception {
        CanvasView.Mode expected = CanvasView.Mode.DRAW;
        CanvasView.Mode actual   = this.canvas.getMode();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetMode() throws Exception {
        CanvasView.Mode expected = CanvasView.Mode.ERASER;

        this.canvas.setMode(expected);

        CanvasView.Mode actual = this.canvas.getMode();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetDrawer() throws Exception {
        CanvasView.Drawer expected = CanvasView.Drawer.PEN;
        CanvasView.Drawer actual   = this.canvas.getDrawer();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetDrawer() throws Exception {
        CanvasView.Drawer expected = CanvasView.Drawer.CIRCLE;

        this.canvas.setDrawer(expected);

        CanvasView.Drawer actual = this.canvas.getDrawer();

        assertThat(actual, is(expected));
    }

    @Test
    public void testUndo() throws Exception {
        boolean expected = false;
        boolean actual   = this.canvas.undo();

        assertThat(actual, is(expected));
    }

    @Test
    public void testRedo() throws Exception {
        boolean expected = false;
        boolean actual   = this.canvas.redo();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetBaseColor() throws Exception {
        int expected = Color.WHITE;
        int actual   = this.canvas.getBaseColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetBaseColor() throws Exception {
        int expected = Color.BLACK;

        this.canvas.setBaseColor(expected);

        int actual = this.canvas.getBaseColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetText() throws Exception {
        String expected = "";
        String actual   = this.canvas.getText();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetText() throws Exception {
        String expected = "TEST";

        this.canvas.setText(expected);

        String actual = this.canvas.getText();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetPaintStyle() throws Exception {
        Paint.Style expected = Paint.Style.STROKE;
        Paint.Style actual   = this.canvas.getPaintStyle();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetPaintStyle() throws Exception {
        Paint.Style expected = Paint.Style.FILL;

        this.canvas.setPaintStyle(expected);

        Paint.Style actual = this.canvas.getPaintStyle();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetPaintStrokeColor() throws Exception {
        int expected = Color.BLACK;
        int actual   = this.canvas.getPaintStrokeColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetPaintStrokeColor() throws Exception {
        int expected = Color.RED;

        this.canvas.setPaintStrokeColor(expected);

        int actual = this.canvas.getPaintStrokeColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetPaintFillColor() throws Exception {
        int expected = Color.BLACK;
        int actual   = this.canvas.getPaintFillColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetPaintFillColor() throws Exception {
        int expected = Color.RED;

        this.canvas.setPaintFillColor(expected);

        int actual = this.canvas.getPaintFillColor();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetPaintStrokeWidth() throws Exception {
        float expected = 3F;
        float actual   = this.canvas.getPaintStrokeWidth();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetPaintStrokeWidth() throws Exception {
        // Positive
        float expected1 = 10.5F;

        this.canvas.setPaintStrokeWidth(expected1);

        float actual1 = this.canvas.getPaintStrokeWidth();

        assertThat(actual1, is(expected1));

        // Negative
        float expected2 = 3F;

        this.canvas.setPaintStrokeWidth(-0.5F);

        float actual2 = this.canvas.getPaintStrokeWidth();

        assertThat(actual2, is(expected2));
    }

    @Test
    public void testGetOpacity() throws Exception {
        int expected = 255;
        int actual   = this.canvas.getOpacity();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetOpacity() throws Exception {
        // Positive
        int expected1 = 255;

        this.canvas.setOpacity(expected1);

        int actual1 = this.canvas.getOpacity();

        assertThat(actual1, is(expected1));

        int expected2 = 0;

        this.canvas.setOpacity(expected2);

        int actual2 = this.canvas.getOpacity();

        assertThat(actual2, is(expected2));

        // Negative
        int expected3 = 255;

        this.canvas.setOpacity(256);

        int actual3 = this.canvas.getOpacity();

        assertThat(actual3, is(expected3));

        int expected4 = 255;

        this.canvas.setOpacity(-1);

        int actual4 = this.canvas.getOpacity();

        assertThat(actual4, is(expected4));
    }

    @Test
    public void testGetBlur() throws Exception {
        float expected = 0F;
        float actual   = this.canvas.getBlur();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetBlur() throws Exception {
        // Positive
        float expected1 = 0.5F;

        this.canvas.setBlur(expected1);

        float actual1 = this.canvas.getBlur();

        assertThat(actual1, is(expected1));

        // Negative
        float expected2 = 0F;

        this.canvas.setBlur(-0.5F);

        float actual2 = this.canvas.getBlur();

        assertThat(actual2, is(expected2));
    }

    @Test
    public void testGetLineCap() throws Exception {
        Paint.Cap expected = Paint.Cap.ROUND;
        Paint.Cap actual   = this.canvas.getLineCap();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetLineCap() throws Exception {
        Paint.Cap expected = Paint.Cap.SQUARE;

        this.canvas.setLineCap(expected);

        Paint.Cap actual = this.canvas.getLineCap();

        assertThat(actual, is(expected));
    }

    @Test
    public void testGetFontSize() throws Exception {
        float expected = 32F;
        float actual   = this.canvas.getFontSize();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetFontSize() throws Exception {
        // Positive
        float expected1 = 0.5F;

        this.canvas.setFontSize(expected1);

        float actual1 = this.canvas.getFontSize();

        assertThat(actual1, is(expected1));

        // Negative
        float expected2 = 32F;

        this.canvas.setFontSize(-0.5F);

        float actual2 = this.canvas.getFontSize();

        assertThat(actual2, is(expected2));
    }

    @Test
    public void testGetFontFamily() throws Exception {
        Typeface expected = Typeface.DEFAULT;
        Typeface actual   = this.canvas.getFontFamily();

        assertThat(actual, is(expected));
    }

    @Test
    public void testSetFontFamily() throws Exception {
        Typeface expected = Typeface.SANS_SERIF;

        this.canvas.setFontFamily(expected);

        Typeface actual = this.canvas.getFontFamily();

        assertThat(actual, is(expected));
    }
}