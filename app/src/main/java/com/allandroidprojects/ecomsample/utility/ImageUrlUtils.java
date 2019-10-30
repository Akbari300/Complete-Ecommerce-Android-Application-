package com.allandroidprojects.ecomsample.utility;

import java.util.ArrayList;

/**
 * Created by 06peng on 2015/6/24.
 */
public class ImageUrlUtils {
    static ArrayList<String> wishlistImageUri = new ArrayList<>();
    static ArrayList<String> cartListImageUri = new ArrayList<>();

    public static String[] getImageUrls() {
        String[] urls = new String[] {
                "https://static.pexels.com/photos/5854/sea-woman-legs-water-medium.jpg",
                "https://static.pexels.com/photos/6245/kitchen-cooking-interior-decor-medium.jpg"

        };
        return urls;
    }

    public static String[] getOffersUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg"

        };
        return urls;
    }

    public static String[] getHomeApplianceUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/189293/pexels-photo-189293-medium.jpeg",
                "https://static.pexels.com/photos/4703/inside-apartment-design-home-medium.jpg",
                "https://static.pexels.com/photos/133919/pexels-photo-133919-medium.jpeg"

        };
        return urls;
    }

    public static String[] getElectronicsUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/204611/pexels-photo-204611-medium.jpeg",
                "https://static.pexels.com/photos/214487/pexels-photo-214487-medium.jpeg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg"


        };
        return urls;
    }

    public static String[] getLifeStyleUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/169047/pexels-photo-169047-medium.jpeg",
                "https://static.pexels.com/photos/160826/girl-dress-bounce-nature-160826-medium.jpeg",
                "https://static.pexels.com/photos/1702/bow-tie-businessman-fashion-man-medium.jpg"
        };
        return urls;
    }

    public static String[] getBooksUrls() {
        String[] urls = new String[]{
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/33283/stack-of-books-vintage-books-book-books-medium.jpg",

        };
        return urls;
    }

    // Methods for Wishlist
    public void addWishlistImageUri(String wishlistImageUri) {
        this.wishlistImageUri.add(0,wishlistImageUri);
    }

    public void removeWishlistImageUri(int position) {
        this.wishlistImageUri.remove(position);
    }

    public ArrayList<String> getWishlistImageUri(){ return this.wishlistImageUri; }

    // Methods for Cart
    public void addCartListImageUri(String wishlistImageUri) {
        this.cartListImageUri.add(0,wishlistImageUri);
    }

    public void removeCartListImageUri(int position) {
        this.cartListImageUri.remove(position);
    }

    public ArrayList<String> getCartListImageUri(){ return this.cartListImageUri; }
}
