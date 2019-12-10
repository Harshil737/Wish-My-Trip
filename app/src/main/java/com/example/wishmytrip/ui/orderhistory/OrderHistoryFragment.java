package com.example.wishmytrip.ui.orderhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.R;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryFragment extends Fragment {

    private OrderHistoryViewModel orderHistoryViewModel;
    RecyclerView recyclerView;
    OrderAdapter adapter;
    ArrayList<Order> cruiseList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        orderHistoryViewModel =
                ViewModelProviders.of(this).get(OrderHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_order_history, container, false);

        cruiseList = new ArrayList<>();
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        cruiseList.add(
                new Order(
                        "https://images.softvoyage.com/cruises/275x175/ship/331/ship.jpg",
                        "22/05/19",
                        "Royal",
                        "Diamond",
                        "1000"));


        cruiseList.add(
                new Order(
                        "",
                        "22/05/19",
                        "Royal",
                        "Diamond",
                        "1000"));

        cruiseList.add(
                new Order(
                        "",
                        "22/05/19",
                        "Royal",
                        "Diamond",
                        "1000"));
        cruiseList.add(
                new Order(
                        "",
                        "22/05/19",
                        "Royal",
                        "Diamond",
                        "1000"));


        //creating recyclerview adapter
        OrderAdapter adapter = new OrderAdapter(getActivity().getApplicationContext(), cruiseList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        return root;
    }
}