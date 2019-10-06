package com.allandroidprojects.ecomsample.startup;


import java.util.ArrayList;

public class Word {

    private String name;
    private String desc;
    private String price;

    static ArrayList<Word> wishlist = new ArrayList<>();
    static ArrayList<Word> MyCard = new ArrayList<>();

    public Word(String name, String desc, String price)
    {

        this.name = name;
        this.desc = desc;
        this.price = price;

    }

    public Word()
    {
        name = null;
        desc = null;
        price = null;
    }

    public void SetWishList(Word word)
    {
        this.wishlist.add(0, word);

    }

    public ArrayList<Word> getMyCard(){return wishlist;}

    public void removeMyCard(int position)
    {
        wishlist.remove(position);
    }


    public void SetMyCard(Word word)
    {
        this.wishlist.add(0, word);

    }


    public ArrayList<Word> getWishlist(){return wishlist;}

    public void removeWishList(int position)
    {
        wishlist.remove(position);
    }


    public String getWordName() {
        return name;
    }

    public String getWordDesc() {
        return desc;
    }

    public String getWordPrice() {
        return price;
    }

}
