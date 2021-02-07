package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button bFlash;
    private Sending sending;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        textView = findViewById(R.id.text2);
        editText = findViewById(R.id.editText);
        bFlash = findViewById(R.id.button);
        sending = new Sending();
    }

    public void onClickButton(View view)
    {
        sending.SettingMessage(textView, editText);
    }
}