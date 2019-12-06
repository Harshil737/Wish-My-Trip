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
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class CruiseFragment extends Fragment {

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
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        cruiseList.add(
                new Cruise(
                        1,
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        cruiseList.add(
                new Cruise(
                        1,
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        cruiseList.add(
                new Cruise(
                        1,
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        cruiseList.add(
                new Cruise(
                        1,
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        cruiseList.add(
                new Cruise(
                        1,
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "WESTERN MEDITERRANEAN Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        "Marseille, France – Savona, Italy – Naples, Italy – Palermo, Italy – Valencia, Spain – Barcelona, Spain – Marseille, France",
                        "afd",
                        "as",
                        "abc",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        5));

        //creating recyclerview adapter
        CruiseAdapter adapter = new CruiseAdapter(getActivity().getApplicationContext(), cruiseList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

        return view;
    }


}

