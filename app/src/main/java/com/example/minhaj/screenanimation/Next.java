package com.example.minhaj.screenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Next extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        init();
    }

    private void init() {
        button = (Button) findViewById(R.id.button2);
        attachListeners();
    }

    private void attachListeners() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
        overridePendingTransition(R.anim.push_down_out,R.anim.push_down_in);
    }
}
