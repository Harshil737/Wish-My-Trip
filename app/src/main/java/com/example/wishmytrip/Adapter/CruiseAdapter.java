package com.example.wishmytrip.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.POJO.Cruise;
import com.example.wishmytrip.R;

import java.util.List;

public class CruiseAdapter extends RecyclerView.Adapter<CruiseAdapter.CruiseViewHolder> {

    private Context mctx;
    private List<Cruise> cruiseList;
    private onDestinationItemClicked clickListener;

    public CruiseAdapter(Context mctx, List<Cruise> cruiseList) {
        this.mctx = mctx;
        this.cruiseList = cruiseList;
    }

    public void setClickListener(onDestinationItemClicked clickListener) {
        this.clickListener = clickListener;
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
    public void onBindViewHolder(@NonNull CruiseViewHolder holder, final int position) {
        Cruise cruise = cruiseList.get(position);
        holder.textViewTitle.setText(cruise.getTitle());
        holder.textViewDesc.setText(cruise.getDesc());
        holder.textViewPrice.setText(String.valueOf(cruise.getPrice()));
        holder.imageView.setImageDrawable(mctx.getResources().getDrawable(R.drawable.c1, null));

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cruise cruise = new Cruise(cruiseList.get(position).getId(), cruiseList.get(position).getTitle(), cruiseList.get(position).getDesc(), cruiseList.get(position).getDeparting_port(), cruiseList.get(position).getReturn_port(), cruiseList.get(position).getItinerary(), cruiseList.get(position).getImageURL1(), cruiseList.get(position).getImageURL2(), cruiseList.get(position).getImageURL3(), cruiseList.get(position).getPrice(), cruiseList.get(position).getDeparts(), cruiseList.get(position).getReturns(), cruiseList.get(position).getNights());
                clickListener.onDestinationClicked(cruise);
            }
        });
    }

    public interface onDestinationItemClicked {
        void onDestinationClicked(Cruise cruise);
    }

    @Override
    public int getItemCount() {
        return cruiseList.size();
    }

    class CruiseViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewPrice;
        LinearLayout layout;

        public CruiseViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.list_item1);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
