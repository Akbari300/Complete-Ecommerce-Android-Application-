package com.allandroidprojects.ecomsample.options;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.product.ItemDetailsActivity;
import com.allandroidprojects.ecomsample.startup.Item;

import java.util.ArrayList;
import java.util.List;


public class SearchAdapter  extends RecyclerView.Adapter<SearchAdapter.Holderview>{

    // for itemdetails activity
    public static final String STRING_IMAGE_URI = "ImageUri";
    public static final String STRING_IMAGE_POSITION = "ImagePosition";
    // end of that.

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


        final String name = productlist.get(position).getItemName();
        final String price = productlist.get(position).getItemPrice();
        final String desc = productlist.get(position).getItemDesc();


        holder.linearLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(context, ItemDetailsActivity.class);
                intent.putExtra(STRING_IMAGE_URI, productlist.get(position).getItemImageUrl());
                intent.putExtra(STRING_IMAGE_POSITION, position);
                intent.putExtra("name", name);
                intent.putExtra("price", price);
                intent.putExtra("desc", desc);


                context.startActivity(intent);

            }

        });


    }// end of method onBindViewHolder


    @Override
    public int getItemCount() {
        return productlist.size();
    }// end of method getItemCount;


    // method to filter;
    public void setFilter(List<Item> items)
    {
        productlist = new ArrayList<>();
        productlist.addAll(items);
        notifyDataSetChanged();
    }// end of method setFilter





    // HolderView Class Declaration
    class Holderview extends RecyclerView.ViewHolder
    {

        ImageView itemImage;
        TextView itemName;
        TextView itemDesc;
        TextView itemPrice;
        LinearLayout linearLayout;

        Holderview(View itemview)
        {
            super(itemview);

            itemImage = (ImageView) itemview.findViewById(R.id.search_image);
            itemName = (TextView) itemview.findViewById(R.id.search_name);
            itemDesc = (TextView) itemview.findViewById(R.id.search_desc);
            itemPrice = (TextView) itemview.findViewById(R.id.search_price);
            linearLayout = (LinearLayout) itemview.findViewById(R.id.Search_layout);
        }
    }// end of class HolderView

}
