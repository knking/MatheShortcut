package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Even extends AppCompatActivity {
    EditText ev_num;
    Button find;
    TextView ev_result,ev_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even);
        getSupportActionBar().setTitle(" Find Even Number");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        ev_num=findViewById(R.id.editText);
        find=findViewById(R.id.button2);
        ev_result=findViewById(R.id.textView3);
        ev_out=findViewById(R.id.textView4);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num=Integer.parseInt(ev_num.getText().toString());
                for(int i=1;i<=num;i++)
                {

                    if(i % 2==0)
                   {
                        ev_out.setText(i);
                    }
                }
            }
        });
    }
}
