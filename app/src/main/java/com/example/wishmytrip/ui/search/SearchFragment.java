package com.example.wishmytrip.ui.search;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.wishmytrip.R;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static android.R.layout.simple_spinner_item;

public class SearchFragment extends Fragment implements DatePickerDialog.OnDateSetListener {

    private SearchViewModel galleryViewModel;
    private TextView frmDate;
    private Spinner cruiseShip, cruiseLine,priceRange,from,too;
    private Button btnSearch;
    //final TextView frmDate=findViewById(R.id.txtFromDate);

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(SearchViewModel.class);
        View root = inflater.inflate(R.layout.fragment_search, container, false);
        final TextView textView = root.findViewById(R.id.text_Too);
        final ImageView dt1 = root.findViewById(R.id.btnFromDate);
         frmDate=root.findViewById(R.id.txtFromDate);
        cruiseLine = root.findViewById(R.id.txt_CruiseLine);
        cruiseShip=root.findViewById(R.id.txt_CruiseShip);
        priceRange=root.findViewById(R.id.txt_PriceRange);
        too=root.findViewById(R.id.txtToo);
        from=root.findViewById(R.id.txtFrom);
        btnSearch=root.findViewById(R.id.btn_Search);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(textView.getText());
            }
        });
      /*  dt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                showDateP();
                return false;
            }


        });*/

        dt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateP();
            }
        });
        addItemsOnSpinner2();

        addListenerOnSpinnerItemSelection();

        btnSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "OnClickListener : " +
                                "\nFrom : "+ String.valueOf(from.getSelectedItem()) +
                                "\nTo : "+ String.valueOf(too.getSelectedItem())+
                                "\nDate : "+ String.valueOf(frmDate.getText()) +
                                "\nShip : "+ String.valueOf(cruiseShip.getSelectedItem())+
                                "\nLine : "+ String.valueOf(cruiseLine.getSelectedItem()) +
                                "\nShip : "+ String.valueOf(cruiseShip.getSelectedItem())+
                                "\nRange : "+ String.valueOf(priceRange.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    private void showDateP(){
        DatePickerDialog datePickerDialog=new DatePickerDialog(
                getContext(),this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        String date=day+"/"+month+"/"+year;
        Toast.makeText(getActivity().getApplicationContext(),date,Toast.LENGTH_SHORT).show();

        frmDate.setText(date);

    }

    public void addItemsOnSpinner2() {

        List<String> fromlist = new ArrayList<String>();
        fromlist.add("Toronto");
        fromlist.add("NewYork");
        fromlist.add("Norway");
        ArrayAdapter<String> dataAdapterfromlist = new ArrayAdapter<String>(getActivity().getApplicationContext()
                , simple_spinner_item,fromlist);
        dataAdapterfromlist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        from.setAdapter(dataAdapterfromlist);


        List<String> toolist = new ArrayList<String>();
        toolist.add("Amsterdam");
        toolist.add("Venice");
        toolist.add("Paris");
        ArrayAdapter<String> dataAdaptertoolist = new ArrayAdapter<String>(getActivity().getApplicationContext()
                , simple_spinner_item,toolist);
        dataAdaptertoolist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        too.setAdapter(dataAdaptertoolist);


        List<String> linelist = new ArrayList<String>();
        linelist.add("ABC");
        linelist.add("XYZ");
        linelist.add("PQR");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity().getApplicationContext()
                 , simple_spinner_item,linelist);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cruiseLine.setAdapter(dataAdapter);


        List<String> cruiseshiplist = new ArrayList<String>();
        cruiseshiplist.add("Royal");
        cruiseshiplist.add("Diamond");
        cruiseshiplist.add("Platinum");
        ArrayAdapter<String> dataAdaptercruiseshiplist = new ArrayAdapter<String>(getActivity().getApplicationContext()
                , simple_spinner_item,cruiseshiplist);
        dataAdaptercruiseshiplist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cruiseShip.setAdapter(dataAdaptercruiseshiplist);


        List<String> pricerangelist = new ArrayList<String>();
        pricerangelist.add("500-1000");
        pricerangelist.add("1000-1500");
        pricerangelist.add("1500-2000");
        ArrayAdapter<String> dataAdapterpricerangelist = new ArrayAdapter<String>(getActivity().getApplicationContext()
                , simple_spinner_item,pricerangelist);
        dataAdapterpricerangelist.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        priceRange.setAdapter(dataAdapterpricerangelist);

    }

    public void addListenerOnSpinnerItemSelection() {

        cruiseLine.setOnItemSelectedListener(new CustomOnItemSelectedListener());

    }




}