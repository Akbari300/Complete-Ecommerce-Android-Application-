package com.allandroidprojects.ecomsample.options;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.allandroidprojects.ecomsample.R;



public class SearchAdapter  extends RecyclerView.Adapter<SearchAdapter.Holderview>{



    public SearchAdapter()
    {

    }
    @Override
    public Holderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.customitem,parent,false);

        return new Holderview(layout);
    }

    @Override
    public void onBindViewHolder(Holderview holder, final int position) {


    }

    @Override
    public int getItemCount() {
        return 2;
    }



    class Holderview extends RecyclerView.ViewHolder
    {

        Holderview(View itemview)
        {
            super(itemview);


        }
    }

}
