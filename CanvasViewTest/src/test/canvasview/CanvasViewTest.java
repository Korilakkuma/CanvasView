package test.canvasview;

// import static org.junit.Assert.*;
// import static org.hamcrest.CoreMatchers.*;

// import org.junit.Test;
// import org.junit.Before;

import test.canvasview.MainActivity;
import com.android.graphics.CanvasView;

import android.test.ActivityInstrumentationTestCase2;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

public class CanvasViewTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity = null;
    private CanvasView canvas     = null;

    public CanvasViewTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        this.activity = this.getActivity();
        this.canvas   = this.activity.getCanvas();
    }

    public void testGetMode() {
        CanvasView.Mode expected = CanvasView.Mode.DRAW;
        CanvasView.Mode actual   = this.canvas.getMode();

        assertEquals(actual, expected);
    }

    public void testSetMode() {
        CanvasView.Mode expected = CanvasView.Mode.ERASER;

        this.canvas.setMode(expected);

        CanvasView.Mode actual = this.canvas.getMode();

        assertEquals(expected, actual);
    }

    public void testGetDrawer() {
        CanvasView.Drawer expected = CanvasView.Drawer.PEN;
        CanvasView.Drawer actual   = this.canvas.getDrawer();

        assertEquals(expected, actual);
    }

    public void testSetDrawer() {
        CanvasView.Drawer expected = CanvasView.Drawer.CIRCLE;

        this.canvas.setDrawer(expected);

        CanvasView.Drawer actual = this.canvas.getDrawer();

        assertEquals(expected, actual);
    }

    public void testUndo() {
        boolean expected = false;
        boolean actual   = this.canvas.undo();

        assertEquals(expected, actual);
    }

    public void testRedo() {
        boolean expected = false;
        boolean actual   = this.canvas.redo();

        assertEquals(expected, actual);
    }

    public void testGetBaseColor() {
        int expected = Color.WHITE;
        int actual   = this.canvas.getBaseColor();

        assertEquals(expected, actual);
    }

    public void testSetBaseColor() {
        int expected = Color.BLACK;

        this.canvas.setBaseColor(expected);

        int actual = this.canvas.getBaseColor();

        assertEquals(expected, actual);
    }

    public void testGetText() {
        String expected = "";
        String actual   = this.canvas.getText();

        assertEquals(expected, actual);
    }

    public void testSetText() {
        String expected = "TEST";

        this.canvas.setText(expected);

        String actual = this.canvas.getText();

        assertEquals(expected, actual);
    }

    public void testGetPaintStyle() {
        Paint.Style expected = Paint.Style.STROKE;
        Paint.Style actual   = this.canvas.getPaintStyle();

        assertEquals(expected, actual);
    }

    public void testSetPaintStyle() {
        Paint.Style expected = Paint.Style.FILL;

        this.canvas.setPaintStyle(expected);

        Paint.Style actual = this.canvas.getPaintStyle();

        assertEquals(expected, actual);
    }

    public void testGetPaintStrokeColor() {
        int expected = Color.BLACK;
        int actual   = this.canvas.getPaintStrokeColor();

        assertEquals(expected, actual);
    }

    public void testSetPaintStrokeColor() {
        int expected = Color.RED;

        this.canvas.setPaintStrokeColor(expected);

        int actual = this.canvas.getPaintStrokeColor();

        assertEquals(expected, actual);
    }

    public void testGetPaintFillColor() {
        int expected = Color.BLACK;
        int actual   = this.canvas.getPaintFillColor();

        assertEquals(expected, actual);
    }

    public void testSetPaintFillColor() {
        int expected = Color.RED;

        this.canvas.setPaintFillColor(expected);

        int actual = this.canvas.getPaintFillColor();

        assertEquals(expected, actual);
    }

    public void testGetPaintStrokeWidth() {
        float expected = 3F;
        float actual   = this.canvas.getPaintStrokeWidth();

        assertEquals(expected, actual);
    }

    public void testSetPaintStrokeWidth() {
        // Positive
        float expected1 = 10.5F;

        this.canvas.setPaintStrokeWidth(expected1);

        float actual1 = this.canvas.getPaintStrokeWidth();

        assertEquals(expected1, actual1);

        // Negative
        float expected2 = 3F;

        this.canvas.setPaintStrokeWidth(-0.5F);

        float actual2 = this.canvas.getPaintStrokeWidth();

        assertEquals(expected2, actual2);
    }

    public void testGetOpacity() {
        int expected = 255;
        int actual   = this.canvas.getOpacity();

        assertEquals(expected, actual);
    }

    public void testSetOpacity() {
        // Positive
        int expected1 = 255;

        this.canvas.setOpacity(expected1);

        int actual1 = this.canvas.getOpacity();

        assertEquals(expected1, actual1);

        int expected2 = 0;

        this.canvas.setOpacity(expected2);

        int actual2 = this.canvas.getOpacity();

        assertEquals(expected2, actual2);

        // Negative
        int expected3 = 255;

        this.canvas.setOpacity(256);

        int actual3 = this.canvas.getOpacity();

        assertEquals(expected3, actual3);

        int expected4 = 255;

        this.canvas.setOpacity(-1);

        int actual4 = this.canvas.getOpacity();

        assertEquals(expected4, actual4);
    }

    public void testGetBlur() {
        float expected = 0F;
        float actual   = this.canvas.getBlur();

        assertEquals(expected, actual);
    }

    public void testSetBlur() {
        // Positive
        float expected1 = 0.5F;

        this.canvas.setBlur(expected1);

        float actual1 = this.canvas.getBlur();

        assertEquals(expected1, actual1);

        // Negative
        float expected2 = 0F;

        this.canvas.setBlur(-0.5F);

        float actual2 = this.canvas.getBlur();

        assertEquals(expected2, actual2);
    }

    public void testGetLineCap() {
        Paint.Cap expected = Paint.Cap.ROUND;
        Paint.Cap actual   = this.canvas.getLineCap();

        assertEquals(expected, actual);
    }

    public void testSetLineCap() {
        Paint.Cap expected = Paint.Cap.SQUARE;

        this.canvas.setLineCap(expected);

        Paint.Cap actual = this.canvas.getLineCap();

        assertEquals(expected, actual);
    }

    public void testGetFontSize() {
        float expected = 32F;
        float actual   = this.canvas.getFontSize();

        assertEquals(expected, actual);
    }

    public void testSetFontSize() {
        // Positive
        float expected1 = 0.5F;

        this.canvas.setFontSize(expected1);

        float actual1 = this.canvas.getFontSize();

        assertEquals(expected1, actual1);

        // Negative
        float expected2 = 32F;

        this.canvas.setFontSize(-0.5F);

        float actual2 = this.canvas.getFontSize();

        assertEquals(expected2, actual2);
    }

    public void testGetFontFamily() {
        Typeface expected = Typeface.DEFAULT;
        Typeface actual   = this.canvas.getFontFamily();

        assertEquals(expected, actual);
    }

    public void testSetFontFamily() {
        Typeface expected = Typeface.SANS_SERIF;

        this.canvas.setFontFamily(expected);

        Typeface actual = this.canvas.getFontFamily();

        assertEquals(expected, actual);
    }

}
