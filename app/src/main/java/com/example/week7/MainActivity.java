package com.example.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView helloText;
    private TextView updateText;
    private TextView updateTextRT;
    private EditText editTextRT;
    private EditText editText;
    private String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloText = findViewById(R.id.helloText);
        updateText = findViewById(R.id.updateText);
        updateTextRT = findViewById(R.id.updateTextRT);
        editTextRT = findViewById(R.id.editTextRT);
        editText = findViewById(R.id.editText);

        editTextRT.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateTextRT.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void helloWorld(View v) {
        System.out.println("Hello World!");
        helloText.setText("Hello World!");
    }

    public void updateText(View v) {
        input = editText.getText().toString();
        editText.setText("");
        updateText.setText(input);
    }
}
