package com.maxiee.heartbeatsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.maxiee.hbsdk.api.EventAPI;
import com.maxiee.hbsdk.model.Event;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.random_event)    Button      mRandomEventButton;
    @Bind(R.id.get_event)       Button      mGetEventButton;
    @Bind(R.id.input_id)        EditText    mIdInput;

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

    @OnClick(R.id.get_event)
    public void getEvent() {
        String input = mIdInput.getText().toString();
        if (input.isEmpty()) {
            Toast.makeText(MainActivity.this, "Please input id.", Toast.LENGTH_SHORT).show();
            return;
        }
        Event e = EventAPI.getEvent(this, Long.parseLong(input));
        if (e == null) {
            Toast.makeText(MainActivity.this, "This id has no event.", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(MainActivity.this, e.getEvent(), Toast.LENGTH_SHORT).show();
    }
}
