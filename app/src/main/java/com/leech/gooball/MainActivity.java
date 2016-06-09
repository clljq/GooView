package com.leech.gooball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.leech.gooball.ui.GooView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GooView(MainActivity.this));
    }
}
