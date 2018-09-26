package com.krishna.mathshortcut;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNum extends AppCompatActivity {
    EditText prime_num;
    Button bt;
    TextView prime_res;
    TextView prime_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_num);
        getSupportActionBar().setTitle("Find Prime number");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorIris)));
        prime_num=findViewById(R.id.prime);
        bt=findViewById(R.id.find);
        prime_res=findViewById(R.id.textView7);
        prime_out=findViewById(R.id.pout);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double prime_number=Integer.parseInt(prime_num.getText().toString());
                int p;
                 for(int i=2;i<prime_number;i++)
                 {
                     p=0;

                     for(int j=2;j<i;j++)
                     {
                         if(i%j==0)
                             p=1;
                     }
                     if(p==0);
                     prime_out.setText(i);
                 }
            }
        });
    }
}
