package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fab extends AppCompatActivity {
    EditText fab_num;
    Button fab_find;
    TextView fab_res;
    TextView fab_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        getSupportActionBar().setTitle("Fibonacci series");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorLime)));

        fab_num=findViewById(R.id.fnumber);
        fab_find=findViewById(R.id.fbt);
        fab_res=findViewById(R.id.textView8);
        fab_out=findViewById(R.id.fout);
        fab_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fabnumber=Integer.parseInt(fab_num.getText().toString());
                int a=0,b=0,c=1;
                for(int i=1;i<=fabnumber;i++) {
                    a = b;
                    b = c;
                    c = a + b;

                    fab_out.setText(String.valueOf(a));
                }
            }
        });
    }
}
