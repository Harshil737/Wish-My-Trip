package com.example.wishmytrip.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.Adapter.AdapterCruise;
import com.example.wishmytrip.CruiseDetails;
import com.example.wishmytrip.POJO.Cruise;
import com.example.wishmytrip.POJO.Destination;
import com.example.wishmytrip.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class HomeFragment extends Fragment implements AdapterCruise.onDestinationItemClicked {

    private HomeViewModel homeViewModel;
    private ArrayList<Cruise> listDestinations = new ArrayList<>();
    private Destination destination;
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle sahvedInstanceState) {

        root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        initView();
        return root;
    }

    private void initView() {
        Cruise cruise = new Cruise(
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
                5);

        Cruise cruise1 = new Cruise(
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
                5);

        Cruise cruise2 = new Cruise(
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
                5);

        listDestinations.add(cruise);
        listDestinations.add(cruise1);
        listDestinations.add(cruise2);

        RecyclerView.LayoutManager layout_manager_new_york = new LinearLayoutManager(Objects.requireNonNull(getActivity()).getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_new_york = root.findViewById(R.id.home_recycler_view_new_york);
        AdapterCruise adapterDestinations = new AdapterCruise(getActivity().getApplicationContext(), listDestinations);
        recycler_view_new_york.setLayoutManager(layout_manager_new_york);
        recycler_view_new_york.setAdapter(adapterDestinations);
        adapterDestinations.setClickListener(this);

        RecyclerView.LayoutManager layout_manager_best_scuba = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_best_scuba = root.findViewById(R.id.home_recycler_view_best_scuba);
        AdapterCruise adapterDestinations1 = new AdapterCruise(getActivity().getApplicationContext(), listDestinations);
        recycler_view_best_scuba.setLayoutManager(layout_manager_best_scuba);
        recycler_view_best_scuba.setAdapter(adapterDestinations1);
        adapterDestinations1.setClickListener(this);

        RecyclerView.LayoutManager layout_manager_explore_vancouver = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_explore_vancouver = root.findViewById(R.id.home_recycler_view_explore_vancouver);
        AdapterCruise adapterDestinations2 = new AdapterCruise(getActivity().getApplicationContext(), listDestinations);
        recycler_view_explore_vancouver.setLayoutManager(layout_manager_explore_vancouver);
        recycler_view_explore_vancouver.setAdapter(adapterDestinations2);
        adapterDestinations2.setClickListener(this);
    }

    @Override
    public void onDestinationClicked(Cruise cruise) {
        Intent intent = new Intent(getActivity(), CruiseDetails.class);
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