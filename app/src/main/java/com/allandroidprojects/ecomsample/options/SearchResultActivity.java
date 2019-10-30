package com.allandroidprojects.ecomsample.options;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.widget.Toast;


import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.allandroidprojects.ecomsample.R;
import com.allandroidprojects.ecomsample.startup.Item;
import com.allandroidprojects.ecomsample.startup.SearchProduct;

import java.util.ArrayList;
import java.util.List;

public class SearchResultActivity extends AppCompatActivity {

    SearchView searchView;
    RecyclerView recyclerView;
    SearchAdapter adapter;


    SearchProduct products = new SearchProduct();
    List<Item> productitems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);


            handleIntent(getIntent());
        }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            // Inflate menu to add items to action bar if it is present.
            inflater.inflate(R.menu.search_menu, menu);
            MenuItem searchItem = menu.getItem(0);
            // Associate searchable configuration with the SearchView
            SearchManager searchManager =
                    (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView =
                    (SearchView) menu.findItem(R.id.action_search).getActionView();
            searchView.setSearchableInfo(
                    searchManager.getSearchableInfo(getComponentName()));
            searchView.setFocusable(true);
            searchItem.expandActionView();
            return true;
        }

        @Override
        protected void onNewIntent(Intent intent) {
            handleIntent(intent);
        }

        private void handleIntent(Intent intent) {

            if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
                String query = intent.getStringExtra(SearchManager.QUERY);
                Toast.makeText(SearchResultActivity.this, query, Toast.LENGTH_SHORT).show();
                //use the query to search your data somehow
            }
        }









}// end of class;
