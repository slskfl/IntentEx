package com.example.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdoG;
    RadioButton rdoSecond, rdoThird;
    Button btnNewAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoSecond=findViewById(R.id.rdoSecond);
        rdoThird=findViewById(R.id.rdoThird);
        btnNewAct=findViewById(R.id.btnNewAct);
        rdoG=findViewById(R.id.rdoG);

        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                switch (rdoG.getCheckedRadioButtonId()) {
                    case R.id.rdoSecond:
                        intent=new Intent(getApplicationContext(), SecondActivity.class);
                        break;
                    case R.id.rdoThird:
                        intent=new Intent(getApplicationContext(), ThirdActivity.class);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}