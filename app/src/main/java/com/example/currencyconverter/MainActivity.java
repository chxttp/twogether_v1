package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("chat:","hello github");
    }

    public void convertFunction(View view){

        Log.i("Info", "Convert button pressed!!");
        EditText currencyEditText = (EditText) findViewById(R.id.currencyEditText);

        double moneyPound = Double.parseDouble(currencyEditText.getText().toString()); // covert from String to double
        double moneyDollar = moneyPound * 1.3; // calculate (make it to Dollars)

        String moneyPoundText = String.valueOf(moneyPound);
        String moneyDollarText = String.valueOf(moneyDollar); // decimal point vary on its value (this line is better)
//        String moneyDollarText = String.format("%.2f", moneyDollar); // 2 decimal points or can require any decimal points

        Toast.makeText(this, "£" + moneyPoundText + " is $" + moneyDollarText, Toast.LENGTH_SHORT).show();
        // ***need to show old value





    }


}//kuy nt
///jhjhjj