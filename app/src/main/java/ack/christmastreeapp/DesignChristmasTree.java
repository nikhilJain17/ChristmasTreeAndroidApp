package ack.christmastreeapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class DesignChristmasTree extends Activity {


    SurfaceHolder holder = new SurfaceHolder() {
        @Override
        public void addCallback(Callback callback) {

        }

        @Override
        public void removeCallback(Callback callback) {

        }

        @Override
        public boolean isCreating() {
            return false;
        }

        @Override
        public void setType(int type) {

        }

        @Override
        public void setFixedSize(int width, int height) {

        }

        @Override
        public void setSizeFromLayout() {

        }

        @Override
        public void setFormat(int format) {

        }

        @Override
        public void setKeepScreenOn(boolean screenOn) {

        }

        @Override
        public Canvas lockCanvas() {
            return null;
        }

        @Override
        public Canvas lockCanvas(Rect dirty) {
            return null;
        }

        @Override
        public void unlockCanvasAndPost(Canvas canvas) {

        }

        @Override
        public Rect getSurfaceFrame() {
            return null;
        }

        @Override
        public Surface getSurface() {
            return null;
        }
    };
    Canvas canvas = new Canvas();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_christmas_tree);



            canvas.drawARGB(255, 20, 20, 200);



    }

    // listens to dragging of ball
    public boolean onTouchEvent(MotionEvent event) {



        int action = event.getAction();             // event type
        int actionIndex = event.getActionIndex();   // pointer, ie. finger (?)

        Canvas canvas = new Canvas();
        canvas.drawARGB(255, 200, 149, 32);


        if (action == MotionEvent.ACTION_MOVE) {

            float x = event.getX();
            float y = event.getY();

            Paint paint = new Paint();

            //canvas.drawColor(0x255);    // hah
            canvas.drawARGB(255, 200, 149, 32);
            canvas.drawRect(x - 10, y + 10, x + 10, y - 10, paint);
        }

        return true;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.design_christmas_tree, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
