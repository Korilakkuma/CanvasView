package main.canvasview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.graphics.CanvasView;

public class MainActivity extends AppCompatActivity {

    private CanvasView canvas = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.canvas = (CanvasView)this.findViewById(R.id.canvas);
    }

    public CanvasView getCanvas() {
        return this.canvas;
    }

}
