package com.allandroidprojects.ecomsample.options;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.startup.Item;

import java.util.List;


public class SearchAdapter  extends RecyclerView.Adapter<SearchAdapter.Holderview>{

    private List<Item> productlist;
    private Context context;

    public SearchAdapter(List<Item> items, Context context)
    {
        productlist = items;
        this.context = context;
    }
    @Override
    public Holderview onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.customitem,parent,false);

        return new Holderview(layout);
    }

    @Override
    public void onBindViewHolder(Holderview holder, final int position) {

        holder.itemImage.setImageResource(productlist.get(position).getItemImage());
        holder.itemName.setText(productlist.get(position).getItemName());
        holder.itemDesc.setText(productlist.get(position).getItemDesc());
        holder.itemPrice.setText("$ "+ productlist.get(position).getItemPrice());


    }// end of method onBindViewHolder


    @Override
    public int getItemCount() {
        return productlist.size();
    }





    // HolderView Class Declaration
    class Holderview extends RecyclerView.ViewHolder
    {

        ImageView itemImage;
        TextView itemName;
        TextView itemDesc;
        TextView itemPrice;

        Holderview(View itemview)
        {
            super(itemview);

            itemImage = (ImageView) itemview.findViewById(R.id.search_image);
            itemName = (TextView) itemview.findViewById(R.id.search_name);
            itemDesc = (TextView) itemview.findViewById(R.id.search_desc);
            itemPrice = (TextView) itemview.findViewById(R.id.search_price);
        }
    }// end of class HolderView

}
