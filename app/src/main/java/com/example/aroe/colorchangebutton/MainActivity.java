package com.example.aroe.colorchangebutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView hitler;
    private Button monalisa;
    private Button madonna;
    private Button justinbieber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitler = (TextView)findViewById(R.id.tvBox);
        monalisa = (Button)findViewById(R.id.buttonRed);
        madonna = (Button)findViewById(R.id.buttonYellow);
        justinbieber = (Button)findViewById(R.id.buttonGreen);

        monalisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitler.setBackgroundColor(Color.parseColor("red"));
            }
        });

        madonna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitler.setBackgroundColor(Color.parseColor("yellow"));
            }
        });

        justinbieber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitler.setBackgroundColor(Color.parseColor("green"));
            }
        });
    }
}
