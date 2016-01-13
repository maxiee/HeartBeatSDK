package com.maxiee.heartbeatsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.maxiee.hbsdk.api.EventAPI;
import com.maxiee.hbsdk.model.Event;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.random_event)    Button  mRandomEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.random_event)
    public void randomEvent() {
        Event e = EventAPI.random(this);
        Toast.makeText(MainActivity.this, e.getEvent(), Toast.LENGTH_SHORT).show();
    }
}
