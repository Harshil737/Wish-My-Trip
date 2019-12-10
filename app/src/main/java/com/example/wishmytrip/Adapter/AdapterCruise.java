package com.example.wishmytrip.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.wishmytrip.CustomizedLinearLayout;
import com.example.wishmytrip.POJO.Cruise;
import com.example.wishmytrip.R;

import java.util.ArrayList;

public class AdapterCruise extends RecyclerView.Adapter<AdapterCruise.ViewHolder> {

    private ArrayList<Cruise> destinationsList;
    private Context context;
    private onDestinationItemClicked clickListener;

    public AdapterCruise(Context context, ArrayList<Cruise> destinationsList) {
        this.destinationsList = destinationsList;
        this.context = context;
    }

    public void setClickListener(onDestinationItemClicked clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterCruise.ViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .fitCenter()
                .load(destinationsList.get(position).getImageURL1())
                .into(holder.im_main);

        holder.tv_title.setText(destinationsList.get(position).getTitle());
        holder.tv_description.setText(destinationsList.get(position).getReturn_port());
        holder.tv_price.setText(destinationsList.get(position).getPrice() + "");
        holder.iv_fav.setTag(R.drawable.ic_fav_no);

        holder.iv_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((Integer) holder.iv_fav.getTag() == R.drawable.ic_fav_no) {
                    holder.iv_fav.setTag(R.drawable.ic_fav_yes);
                    holder.iv_fav.setImageResource(R.drawable.ic_fav_yes);
                } else {
                    holder.iv_fav.setImageResource(R.drawable.ic_fav_no);
                    holder.iv_fav.setTag(R.drawable.ic_fav_no);
                }
            }
        });

        holder.ll_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, destinationsList.get(position).getTitle(), Toast.LENGTH_LONG).show();
                Cruise cruise = new Cruise(destinationsList.get(position).getId(), destinationsList.get(position).getTitle(), destinationsList.get(position).getDesc(), destinationsList.get(position).getDeparting_port(), destinationsList.get(position).getReturn_port(), destinationsList.get(position).getItinerary(), destinationsList.get(position).getImageURL1(), destinationsList.get(position).getImageURL2(), destinationsList.get(position).getImageURL3(), destinationsList.get(position).getPrice(), destinationsList.get(position).getDeparts(), destinationsList.get(position).getReturns(), destinationsList.get(position).getNights());
                clickListener.onDestinationClicked(cruise);
            }
        });
    }

    @Override
    public int getItemCount() {
        return destinationsList.size();
    }

    public interface onDestinationItemClicked {
        void onDestinationClicked(Cruise cruise);
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView im_main, iv_fav;
        TextView tv_title, tv_price, tv_description;
        CustomizedLinearLayout ll_parent;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            im_main = itemView.findViewById(R.id.rv_item_iv_main);
            iv_fav = itemView.findViewById(R.id.item_fav);
            tv_title = itemView.findViewById(R.id.rv_item_tv_title);
            tv_description = itemView.findViewById(R.id.rv_item_tv_description);
            tv_price = itemView.findViewById(R.id.rv_item_tv_price);
            ll_parent = itemView.findViewById(R.id.rv_parent_item);
        }
    }
}
