package com.example.hellotoastasgn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bton;
TextView tv;
int cvalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bton=findViewById(R.id.bton);
        tv=findViewById(R.id.tv);

        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cvalue++;
                tv.setText(Integer.toString(cvalue));
                Toast.makeText(MainActivity.this, "count value is "+ cvalue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}