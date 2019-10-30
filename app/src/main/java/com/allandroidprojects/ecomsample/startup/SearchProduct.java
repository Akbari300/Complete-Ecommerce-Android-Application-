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
        productList.add(new Item("Bass Guitar", "Classical guitar  type of chordophone, traditionally constructed from wood and strung", "152.8",
        R.drawable.offer_quitar, "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg"));

        productList.add(new Item("Study Glasses", "Peter Jones Anti-Reflective Round Unisex Sunglasses - (NA90|48|White Color Lens)", "320.8",
                R.drawable.offer_glasses, "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg"));

        productList.add(new Item("Wall Clock","Density Collection Digital Clocks Battery Powered Led 7 Colors Changing Night Light Star Sky Digital Led", "80.8",
                R.drawable.offer_clock, "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg"));


        productList.add(new Item("Sewing Machine", "Brother Sewing Machine, XM2701, Lightweight Sewing Machine with 27 Stitches", "431.8",
                R.drawable.offer_sewing_machine, "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg"));

        productList.add(new Item("White Lamp","Modernluci Wall Sconce LED Wall Light Modern Plug in Bedroom Lamp Dark Grey", "91.8",
                R.drawable.offer_lump, "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg"));

        productList.add(new Item("Camera", "Kodak PIXPRO Astro Zoom AZ401-BK 16MP Digital Camera with 40X Optical Zoom and 3 LCD (Black)", "720.8",
                R.drawable.offer_camera, "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg"));


        // Electronics

        productList.add(new Item("Desktop Computer", "New Apple iMac (27-inch Retina 5k display, 3.1GHz 6-core 8th-generation Intel", "630.8",
                R.drawable.electronic_desktop_computer, "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg"));

        productList.add(new Item("Samsung Phone", "Samsung Galaxy S10+ Plus G975F GSM Unlocked Smartphone Renewed)  Prism White 128GB", "487.8",
                R.drawable.electornic_samsung_phone, "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg"));


        productList.add(new Item("Screen player", "Large Swivel Screen, 6 Hrs Long Lasting Built-in Battery, Region Free, Stereo Sound,", "200.8",
                R.drawable.electronic_screen_player, "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg"));



        // LIfeStyle
        productList.add(new Item("Red Party Dress", "VETIOR Women's Long Sleeve Scoop Neck Casual Flared Midi Swing Dress", "21.8",
                R.drawable.lifestyle_red_dress, "https://static.pexels.com/photos/169047/pexels-photo-169047-medium.jpeg"));

        productList.add(new Item("Spring Outdoor cloth", "Floerns Women's Summer Chiffon Sleeveless Party Dress has sleeveless"," 25.8",
                R.drawable.lifestyle_spring_white_dress, "https://static.pexels.com/photos/160826/girl-dress-bounce-nature-160826-medium.jpeg"));

        productList.add(new Item("Black Bow Tie", "Mens Classic Pre-Tied Satin FormalTuxedo Bowtie Adjustable Length Large", "8.8",
                R.drawable.lifestyle_black_bow_tie, "https://static.pexels.com/photos/1702/bow-tie-businessman-fashion-man-medium.jpg"));


        //Home Appliances
        productList.add(new Item("Double White Bed", "Regalo HideAway Double Sided Bed Rail Guard, with Reinforced Anchor Safety System pillow", "39.99",
                R.drawable.home_double_bed, "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg"));

        productList.add(new Item("Drawing Art", "Abstract Mountain in Daytime Canvas Prints Wall Art Paintings Abstract Geometry Wall", "25.90",
                R.drawable.home_drawing_art, "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg"));

        productList.add(new Item("Sofa pillows", "Bikuer Printed Dark Blue Sofa Cover Stretch Couch Cover Sofa Slipcovers Couch", "31.99",
                R.drawable.home_sofa_pillow, "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg"));





        //Book

        productList.add(new Item("Zeru One", "Notes on Startups, or How to Build the Future: Peter Thiel (Author), Blake Masters (Author)",  "1.8",
                R.drawable.book_happy, "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg"));

        productList.add(new Item("Diary Notebook", "Great Niche Ideas for No Content and Low Content Books: Work from Home and Make Money Online", "13.0",
                R.drawable.book_diary_notebook, "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg"));

        productList.add(new Item("Holly books", "Duet (A Genetically Modified Novel Book 2) Electromagnetic pulses began a catastrophe changed", "17.3",
                R.drawable.home_holy_books, "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg"));



        // more
        productList.add(new Item("Clutcher", "Parcelona French PLUME Small Brown Shell and Black Set of 2 Celluloid Tortoise Jaw Hair Claw Clip Clamp", "10",
                R.drawable.more_clutcher, "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg"));

        productList.add(new Item("Kitchen Stuff", "Organic Bamboo Cooking Serving Utensil Set By Neet - 6 Piece Set | Spoon & Spatula Mix | Utensil Holder", "16.95",
                R.drawable.more_cooking_stuff, "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg"));


    }// end of constructor




    public List<Item> getProductList(){
        return productList;
    }

}
