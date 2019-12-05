package com.example.wishmytrip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.Adapter.CruiseAdapter;
import com.example.wishmytrip.POJO.Cruise;

import java.util.ArrayList;
import java.util.List;


public class cruiseFragment extends Fragment {

    RecyclerView recyclerView;
    CruiseAdapter adapter;
    List<Cruise> cruiseList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_searchresult, container, false);

        cruiseList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 6;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        cruiseList.add(
                new Cruise(
                        1,
                        "Royal Carrabiean",
                        "4-5/nights",
                        200,
                        R.drawable.c1));

        cruiseList.add(
                new Cruise(
                        1,
                        "Royal Knights",
                        "6-7/nights",
                        350,
                        R.drawable.c2));

        cruiseList.add(
                new Cruise(
                        1,
                        "Casino Royal",
                        "2-3/nights",
                        450,
                        R.drawable.c3));
        cruiseList.add(
                new Cruise(
                        1,
                        "Canada Line",
                        "3-4/nights",
                        200,
                        R.drawable.c4));
        cruiseList.add(
                new Cruise(
                        1,
                        "Alaska Dekux",
                        "2-3/nights",
                        150,
                        R.drawable.c5));
        cruiseList.add(
                new Cruise(
                        1,
                        "Mexico mars",
                        "10-12/nights",
                        1200,
                        R.drawable.c5));

        //creating recyclerview adapter
        CruiseAdapter adapter = new CruiseAdapter(getActivity().getApplicationContext(), cruiseList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return view;
    }


}

