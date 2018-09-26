package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prime extends AppCompatActivity {
    EditText p_num;
    Button pcheck;
    TextView p_result,p_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
        getSupportActionBar().setTitle("Check Prime number");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorLime)));

        p_num=findViewById(R.id.editText2);
        pcheck=findViewById(R.id.button3);
        p_result=findViewById(R.id.textView5);
        p_out=findViewById(R.id.textView6);

        pcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n=Integer.parseInt(p_num.getText().toString());
                int p=0;
                for(int i=2;i<n;i++)
                {
                    if(n %i==0)

                        p=1;

                }
                if(p==0)
                {
                    p_out.setText("Number is Prime");
                }
                else {
                    p_out.setText("Number is not prime");
                }
            }
        });
    }
}
