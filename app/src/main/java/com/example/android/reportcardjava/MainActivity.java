package com.example.android.reportcardjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view in the activity_main_xml
        TextView textView = (TextView) findViewById(R.id.text_view);
        // Creating a variable so that we can use the imput parameters
        ReportCardTudor tudorObject = new ReportCardTudor("%s", " %s  ", 7, " %s  ", 8, " %s  ", 6);
        // Creating a constructor so that we can use toString from the ReportCardTudor class
        textView.setText(tudorObject.toString());
    }
}
