package com.kube.ecommers.model.Product;

import com.google.gson.annotations.SerializedName;

public class ProductJV {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String product_name;
    @SerializedName("price")
    private String product_price;
    @SerializedName("currency")
    private String product_currency;
    @SerializedName("image")
    private String product_image_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public String getProduct_currency() {
        return product_currency;
    }

    public void setProduct_currency(String product_currency) {
        this.product_currency = product_currency;
    }

    public String getProduct_image_url() {
        return product_image_url;
    }

    public void setProduct_image_url(String product_image_url) {
        this.product_image_url = product_image_url;
    }
}
