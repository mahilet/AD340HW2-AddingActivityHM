package com.mahiltletdan.ad340hw2_addingactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;



//additional imported classes
import android.content.Intent;
import android.widget.TextView;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;

public class detailActivity extends AppCompatActivity {
    private static final String TAG= detailActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String receivedSate=   intent.getStringExtra(MainActivity.MESSAGE_TO_PASS);
        // Capture the layout's TextView and set the string as its text
        TextView myReceiver =(TextView) findViewById(R.id.receiver);
        //create a new TextView object
        myReceiver.setText("Your submitted state is: " + receivedSate);
        //append state name with TextView static text
        //myReceiver.append(receivedSate);
        //set the textview text font monospace and style bold italic
        myReceiver.setTypeface(Typeface.MONOSPACE,Typeface.BOLD_ITALIC);
        //set the textview text size 30dip
        myReceiver.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
        //set the textview text color
        myReceiver.setTextColor(Color.RED);

        //set the new activity content to newly created textview
//        setContentView(tv);







        //myReceiver.setText(message);
        Log.d(TAG, "onCreate()");

    }



    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()");
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }
}
