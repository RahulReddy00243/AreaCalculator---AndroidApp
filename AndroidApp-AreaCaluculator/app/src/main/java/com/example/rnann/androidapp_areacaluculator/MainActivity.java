package com.example.rnann.androidapp_areacaluculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaring the view variables globally -> to make life easier

    EditText lengthOneValueEditText;
    EditText lengthTwoValueEditText;

    TextView resultValueTextView;

    Button triangle;
    Button square;
    Button circle;
    Button rectangle;
    Button clear;

    String length1;
    String length2;

    // Done With Declaration!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        //Programmatically accessing the elements via their id located in R file

        lengthOneValueEditText = (EditText) findViewById(R.id.Length1EditText);
        lengthTwoValueEditText = (EditText) findViewById(R.id.Length2EditText);

        resultValueTextView = (TextView) findViewById(R.id.AreaResultTextView);

        triangle = (Button) findViewById(R.id.ButtonTriangle);
        square = (Button) findViewById(R.id.ButtonSquare);
         circle= (Button) findViewById(R.id.ButtonCircle);
        rectangle = (Button) findViewById(R.id.ButtonRectangle);
        clear = (Button) findViewById(R.id.ButtonClearAll);

        // Done with Accessing!!


        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reading the input length values

                length1 = lengthOneValueEditText.getText().toString();
                length2 = lengthTwoValueEditText.getText().toString();

                //Done reading Input values entered by the User!!


                //printing the values read to logcat to check functioning of the App

                Log.d("rahul","length1 is :"+length1);
                Log.d("rahul","length2 is :"+length2);

                // Done checking, Values got printed  in the LogCat!!



            }
        });





    }
}
