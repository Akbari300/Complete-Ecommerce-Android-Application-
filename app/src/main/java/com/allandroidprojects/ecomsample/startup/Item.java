package com.allandroidprojects.ecomsample.startup;

public class Item {

    private String name;
    private String desc;
    private String price;
    private int image;
    private String imageUrl;

    public Item(String name, String desc, String price, int imageid, String url)
    {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = imageid;
        this.imageUrl = url;
    }

    // getter methods
    public String getItemName() {
        return name;
    }

    public String getItemDesc() {
        return desc;
    }

    public String getItemPrice() {
        return price;
    }

    public int getItemImage() {
        return image;
    }

    public String getItemImageUrl() {
        return imageUrl;
    }



    // setter methods

    public void setItemName(String name) {
        this.name = name;
    }

    public void setItemDesc(String desc) {
        this.desc = desc;
    }

    public void setItemPrice(String price) {
        this.price = price;
    }

    public void setItemImage(int image) {
        this.image = image;
    }

    public void setItemImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
