package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Leap extends AppCompatActivity {
    EditText leap_num;
    Button leap_bt;
    TextView leap_res;
    TextView leap_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap);
        getSupportActionBar().setTitle("Check leap year");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorAccent)));
        leap_num=findViewById(R.id.fabnumber);
        leap_bt=findViewById(R.id.fabbutton);
        leap_res=findViewById(R.id.fabresult);
        leap_out=findViewById(R.id.fabout);

        leap_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double leapnumber=Integer.parseInt(leap_num.getText().toString());
                boolean leapYear=false;
                if(leapnumber % 4==0)
                {
                    if(leapnumber % 100==0) {

                        if (leapnumber % 400 == 0)
                            leapYear = true;
                        else
                            leapYear = false;
                    }
                    else
                        leapYear=true;
                }
                else leapYear=false;
                if(leapYear)
                    leap_out.setText("This is leapyear");
                else
                    leap_out.setText("This is NOT leapyear");
            }
        });

    }
}
