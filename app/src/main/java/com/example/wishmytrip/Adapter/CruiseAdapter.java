package com.example.wishmytrip.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.POJO.Cruise;
import com.example.wishmytrip.R;

import java.util.List;

public class CruiseAdapter extends RecyclerView.Adapter<CruiseAdapter.CruiseViewHolder> {

    private Context mctx;
    private List<Cruise> cruiseList;

    public CruiseAdapter(Context mctx, List<Cruise> cruiseList) {
        this.mctx = mctx;
        this.cruiseList = cruiseList;
    }

    @NonNull
    @Override
    public CruiseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mctx);
        View view = inflater.inflate(R.layout.list_layout, null);
        CruiseViewHolder holder = new CruiseViewHolder(view);
        return new CruiseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CruiseViewHolder holder, int position) {
        Cruise cruise = cruiseList.get(position);
        holder.textViewTitle.setText(cruise.getTitle());
        holder.textViewDesc.setText(cruise.getDesc());
        holder.textViewPrice.setText(String.valueOf(cruise.getPrice()));
        holder.imageView.setImageDrawable(mctx.getResources().getDrawable(R.drawable.c1, null));
    }

    @Override
    public int getItemCount() {
        return cruiseList.size();
    }

    class CruiseViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewPrice;

        public CruiseViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
