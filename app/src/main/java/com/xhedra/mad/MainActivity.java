package com.xhedra.mad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton help_call = findViewById(R.id.help_call);

        help_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utilities.makecall("9131981536", MainActivity.this);
            }
        });
    }
}
