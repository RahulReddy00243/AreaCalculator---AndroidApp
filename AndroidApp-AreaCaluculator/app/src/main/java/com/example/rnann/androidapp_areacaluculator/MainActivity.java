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
    Button circle;
    Button rectangle;
    Button clear;

    // Done With Declaration!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        //Programmatically accessing the elements via their id located in R file!!

        lengthOneValueEditText = (EditText) findViewById(R.id.Length1EditText);
        lengthTwoValueEditText = (EditText) findViewById(R.id.Length2EditText);

        resultValueTextView = (TextView) findViewById(R.id.AreaResultTextView);

        triangle = (Button) findViewById(R.id.ButtonTriangle);
        square = (Button) findViewById(R.id.ButtonSquare);
         circle= (Button) findViewById(R.id.ButtonCircle);
        rectangle = (Button) findViewById(R.id.ButtonRectangle);
        clear = (Button) findViewById(R.id.ButtonClearAll);

        // Done with Accessing!!



    }
}
