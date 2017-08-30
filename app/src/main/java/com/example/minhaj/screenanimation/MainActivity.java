package com.example.minhaj.screenanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        button = (Button) findViewById(R.id.button);
        attachListeners();
    }

    private void attachListeners() {
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startNextActivity();
    }

    private void startNextActivity() {
        startActivity(new Intent(this,Next.class));
        overridePendingTransition(R.anim.push_down_in,R.anim.push_down_out);
    }
}
