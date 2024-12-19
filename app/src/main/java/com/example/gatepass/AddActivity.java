package com.example.gatepass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7;
    String getName,getRoll,getPurpose,getDatein,getDateout,getDep,getYear;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);


        et1=(EditText) findViewById(R.id.name);
        et2=(EditText) findViewById(R.id.rollno);
        et3=(EditText) findViewById(R.id.department);
        et4=(EditText) findViewById(R.id.year);
        et5=(EditText) findViewById(R.id.purpose);
        et6=(EditText) findViewById(R.id.dateout);
        et7=(EditText) findViewById(R.id.datein);

        b1=(Button) findViewById(R.id.submit);
        b2=(Button) findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=et1.getText().toString();
                getRoll=et2.getText().toString();
                getDep=et3.getText().toString();
                getYear=et4.getText().toString();
                getPurpose=et5.getText().toString();
                getDateout=et6.getText().toString();
                getDatein=et7.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getRoll+" "+getDep+" "+getYear+" "+getPurpose+" "+getDateout+" "+getDateout,Toast.LENGTH_LONG).show();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });


    }
}