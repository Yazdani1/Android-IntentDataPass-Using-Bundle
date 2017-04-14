package com.yazdaniscodelab.intentusingbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textone;

    TextView texttwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textone=(TextView)findViewById(R.id.text_one_xml);
        texttwo=(TextView)findViewById(R.id.text_two_xml);
        Bundle b=getIntent().getExtras();
        String nameone=b.getString("key_one");
        String nametwo=b.getString("key_two");
        textone.setText(nameone);
        texttwo.setText(nametwo);

    }
}
