package com.example.wishmytrip;

import android.content.Intent;
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


public class CruiseFragment extends Fragment implements CruiseAdapter.onDestinationItemClicked {

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
//        recyclerView.setHasFixedSize(true);
        int numberOfColumns = 6;

        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        cruiseList.add(
                new Cruise(
                        1,
                        "Costa Cruise Line",
                        "Costa Cruise Line",
                        "Marseille",
                        "Costa Diadema",
                        ";Marseille, France;Savona, Italy;Naples, Italy;Palermo, Italy;Valencia, Spain;Barcelona, Spain;Marseille, France",
                        "https://images.softvoyage.com/cruises/275x175/ship/331/ship.jpg",
                        "https://images.softvoyage.com/cruises/275x175/ship/331/ship.jpg",
                        "https://images.softvoyage.com/cruises/275x175/ship/331/ship.jpg",
                        1809.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE) + 5),
                        5));

        cruiseList.add(
                new Cruise(
                        2,
                        "7 night Alaska Cruise",
                        "7 night Alaska Cruise",
                        "Vancouver, Canada",
                        "Seattle, United States",
                        ";Vancouver, Canada;Skagway, United States;Juneau, United States;Ketchikan, United States;Seattle, United States",
                        "https://d2iq249vnal6zd.cloudfront.net/cb9ca1e180b9e0c6a7d4896479aad8b6.jpeg",
                        "https://d2iq249vnal6zd.cloudfront.net/cb9ca1e180b9e0c6a7d4896479aad8b6.jpeg",
                        "https://d2iq249vnal6zd.cloudfront.net/cb9ca1e180b9e0c6a7d4896479aad8b6.jpeg",
                        959.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE) + 5),
                        5));

        cruiseList.add(
                new Cruise(
                        3,
                        "7 night Middle East Cruise",
                        "7 night Middle East Cruise",
                        "Dubai, United Arab Emirates",
                        "Dubai, United Arab Emirates",
                        ";Dubai, United Arab Emirates;Muscat, Oman;Doha, Qatar;Abu Dhabi, United Arab Emirates;Dubai, United Arab Emirates",
                        "https://d2iq249vnal6zd.cloudfront.net/bdb8bae5b7a26de8ae92cd6241ffcea9004f38dc.jpeg",
                        "https://d2iq249vnal6zd.cloudfront.net/bdb8bae5b7a26de8ae92cd6241ffcea9004f38dc.jpeg",
                        "https://d2iq249vnal6zd.cloudfront.net/bdb8bae5b7a26de8ae92cd6241ffcea9004f38dc.jpeg",
                        1157.99,
                        new Date(Calendar.getInstance().get(Calendar.DATE)),
                        new Date(Calendar.getInstance().get(Calendar.DATE) + 5),
                        5));

        //creating recyclerview adapter
        CruiseAdapter adapter = new CruiseAdapter(this.getContext(), cruiseList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

        return view;
    }


    @Override
    public void onDestinationClicked(Cruise cruise) {
        Intent intent = new Intent(this.getContext(), CruiseDetails.class);
        intent.putExtra("id", cruise.getId());
        intent.putExtra("title", cruise.getTitle());
        intent.putExtra("desc", cruise.getDesc());
        intent.putExtra("departing_port", cruise.getDeparting_port());
        intent.putExtra("return_port", cruise.getReturn_port());
        intent.putExtra("itinerary", cruise.getItinerary());
        intent.putExtra("imageURL1", cruise.getImageURL1());
        intent.putExtra("imageURL2", cruise.getImageURL2());
        intent.putExtra("imageURL3", cruise.getImageURL3());
        intent.putExtra("price", cruise.getPrice());
        intent.putExtra("departs", cruise.getDeparts());
        intent.putExtra("returns", cruise.getReturns());
        intent.putExtra("nights", cruise.getNights());
        startActivity(intent);
    }
}

