package com.allandroidprojects.ecomsample.options;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

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

        recyclerView = (RecyclerView) findViewById(R.id.listshow);
        recyclerView.setHasFixedSize(true);

        productitems = products.getProductList();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new SearchAdapter(productitems, SearchResultActivity.this);
        recyclerView.setAdapter(adapter);


    }// end of onCreateMethod


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);

        MenuItem searchItem = menu.getItem(0);

        final MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) myActionMenuItem.getActionView();

        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));
        searchView.setFocusable(true);

        searchItem.expandActionView();


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (!searchView.isIconified()) {
                    searchView.setIconified(true);
                }
                myActionMenuItem.collapseActionView();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                    // code here

                final List<Item> filterlist = listFilter(productitems, newText);
                adapter.setFilter(filterlist);

                return true;
            }
        });



        return true;
    }// end of method onCreateOptionMenu;



    // filter listMethod;

    private List<Item> listFilter(List<Item> list, String query)
    {
        query = query.toLowerCase();
        final List<Item> filterModeList = new ArrayList<>();

        for(Item item: list)
        {
            final String text = item.getItemName().toLowerCase();

            if(text.startsWith(query))
            {
                filterModeList.add(item);
            }
        }// end of for


        return filterModeList;

    }// end of method filter;









}// end of class;
