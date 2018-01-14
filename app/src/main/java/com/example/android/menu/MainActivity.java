package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView item1 = (TextView) findViewById(R.id.menu_item_1);
        String logThis1 = "Item 1: " + item1.getText();
        Log.i("EnterpriseActivity.java", logThis1);

        // Find second menu item TextView and print the text to the logs
        TextView item2 = (TextView) findViewById(R.id.menu_item_2);
        String logThis2 = "Item 2: " + item2.getText();
        Log.i("EnterpriseActivity.java", logThis2);

        // Find third menu item TextView and print the text to the logs
        TextView item3 = (TextView) findViewById(R.id.menu_item_3);
        String logThis3 = "Item 3: " + item3.getText();
        Log.i("EnterpriseActivity.java", logThis3);
    }
}