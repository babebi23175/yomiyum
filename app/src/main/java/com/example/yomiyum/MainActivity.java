package com.example.yomiyum;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView greeting = new TextView(this);
        greeting.setGravity(Gravity.CENTER);
        greeting.setText(R.string.welcome_message);
        greeting.setTextSize(24);

        setContentView(greeting);
    }
}
