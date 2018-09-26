package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EvenOdd extends AppCompatActivity {
    EditText ent_num;
    Button check;
    TextView result,output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd);
        getSupportActionBar().setTitle("Check Even and Odd");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.olove)));

        ent_num=findViewById(R.id.editText4);
        check=findViewById(R.id.button);
        result=findViewById(R.id.textView2);
        output=findViewById(R.id.textView);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number=Integer.parseInt(ent_num.getText().toString());
                number=number % 2;
                if(number==0){
                  output.setText("Enter Number Is Even");
                }
                else {
                    output.setText("Enter Number Is Odd");
                }
            }
        });

    }
}
