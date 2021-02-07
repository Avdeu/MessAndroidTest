package com.example.mytest;

import android.widget.EditText;
import android.widget.TextView;

public class Sending
{
    private String message;

    public void SettingMessage(TextView textView, EditText editText)
    {
        textView.setText(editText.getText());
    }
}
