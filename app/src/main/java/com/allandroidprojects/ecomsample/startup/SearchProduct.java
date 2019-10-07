package com.allandroidprojects.ecomsample.startup;

import java.util.ArrayList;
import java.util.List;

import com.allandroidprojects.ecomsample.R;

public class SearchProduct {

    public final List<Item> productList;

    public SearchProduct()
    {

        productList = new ArrayList<>();

        //offer products;
        productList.add(new Item("Bass Guitar", " alot of the Description here", "12.8",
        R.drawable.offer_quitar, "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg"));

        productList.add(new Item("Study Glasses", "alot of the Description here should be added", "13.8",
                R.drawable.offer_glasses, "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg"));

        productList.add(new Item("Wall Clock","alot of the Description here should be added", "20.8",
                R.drawable.offer_clock, "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg"));


        productList.add(new Item("Sewing Machine", "alot of the Description here should be added", "18.8",
                R.drawable.offer_sewing_machine, "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg"));

        productList.add(new Item("White Lamp","alot of the Description here should be added", "31.8",
                R.drawable.offer_lump, "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg"));

        productList.add(new Item("Camera", "alot of the Description here should be added", "30.8",
                R.drawable.offer_camera, "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg"));


        // Electronics

        productList.add(new Item("Desktop Computer", "alot of the Description here should be added", "12.8",
                R.drawable.electronic_desktop_computer, "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg"));

        productList.add(new Item("Samsung Phone", "alot of the Description here should be added", "13.8",
                R.drawable.electornic_samsung_phone, "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg"));


        productList.add(new Item("Screen player", "alot of the Description here should be added", "18.8",
                R.drawable.electronic_screen_player, "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg"));



        // LIfeStyle
        productList.add(new Item("Red Dress", " alot of the Description here should be added", "13.8",
                R.drawable.lifestyle_red_dress, "https://static.pexels.com/photos/169047/pexels-photo-169047-medium.jpeg"));

        productList.add(new Item("Spring Outdoor Dress", "alot of the Description here should be added"," 20.8",
                R.drawable.lifestyle_spring_white_dress, "https://static.pexels.com/photos/160826/girl-dress-bounce-nature-160826-medium.jpeg"));

        productList.add(new Item("Black Bow Tie", "alot of the Description here should be added", "18.8",
                R.drawable.lifestyle_black_bow_tie, "https://static.pexels.com/photos/1702/bow-tie-businessman-fashion-man-medium.jpg"));


        //Home Appliances
        productList.add(new Item("Double White Bed", " alot of the Description here should be added", "13.8",
                R.drawable.home_double_bed, "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg"));

        productList.add(new Item("Drawing Art", "alot of the Description here should be added", "20.8",
                R.drawable.home_drawing_art, "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg"));

        productList.add(new Item("Sofa with 3 pillows", "alot of the Description here should be added", "18.8",
                R.drawable.home_sofa_pillow, "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg"));





        //Book

        productList.add(new Item("Happy", "alot of the Description here should be added",  "12.8",
                R.drawable.book_happy, "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg"));

        productList.add(new Item("Diary Notebook", "alot of the Description here should be added", "20.8",
                R.drawable.book_diary_notebook, "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg"));

        productList.add(new Item("Holly books", "alot of the Description here should be added", "18.8",
                R.drawable.home_holy_books, "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg"));



        // more
        productList.add(new Item("Clutcher", "alot of the Description here should be added", "14.0",
                R.drawable.more_clutcher, "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg"));

        productList.add(new Item("Kitchen Stuff", "alot of the Description here should be added", "19.0",
                R.drawable.more_cooking_stuff, "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg"));


    }// end of constructor




    public List<Item> getProductList(){
        return productList;
    }

}
