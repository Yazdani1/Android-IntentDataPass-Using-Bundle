package com.yazdaniscodelab.intentusingbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=(Button)findViewById(R.id.btn_xml);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);

                String first="Its my first data";
                String second="Its my Second Data";

                Bundle b=new Bundle();

                b.putString("key_one",first);
                b.putString("key_two",second);

                intent.putExtras(b);

                startActivity(intent);


            }
        });


    }
}
