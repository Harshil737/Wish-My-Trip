package com.example.wishmytrip;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.wishmytrip.Adapter.ImageSliderAdapter;
import com.example.wishmytrip.POJO.Cruise;
import com.example.wishmytrip.POJO.Destination;
import com.google.android.material.tabs.TabLayout;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CruiseDetails extends AppCompatActivity {

    private ViewPager viewPager;
    private ImageSliderAdapter imageSliderAdapter;
    private TabLayout tabLayout;
    private Destination destination;
    private TextView tv_title, tv_oldPrice, tv_newPrice, tv_ports, tv_itinerary, tv_dates, tv_nights;
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cruise_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final Intent intent = getIntent();

        Date departs = new Date();
        Date returns = new Date();
        departs.setTime(intent.getLongExtra("departs", -1));
        returns.setTime(intent.getLongExtra("returns", -1));

        final Cruise cruise = new Cruise(intent.getIntExtra("id", 0), intent.getStringExtra("title"), intent.getStringExtra("desc"), intent.getStringExtra("departing_port"), intent.getStringExtra("return_port"), intent.getStringExtra("itinerary"), intent.getStringExtra("imageURL1"), intent.getStringExtra("imageURL2"), intent.getStringExtra("imageURL3"), intent.getDoubleExtra("price", 0), departs, returns, intent.getIntExtra("nights", 0));

        tv_title = findViewById(R.id.cruise_tv_name);
        tv_oldPrice = findViewById(R.id.cruise_tv_oldPrice);
        tv_newPrice = findViewById(R.id.cruise_tv_newPrice);
        tv_ports = findViewById(R.id.cruise_tv_ports);
        tv_itinerary = findViewById(R.id.cruise_tv_itinerary);
        tv_dates = findViewById(R.id.cruise_tv_dates);
        tv_nights = findViewById(R.id.cruise_tv_nights);
        bn=findViewById(R.id.cruise_buyNow);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CruiseDetails.this,calculation.class);
                intent.putExtra("Price",cruise.getPrice());
                startActivity(intent);

                            }
        });

        viewPager = findViewById(R.id.cruise_viewPager);
        FragmentManager manager = getSupportFragmentManager();
        imageSliderAdapter = new ImageSliderAdapter(manager, cruise.getImageURL1(), cruise.getImageURL2(), cruise.getImageURL3());
        viewPager.setAdapter(imageSliderAdapter);
        tabLayout = findViewById(R.id.cruise_slider_Tablayout);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(imageSliderAdapter);

        tv_title.setText(cruise.getTitle());
        tv_newPrice.setText(cruise.getPrice() + "");
        tv_oldPrice.setText(cruise.getPrice() + "");
        tv_oldPrice.setPaintFlags(tv_oldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tv_ports.setText("Departing Port: " + cruise.getDeparting_port() + "\n" + "Returning Port: " + cruise.getReturn_port());
        tv_dates.setText("Departing Date: " + cruise.getDeparts() + "\n" + "Returning Date: " + cruise.getReturns());
        String itinerary = cruise.getItinerary();
        itinerary = itinerary.replaceFirst(";", "\u2022 ");
        itinerary = itinerary.replaceAll(";", "\n\u2022 ");
        tv_itinerary.setText(itinerary);
        tv_nights.setText("NIGHTS: " + cruise.getNights());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return true;
    }
}
