package com.project.bobbletask;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    SeekBar seekBar;
    int seekValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.etTextPersonName);
        textView = findViewById(R.id.textView2);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(60);
        seekBar.setProgress(30);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekValue = progress;
                //progress of seekbar in integer value


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                String temp = "Processing . . .";
                textView.setText(temp);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textView.setText(editText.getText().toString());
                textView.setTextSize(seekValue);
            }
        });
    }
}