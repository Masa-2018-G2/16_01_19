package com.sheygam.masa_2018_g2_16_01_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputText;
    private TextView userTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myBtn = findViewById(R.id.my_btn);
        Button secondBtn = findViewById(R.id.second_btn);
        Button getInputBtn = findViewById(R.id.get_input_btn);
        inputText = findViewById(R.id.input_text);
        userTxt = findViewById(R.id.user_txt);

        getInputBtn.setOnClickListener(this);
        secondBtn.setOnClickListener(this);
        myBtn.setOnClickListener(this);
    }


    public void myBtnClicked(View view){
//        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Object obj = null;
        if(v.getId() == R.id.my_btn) {
//            obj.toString();
//            Toast.makeText(this, "OnClick", Toast.LENGTH_SHORT).show();
            String input = inputText.getText().toString();
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("DATA",input);
            startActivity(intent);

        }else if(v.getId() == R.id.second_btn){
            Log.d("MY_TAG","was clicked second btn");
        }else if(v.getId() == R.id.get_input_btn){
            String input = inputText.getText().toString();
            userTxt.setText(input);
        }
    }
}
