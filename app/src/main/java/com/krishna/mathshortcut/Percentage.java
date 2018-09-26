package com.krishna.mathshortcut;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Percentage extends AppCompatActivity {
    EditText per_number, persec_number;
    Button per_find;
    TextView per_res,per_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);
        getSupportActionBar().setTitle("Find Percentage");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));
        per_number=findViewById(R.id.pernumber);
        persec_number=findViewById(R.id.persecnumber);
        per_find=findViewById(R.id.perfind);
        per_res=findViewById(R.id.perresult);
        per_out=findViewById(R.id.perout);

        per_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float percentage;


                int totalMarks=Integer.parseInt(per_number.getText().toString());
                int marksobtain=Integer.parseInt(persec_number.getText().toString());
               // if(persec_number.getText().length()<=500)
                    if(marksobtain<=totalMarks)
                {

                    percentage = (float) ((marksobtain * 100) / totalMarks);
                    String mytext = Float.toString(percentage);

                    per_out.setText(mytext);
                }
                else {
                   Toast toast= Toast.makeText(Percentage.this, " Obtain Number is Greater Than Total Number", Toast.LENGTH_LONG);
                   toast.show();
                    toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
                   toast.getView().setBackgroundColor(Color.RED);

                }

            }
        });
    }
}
