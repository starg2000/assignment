package com.example.intenttask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView t,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.tv);
        t2=findViewById(R.id.tv2);
        registerForContextMenu(t);
        String st=getIntent().getStringExtra("hi");
        t2.setText(st);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu,menu);
    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.s1:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.s2:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.s3:
                Toast.makeText(this, "selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}