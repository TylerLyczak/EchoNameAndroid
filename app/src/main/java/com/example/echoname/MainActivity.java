package com.example.echoname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void submitClick (View view) {

        EditText inputText = (EditText)findViewById(R.id.inputText);

        Toast.makeText(this, inputText.getText().toString(), Toast.LENGTH_SHORT).show();

        TextView changeText = (TextView)findViewById(R.id.echoChangeText);
        String constant = "You Said: ";
        changeText.setText(constant+inputText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
