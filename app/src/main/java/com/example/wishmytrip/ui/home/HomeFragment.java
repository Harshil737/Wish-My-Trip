package com.example.wishmytrip.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.Adapter.AdapterDestinations;
import com.example.wishmytrip.CruiseDetails;
import com.example.wishmytrip.POJO.Destination;
import com.example.wishmytrip.R;

import java.util.ArrayList;
import java.util.Objects;

public class HomeFragment extends Fragment implements AdapterDestinations.onDestinationItemClicked {

    private HomeViewModel homeViewModel;
    private ArrayList<Destination> listDestinations = new ArrayList<>();
    private Destination destination;
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle sahvedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
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
        destination = new Destination(1, "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg", "Havasu Falls", "Havasu Falls", 1999.99);
        listDestinations.add(destination);

        destination = new Destination(2, "https://i.redd.it/tpsnoz5bzo501.jpg", "Trondheim", "Havasu Falls", 199.99);
        listDestinations.add(destination);

        destination = new Destination(3, "https://i.redd.it/qn7f9oqu7o501.jpg", "Portugal", "Trondheim", 249.99);
        listDestinations.add(destination);

        destination = new Destination(4, "https://i.redd.it/j6myfqglup501.jpg", "Rocky Mountain National Park", "Trondheim", 5499.99);
        listDestinations.add(destination);

        destination = new Destination(5, "https://i.redd.it/0h2gm1ix6p501.jpg", "Mahahual", "Portugal", 99.99);
        listDestinations.add(destination);

        RecyclerView.LayoutManager layout_manager_new_york = new LinearLayoutManager(Objects.requireNonNull(getActivity()).getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_new_york = root.findViewById(R.id.home_recycler_view_new_york);
        AdapterDestinations adapterDestinations = new AdapterDestinations(getActivity().getApplicationContext(), listDestinations);
        recycler_view_new_york.setLayoutManager(layout_manager_new_york);
        recycler_view_new_york.setAdapter(adapterDestinations);
        adapterDestinations.setClickListener(this);

        RecyclerView.LayoutManager layout_manager_best_scuba = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_best_scuba = root.findViewById(R.id.home_recycler_view_best_scuba);
        AdapterDestinations adapterDestinations1 = new AdapterDestinations(getActivity().getApplicationContext(), listDestinations);
        recycler_view_best_scuba.setLayoutManager(layout_manager_best_scuba);
        recycler_view_best_scuba.setAdapter(adapterDestinations1);
        adapterDestinations1.setClickListener(this);

        RecyclerView.LayoutManager layout_manager_explore_vancouver = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        RecyclerView recycler_view_explore_vancouver = root.findViewById(R.id.home_recycler_view_explore_vancouver);
        AdapterDestinations adapterDestinations2 = new AdapterDestinations(getActivity().getApplicationContext(), listDestinations);
        recycler_view_explore_vancouver.setLayoutManager(layout_manager_explore_vancouver);
        recycler_view_explore_vancouver.setAdapter(adapterDestinations2);
        adapterDestinations2.setClickListener(this);
    }

    @Override
    public void onDestinationClicked(Destination destination) {
//        Toast.makeText(this.getContext(), destination.getDescription() + "", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getActivity(), CruiseDetails.class);
        startActivity(intent);

//        final FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.nav_host_fragment, new BlankFragment(), "NewFragmentTag");
//        ft.commit();
    }
}