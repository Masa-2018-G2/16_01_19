package com.sheygam.masa_2018_g2_16_01_19;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView resultTxt = findViewById(R.id.result_txt);
        Intent intent = getIntent();
        String str = intent.getStringExtra("DATA");
        if(str != null){
            resultTxt.setText(str);
        }

        Button finishBtn = findViewById(R.id.finish_btn);
        finishBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.finish_btn){
            finish();
        }
    }
}
