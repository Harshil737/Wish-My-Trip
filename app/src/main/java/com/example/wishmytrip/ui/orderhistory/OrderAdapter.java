package com.example.wishmytrip.ui.orderhistory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wishmytrip.R;

import java.util.ArrayList;
import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {
    private Context mctx;
    private ArrayList<Order> orderList;

    OrderAdapter(Context mctx, ArrayList<Order> orderList) {
        this.mctx = mctx;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mctx);
        View view=inflater.inflate(R.layout.orderlist_list,null);
        OrderViewHolder holder=new OrderViewHolder(view);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        holder.textViewCruiseShip.setText(orderList.get(position).getCruiseship());
        holder.textViewCruiseLine.setText(orderList.get(position).getCruiseline());
        holder.textViewPrice.setText(String.valueOf(orderList.get(position).getPricerange()));
        holder.textViewDate.setText(String.valueOf(orderList.get(position).getFromdate()));
    }


//    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
//        Order order=orderList.get(position);
//        holder.textViewCruiseShip.setText(order.getCruiseship());
//        holder.textViewCruiseLine.setText(order.getCruiseline());
//        holder.textViewPrice.setText(String.valueOf(order.getPricerange()));
//      //  holder.imageView.setImageDrawable(mctx.getResources().getDrawable(order.getImage(),null));
//
//    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    class OrderViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewDate,textViewCruiseShip,textViewCruiseLine,textViewPrice;



        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textViewCruiseShip=itemView.findViewById(R.id.textViewCruiseShip);
            textViewCruiseLine=itemView.findViewById(R.id.textViewCruiseLine);
            textViewPrice=itemView.findViewById(R.id.textViewPrice);
            textViewDate=itemView.findViewById(R.id.textViewDate);
        }
    }
}
