package com.allandroidprojects.ecomsample.startup;

public class Word {

    private String name;
    private String desc;
    private String price;

    public Word(String name, String desc, String price)
    {

        this.name = name;
        this.desc = desc;
        this.price = price;

    }

    public void setWordName(String name) {
        this.name = name;
    }

    public void setWordDesc(String desc) {
        this.desc = desc;
    }

    public void setWordPrice(String price) {
        this.price = price;
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
