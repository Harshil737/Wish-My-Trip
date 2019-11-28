package com.example.wishmytrip;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterDestinations extends RecyclerView.Adapter<AdapterDestinations.ViewHolder> {

    private static final String TAG = AdapterDestinations.class.getSimpleName();
    private ArrayList<Destination> destinationsList;
    private Context context;

    public AdapterDestinations(Context context, ArrayList<Destination> list) {
        this.destinationsList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .fitCenter()
                .load(destinationsList.get(position).getImageURL())
                .into(holder.im_main);

        holder.tv_title.setText(destinationsList.get(position).getTitle());
        holder.tv_description.setText(destinationsList.get(position).getDescription());
        holder.tv_price.setText(destinationsList.get(position).getPrice().toString());

        holder.ll_parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, destinationsList.get(position).getTitle(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return destinationsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView im_main;
        TextView tv_title, tv_price, tv_description;
        CustomizedLinearLayout ll_parent;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            im_main = itemView.findViewById(R.id.rv_item_iv_main);
            tv_title = itemView.findViewById(R.id.rv_item_tv_title);
            tv_description = itemView.findViewById(R.id.rv_item_tv_description);
            tv_price = itemView.findViewById(R.id.rv_item_tv_price);
            ll_parent = itemView.findViewById(R.id.rv_parent_item);
        }
    }
}
