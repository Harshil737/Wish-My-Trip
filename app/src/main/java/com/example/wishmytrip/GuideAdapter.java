package com.example.wishmytrip;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wishmytrip.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.CruiseViewHolder> {

    private Context mctx;
    private List<Guide> guideList;

    public GuideAdapter(Context mctx, List<Guide> guideList) {
        this.mctx = mctx;
        this.guideList = guideList;
    }

    @NonNull
    @Override
    public CruiseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mctx);
        View view=inflater.inflate(R.layout.list_layout,null);
        CruiseViewHolder holder=new CruiseViewHolder(view);
        return new CruiseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CruiseViewHolder holder, int position) {
        Guide guide = guideList.get(position);
        holder.textViewTitle.setText(guide.getName());
        holder.textViewDesc.setText(guide.getPhonenno());
        holder.imageView.setImageDrawable(mctx.getResources().getDrawable(guide.getImage(),null));

    }

    @Override
    public int getItemCount() {
        return guideList.size();
    }

    class CruiseViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle,textViewDesc,textViewPrice;

        public CruiseViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewDesc=itemView.findViewById(R.id.textViewShortDesc);

        }
    }
}
