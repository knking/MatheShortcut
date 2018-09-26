package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                percentage=(float)((marksobtain/totalMarks)*100);

                per_out.setText(String.valueOf(percentage));
            }
        });
    }
}
