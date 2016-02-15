package com.pp.sievebypass;

import android.content.ComponentName;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

    Button btnStartAnotherActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAnotherActivity = (Button) findViewById(R.id.btnStartAnotherActivity);

        btnStartAnotherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.mwr.example.sieve", "com.mwr.example.sieve.PWList"));
        startActivity(intent);

    }

}