package com.acidopal.myasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String DEMO_ASYNC = "DemoAsync";
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvStatus = findViewById(R.id.tv_status);
        DemoAsync demoAsync = new DemoAsync();
        
    }

    private class DemoAsync {
    }
}
