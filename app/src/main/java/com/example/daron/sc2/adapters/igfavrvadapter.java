package com.example.daron.sc2.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.daron.sc2.IgFav;
import com.example.daron.sc2.IgFavFragments;
import com.example.daron.sc2.R;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class igfavrvadapter extends RecyclerView.Adapter<igfavrvadapter.ViewHolder>{

    private static final String TAG = "igfavrvadapter";

    private ArrayList<String> mImageNames;
    private ArrayList<String> mImages;
    private Context mContext;

    public igfavrvadapter(Context context, ArrayList<String> imageNames, ArrayList<String> images ) {
        mImageNames = imageNames;
        mImages = images;
        mContext = context;
          }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_rv_ig, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.contactImage);

        holder.imageName.setText(mImageNames.get(position));


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();


            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView contactImage;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            contactImage = itemView.findViewById(R.id.contactImage);
            imageName = itemView.findViewById(R.id.contactName);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

        public interface OnNoteListener{
            void onNoteClick(int position);
        }
    }

    public void updateList (List<String> newList)
    {
        mImageNames = new ArrayList<>();
        mImageNames.addAll (newList);
        notifyDataSetChanged();
    }



}