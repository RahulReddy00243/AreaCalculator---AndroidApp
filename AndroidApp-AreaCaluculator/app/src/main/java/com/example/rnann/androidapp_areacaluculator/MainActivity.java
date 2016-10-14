package com.example.rnann.androidapp_areacaluculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring the view variables globally -> to make life easier!!

    EditText lengthOneValueEditText;
    EditText lengthTwoValueEditText;

    TextView resultValueTextView;

    Button triangle;
    Button square;
    Button Circle;
    Button rectangle;
    Button clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        //Programmatically accessing the elements via their id located in R file!!

        lengthOneValueEditText = (EditText) findViewById(R.id.Length1EditText);






    }
}
