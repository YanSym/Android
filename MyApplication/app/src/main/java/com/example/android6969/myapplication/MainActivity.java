package com.example.android6969.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView txt1;
    EditText etxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ciclo de Vida", "onCreate");

        btn1 = (Button) findViewById(R.id.button);
        txt1 = (TextView) findViewById(R.id.textView);
        etxt1 = (EditText) findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = etxt1.getText().toString();
                txt1.setText(texto);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Ciclo de Vida", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Ciclo de Vida", "onPause");
    }
}
