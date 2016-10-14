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

    double  length1;
    double  length2;

    double area;

    String result;

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


        //When 'Area Of Triangle' Button is Clicked We catch the Click via Handlers
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reading the input length values

                //(lengthOneValueEditText.getText().toString()) gets the input value as string and thus we are parsing string to double

                length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                length2 = Double.parseDouble(lengthTwoValueEditText.getText().toString());

                //Done reading Input values entered by the User!!


                //printing the values read to logcat to check functioning of the App

                Log.d("rahul","length1 is :"+length1);
                Log.d("rahul","length2 is :"+length2);

                // Done checking, Values got printed  in the LogCat!!

                //Calculating the area
                area = 0.5*length1*length2;
                Log.d("rahul","triangle area is :"+area);

               //converting area from double to string -> to display the result as text on the result Text View
                result = Double.toString(area);


                resultValueTextView.setText(result);

                //Calculated area and printed it on the Area Result Text View!!

            }
        });

        //When 'Area Of square' Button is Clicked We catch the Click via Handlers

              square.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {

                      //Reading the input length values

                      //(lengthOneValueEditText.getText().toString()) gets the input value as string and thus we are parsing string to double

                      length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                      lengthTwoValueEditText.setText("");

                      //Done reading Input values entered by the User!!


                      //printing the values read to logcat to check functioning of the App

                      Log.d("rahul","length1 is :"+length1);
                      Log.d("rahul","length2 is :"+length2);

                      // Done checking, Values got printed  in the LogCat!!

                      //Calculating the area
                      area = length1*length1;
                      Log.d("rahul","square area is :"+area);

                      //converting area from double to string -> to display the result as text on the result Text View
                      result = Double.toString(area);


                      resultValueTextView.setText(result);

                      //Calculated area and printed it on the Area Result Text View!!

                  }
              });

        //When 'Area Of circle' Button is Clicked We catch the Click via Handlers

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Reading the input length values

                //(lengthOneValueEditText.getText().toString()) gets the input value as string and thus we are parsing string to double

                length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                lengthTwoValueEditText.setText("");

                //Done reading Input values entered by the User!!


                //printing the values read to logcat to check functioning of the App

                Log.d("rahul","length1 is :"+length1);
                Log.d("rahul","length2 is :"+length2);

                // Done checking, Values got printed  in the LogCat!!

                //Calculating the area
                area = 3.14*length1*length1;
                Log.d("rahul","circle area is :"+area);

                //converting area from double to string -> to display the result as text on the result Text View
                result = Double.toString(area);


                resultValueTextView.setText(result);

                //Calculated area and printed it on the Area Result Text View!!


            }
        });


        //When 'Area Of Rectangle' Button is Clicked We catch the Click via Handlers

        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Reading the input length values

                //(lengthOneValueEditText.getText().toString()) gets the input value as string and thus we are parsing string to double

                length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                length2 = Double.parseDouble(lengthTwoValueEditText.getText().toString());

                //Done reading Input values entered by the User!!


                //printing the values read to logcat to check functioning of the App

                Log.d("rahul","length1 is :"+length1);
                Log.d("rahul","length2 is :"+length2);

                // Done checking, Values got printed  in the LogCat!!

                //Calculating the area
                area = length1*length2;
                Log.d("rahul","rectangle area is :"+area);

                //converting area from double to string -> to display the result as text on the result Text View
                result = Double.toString(area);


                resultValueTextView.setText(result);

                //Calculated area and printed it on the Area Result Text View!!


            }
        });

    }
}
