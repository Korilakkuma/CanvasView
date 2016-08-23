package main.canvasview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.graphics.CanvasView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CanvasView canvas = null;
    private Button buttonPen = null;
    private Button buttonLine = null;
    private Button buttonRectangle = null;
    private Button buttonCircle = null;
    private Button buttonEllipse = null;
    private Button buttonQuadratic = null;
    private Button buttonDraw = null;
    private Button buttonText = null;
    private Button buttonErase = null;
    private Button buttonUndo = null;
    private Button buttonRedo = null;
    private Button buttonClear = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.canvas = (CanvasView) this.findViewById(R.id.canvas);
        this.buttonPen = (Button) this.findViewById(R.id.button_pen);
        this.buttonLine = (Button) this.findViewById(R.id.button_line);
        this.buttonRectangle = (Button) this.findViewById(R.id.button_rectangle);
        this.buttonCircle = (Button) this.findViewById(R.id.button_circle);
        this.buttonEllipse = (Button) this.findViewById(R.id.button_ellipse);
        this.buttonQuadratic = (Button) this.findViewById(R.id.button_quadratic);
        this.buttonDraw = (Button) this.findViewById(R.id.button_draw);
        this.buttonText = (Button) this.findViewById(R.id.button_text);
        this.buttonErase = (Button) this.findViewById(R.id.button_erase);
        this.buttonUndo = (Button) this.findViewById(R.id.button_undo);
        this.buttonRedo = (Button) this.findViewById(R.id.button_redo);
        this.buttonClear = (Button) this.findViewById(R.id.button_clear);

        setOnClickListener();

        // The lines below enable draw and fill the background of the draw with some color
        // this.canvas.setPaintStyle(Paint.Style.STROKE);
        // this.canvas.setPaintStyle(Paint.Style.FILL_AND_STROKE);

         this.canvas.setPaintStrokeColor(Color.BLUE);
    }

    private void setOnClickListener() {
        if (buttonPen != null && buttonLine != null && buttonRectangle != null
                && buttonCircle != null && buttonEllipse != null && buttonQuadratic != null) {
            buttonPen.setOnClickListener(this);
            buttonLine.setOnClickListener(this);
            buttonRectangle.setOnClickListener(this);
            buttonCircle.setOnClickListener(this);
            buttonEllipse.setOnClickListener(this);
            buttonQuadratic.setOnClickListener(this);
            buttonDraw.setOnClickListener(this);
            buttonText.setOnClickListener(this);
            buttonErase.setOnClickListener(this);
            buttonUndo.setOnClickListener(this);
            buttonRedo.setOnClickListener(this);
            buttonClear.setOnClickListener(this);
        }
    }

    public CanvasView getCanvas() {
        return this.canvas;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_pen:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setPaintStrokeWidth(3);
                this.canvas.setDrawer(CanvasView.Drawer.PEN);
                break;
            case R.id.button_line:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setDrawer(CanvasView.Drawer.LINE);
                break;
            case R.id.button_rectangle:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setPaintStrokeWidth(3);
                this.canvas.setDrawer(CanvasView.Drawer.RECTANGLE);
                break;
            case R.id.button_circle:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setPaintStrokeWidth(3);
                this.canvas.setDrawer(CanvasView.Drawer.CIRCLE);
                break;
            case R.id.button_ellipse:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setPaintStrokeWidth(3);
                this.canvas.setDrawer(CanvasView.Drawer.ELLIPSE);
                break;
            case R.id.button_quadratic:
                this.canvas.setMode(CanvasView.Mode.DRAW);
                this.canvas.setPaintStrokeWidth(3);
                this.canvas.setDrawer(CanvasView.Drawer.QUADRATIC_BEZIER);
                break;
            case R.id.button_text:
                this.canvas.setMode(CanvasView.Mode.TEXT);
                this.canvas.setText("Canvas View");
                break;
            case R.id.button_erase:
                this.canvas.setMode(CanvasView.Mode.ERASER);
                this.canvas.setPaintStrokeWidth(20);
                break;
            case R.id.button_undo:
                this.canvas.undo();
                break;
            case R.id.button_redo:
                this.canvas.redo();
                break;
            case R.id.button_clear:
                this.canvas.clear();
                break;
        }
    }
}
