package com.example.intentparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
    }

    public void Enviar(View view){

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("dato", et1.getText().toString());

        startActivity(intent);
    }
}
