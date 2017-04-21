package com.mahiltletdan.ad340hw2_addingactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //define MESSAGE_TO_PASS String
       public static String MESSAGE_TO_PASS = "com.mahiltletdan.ad340hw2_addingactivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void myMessage(View v){
        //initializing a new Intent
        Intent intent = new Intent(this,detailActivity.class);
        //reference the EditText widget from layout
        EditText myTextView = (EditText)findViewById(R.id.message) ;

        //get user inputted state name
        String state  =  myTextView.getText().toString();

        //pass the state name to another activity
        // Intent can carry data types as key-value pairs called Extras
        intent.putExtra(MESSAGE_TO_PASS, state);
               startActivity(intent);
    }
}

































