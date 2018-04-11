package com.example.a0koraj06.android5ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class insertname extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertname);



    }

    public void addscore(View view){
        /** FIGHTER 1 **/
        EditText f1r1 = (EditText) findViewById(R.id.f1r1);
        EditText f1r2 = (EditText) findViewById(R.id.f1r2);


        int f1first = Integer.valueOf(f1r1.getText().toString());
        int f1second = Integer.valueOf(f1r2.getText().toString());
        int f1add = f1first + f1second;



        TextView totalf1 = (TextView)findViewById(R.id.totalf1);

        totalf1.setText(Integer.toString(f1add));

        /** FIGHTER 2 **/
        EditText f2r1 = (EditText) findViewById(R.id.f2r1);
        EditText f2r2 = (EditText) findViewById(R.id.f2r2);

        int f2first = Integer.valueOf(f2r1.getText().toString());
        int f2second = Integer.valueOf(f2r2.getText().toString());
        int f2add = f2first + f2second;



        TextView totalf2 = (TextView)findViewById(R.id.totalf2);

        totalf2.setText(Integer.toString(f2add));






    }


}
