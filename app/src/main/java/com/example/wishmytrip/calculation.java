package com.example.wishmytrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class calculation extends AppCompatActivity {
    private TextView tprice;
    private TextView tax;
    private TextView dtotal,finaltotal,trip_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

        Intent i=getIntent();
        double price=i.getDoubleExtra("Price",0);
        tprice=findViewById(R.id.cPrice);
        tax=findViewById(R.id.tax);
        dtotal=findViewById(R.id.total);
        finaltotal=findViewById(R.id.final_total);
        trip_total=findViewById(R.id.trip_total_value);
        tprice.setText(price+"");
        double taxes=price*0.13;
        tax.setText(taxes+"");
        double total=price+taxes;
        finaltotal.setText(total+"");
        trip_total.setText(total+"");
        dtotal.setText(total+"");



    }
}
