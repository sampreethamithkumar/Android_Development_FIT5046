package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Run time text: FIT5046");

    }

    public void click(View view) {

        TextView textView = findViewById(R.id.textView);
        String string = textView.getText().equals("Hello World") ?  "My First App" : "Hello World";
        textView.setText(string);
    }
}