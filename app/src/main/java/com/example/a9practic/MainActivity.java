package com.example.a9practic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void onCheckboxClicked(View view) {
        // Get the checkbox
        CheckBox checkBox = (CheckBox) view;
        TextView selection = findViewById(R.id.selection);

        // Check if the checkbox is checked
        if (checkBox.isChecked()) {
            selection.setText("Включено");
            checkBox.setText("Выключить");
        } else {
            selection.setText("Выключено");
            checkBox.setText("Включить");
        }
    }
}
