package com.krishna.mathshortcut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        String trickname []={"Check number is even and odd","Find all even number","Find all odd number","Check prime number","Find prime number upto N number","Find Fibonacci series","Check number is palindrom or not","Check number is armstrong or not","Check leap year","Find Percentage","Table of Number"};
        ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,trickname);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, EvenOdd.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent=new Intent(MainActivity.this,Even.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent=new Intent(MainActivity.this,Odd.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent=new Intent(MainActivity.this,Prime.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent=new Intent(MainActivity.this,PrimeNum.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent=new Intent(MainActivity.this,Fab.class);
                    startActivity(intent);
                }
                if(position==6){
                    Intent intent=new Intent(MainActivity.this,Palindrom.class);
                    startActivity(intent);
                }
                if(position==7){
                    Intent intent=new Intent(MainActivity.this,Armstrong.class);
                    startActivity(intent);
                }
                if(position==8){
                    Intent intent=new Intent(MainActivity.this,Leap.class);
                    startActivity(intent);
                }
                if(position==9) {
                    Intent intent = new Intent(MainActivity.this,Percentage.class);
                    startActivity(intent);
                }
                if(position==10) {
                    Intent intent = new Intent(MainActivity.this, Table.class);
                    startActivity(intent);
                }
            }
        });
    }
}
