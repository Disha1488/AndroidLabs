package com.CST2335.pate0841;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main_linear);
        //setContentView(R.layout.activity_main_grid);
        setContentView(R.layout.activity_main_grid);

        TextView mytext = findViewById(R.id.text);
        Button mybtn = findViewById(R.id.btn);
        CheckBox mycbox = findViewById(R.id.cbox);
        ImageButton myimg_btn = findViewById(R.id.img_btn);
        EditText myetext = findViewById(R.id.etext);
        Switch swi = findViewById(R.id.swi);

        mybtn.setOnClickListener(cl-> Toast.makeText(MainActivity.this,
                getResources().getString(R.string.toast_message), Toast.LENGTH_LONG).show());

        swi.setOnCheckedChangeListener((ccl, b)->
        {
            Snackbar sb = Snackbar.make(ccl,(b?"Switch is ON" : "Switch is OFF"), Snackbar.LENGTH_LONG);
            sb.setAction("Undo", click-> ccl.setChecked(!b));
        });
/*
        swi.setOnCheckedChangeListener((cb, b)->
        {
            Snackbar sb1 = Snackbar.make(cb,(b?"Switch is ON" : "Switch is OFF"), Snackbar.LENGTH_LONG);
            sb1.setAction("Undo", click->cb.setChecked(!b));
        });
*/
    }
}