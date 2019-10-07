package com.allandroidprojects.ecomsample.startup;

import java.util.ArrayList;
import java.util.List;

public class SearchProduct {

    public final List<Item> productList;

    public SearchProduct()
    {

        productList = new ArrayList<>();



    }




    public List<Item> getProductList(){
        return productList;
    }

}
