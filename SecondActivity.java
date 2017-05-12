package com.example.bishe111;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String a = intent.getStringExtra("nameA");
               
     
        TextView textView = (TextView)findViewById(R.id.textView2);
        
        textView.setText(a);
    }
}
