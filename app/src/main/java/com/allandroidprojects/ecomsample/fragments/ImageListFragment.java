/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.allandroidprojects.ecomsample.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.allandroidprojects.ecomsample.startup.*;
import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.product.ItemDetailsActivity;
import com.allandroidprojects.ecomsample.startup.MainActivity;
import com.allandroidprojects.ecomsample.utility.ImageUrlUtils;
import com.facebook.drawee.view.SimpleDraweeView;


import java.util.List;


public class ImageListFragment extends Fragment {

    public static final String STRING_IMAGE_URI = "ImageUri";
    public static final String STRING_IMAGE_POSITION = "ImagePosition";
    private static MainActivity mActivity;


    public static  SuperClass details;
    public static List<Word> productlist;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(R.layout.layout_recylerview_list, container, false);

        // call setuprecycleView
        setupRecyclerView(rv);
        return rv;
    }

    private void setupRecyclerView(RecyclerView recyclerView) {

        String[] items=null;

        if (ImageListFragment.this.getArguments().getInt("type") == 1){
            items =ImageUrlUtils.getOffersUrls();
            details = new Offer();
            productlist = details.getOffers();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 2){
            items =ImageUrlUtils.getElectronicsUrls();
            details = new Electonic();
            productlist = details.getOffers();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 3){
            items =ImageUrlUtils.getLifeStyleUrls();
            details = new LifeStyle();
            productlist = details.getOffers();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 4){
            items =ImageUrlUtils.getHomeApplianceUrls();
            details = new Home();
            productlist = details.getOffers();

        }else if (ImageListFragment.this.getArguments().getInt("type") == 5){
            items =ImageUrlUtils.getBooksUrls();
            details = new Book();
            productlist = details.getOffers();

        }else {
            items = ImageUrlUtils.getImageUrls();
            details = new More();
            productlist = details.getOffers();

        }
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new SimpleStringRecyclerViewAdapter(recyclerView, items, productlist));
    }



    // adapter to be changed.
    public static class SimpleStringRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {

        private String[] mValues;
        private RecyclerView mRecyclerView;
        private List<Word> productdetials;

        // class viewholder of android;
        public static class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final SimpleDraweeView mImageView;
            public final LinearLayout mLayoutItem;
            public final ImageView mImageViewWishlist;
            public final TextView textView;
            public final TextView textViewDesc;
            public final TextView textViewPrice;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mImageView = (SimpleDraweeView) view.findViewById(R.id.image1);
                mLayoutItem = (LinearLayout) view.findViewById(R.id.layout_item);
                mImageViewWishlist = (ImageView) view.findViewById(R.id.ic_wishlist);
                textView = (TextView) view.findViewById(R.id.list_item_name);
                textViewDesc = (TextView) view.findViewById(R.id.list_item_Desc);
                textViewPrice = (TextView) view.findViewById(R.id.list_item_price);

            }
        }

        public SimpleStringRecyclerViewAdapter(RecyclerView recyclerView, String[] items, List<Word> products) {
            mValues = items;
            mRecyclerView = recyclerView;
            productdetials = products;
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
            return new ViewHolder(view);
        }



        @Override
        public void onViewRecycled(ViewHolder holder) {
            if (holder.mImageView.getController() != null) {
                holder.mImageView.getController().onDetach();
            }
            if (holder.mImageView.getTopLevelDrawable() != null) {
                holder.mImageView.getTopLevelDrawable().setCallback(null);
//                ((BitmapDrawable) holder.mImageView.getTopLevelDrawable()).getBitmap().recycle();
            }
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {


            final Uri uri = Uri.parse(mValues[position]);
            holder.mImageView.setImageURI(uri);
            holder.textView.setText(productdetials.get(position).getWordName());
            holder.textViewDesc.setText(productdetials.get(position).getWordDesc());
            holder.textViewPrice.setText(productdetials.get(position).getWordPrice());


            final String name = productdetials.get(position).getWordName();
            final String price = productdetials.get(position).getWordPrice();
            final String desc = productdetials.get(position).getWordDesc();




            holder.mLayoutItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mActivity, ItemDetailsActivity.class);
                    intent.putExtra(STRING_IMAGE_URI, mValues[position]);
                    intent.putExtra(STRING_IMAGE_POSITION, position);
                    intent.putExtra("name", name);
                    intent.putExtra("price", price);
                    intent.putExtra("desc", desc);

                    mActivity.startActivity(intent);

                }
            });

            //Set click action for wishlist
            holder.mImageViewWishlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                    imageUrlUtils.addWishlistImageUri(mValues[position]);

                    Word word = new Word();
                    word.SetWishList(productdetials.get(position));
                    holder.mImageViewWishlist.setImageResource(R.drawable.ic_favorite_black_18dp);
                    notifyDataSetChanged();
                    Toast.makeText(mActivity,"Item added to Wishlist.",Toast.LENGTH_SHORT).show();

                }
            });

        }

        @Override
        public int getItemCount() {
            return mValues.length;
        }
    }
}
