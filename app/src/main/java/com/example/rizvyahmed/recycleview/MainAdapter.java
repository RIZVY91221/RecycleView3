package com.example.rizvyahmed.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<String> mDataSet;
    public MainAdapter(ArrayList<String> mDataSet) {
        this.mDataSet = mDataSet;
    }


    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.mImageView.setImageResource(R.mipmap.ic_launcher);
        holder.mTextView.setText(mDataSet.get(position));

        }

    @Override
    public int getItemCount() {

        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            mImageView=(ImageView) itemView.findViewById(R.id.imageView);
            mTextView=(TextView)itemView.findViewById(R.id.textView);
        }
    }
}
