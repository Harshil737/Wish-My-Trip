package com.example.wishmytrip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.Guide;
import com.example.wishmytrip.GuideAdapter;
import com.example.wishmytrip.R;

import java.util.ArrayList;
import java.util.List;

public class demo extends Fragment {

    RecyclerView recyclerView;
    GuideAdapter adapter;
    List<Guide> guideList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_item, container, false);

        guideList = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        guideList.add(
                new Guide(
                        1,
                        "Name: Harsh Thakkar",
                        "ContactInfo: 9978926540",
                        R.drawable.harsh));
        guideList.add(
                new Guide(
                        2,
                        "Name: Harshil Patel",
                        "ContactInfo: 9537778177",
                        R.drawable.harshil));

        guideList.add(
                new Guide(
                        3,
                        "Name: Raj Thakor",
                        "ContactInfo: 9898989898",
                        R.drawable.raj));
        guideList.add(
                new Guide(
                        4,
                        "Name: Keval Shah",
                        "ContactInfo: 99245426654",
                        R.drawable.keval));
        guideList.add(
                new Guide(
                        5,
                        "Name: Zenil Soni",
                        "ContactInfo: 7874963235",
                        R.drawable.zenil));
        guideList.add(
                new Guide(
                        6,
                        "Name: Minal Patel",
                        "ContactInfo: 965432156",
                        R.drawable.zenil));

        //creating recyclerview adapter
        GuideAdapter adapter = new GuideAdapter(getActivity().getApplicationContext(), guideList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return view;
    }

}
