package com.example.intenttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText eobj;
TextView tobj;
Button b1o,b2o,b3o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eobj=findViewById(R.id.et);
        tobj=findViewById(R.id.tv);
        b1o=findViewById(R.id.b1);
        b2o=findViewById(R.id.b2);
        b3o=findViewById(R.id.b3);

    String str= String.valueOf(eobj.getText());
    b1o.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String str= String.valueOf(eobj.getText());
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("hi",str);
            startActivity(i);
        }
    });
    b2o.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Uri u=Uri.parse("tel:9767535454");
            Intent i=new Intent(Intent.ACTION_DIAL,u);
            startActivity(i);
        }
    });
    b3o.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Intent.ACTION_CAMERA_BUTTON);
            startActivity(intent);
        }
    });


    }

}