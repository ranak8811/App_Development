package com.example.intentdatatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button) findViewById(R.id.btnId);
        editText = (EditText) findViewById(R.id.editTextId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = editText.getText().toString();

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("key", value);
                setResult(1, intent);
                finish();
            }
        });
    }
}