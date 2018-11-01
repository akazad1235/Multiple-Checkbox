package com.example.akazad.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.StringBuilder.*;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private CheckBox male, female, others;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        male= (CheckBox) findViewById(R.id.maleId);
        female=findViewById(R.id.femaleId);
        others=findViewById(R.id.othersId);
        text=findViewById(R.id.resultId);
        button=findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalvalue=0;
                StringBuilder stringBuilder =new StringBuilder();
                if(male.isChecked()){
                   String value= male.getText().toString();
                    stringBuilder.append(value +"selectd \n");
                    totalvalue+=100;
                } if(female.isChecked()){
                    String value= female.getText().toString();
                    stringBuilder.append(value + " is selected \n");
                    totalvalue+=100;
                } if(others.isChecked()){
                    String value= others.getText().toString();
                    stringBuilder.append(value + " is selected \n");
                    totalvalue+=100;
                }


                stringBuilder.append( "Total is: "+ totalvalue);
                Toast.makeText(getApplicationContext(), stringBuilder.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
