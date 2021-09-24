package com.hackathon.aerospacecart.aerocart.models;

import java.util.List;

public class Products {
    private String id;
    private String currencyFormat;
    private String currencyId;
    private String description;
    private String installments;
    private String isFreeShipping;
    private String price;
    private String style;
    private String title;
    private List<String> availableTypes;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCurrencyFormat() {
        return currencyFormat;
    }
    public void setCurrencyFormat(String currencyFormat) {
        this.currencyFormat = currencyFormat;
    }
    public String getCurrencyId() {
        return currencyId;
    }
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getInstallments() {
        return installments;
    }
    public void setInstallments(String installments) {
        this.installments = installments;
    }
    public String getIsFreeShipping() {
        return isFreeShipping;
    }
    public void setIsFreeShipping(String isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<String> getAvailableTypes() {
        return availableTypes;
    }
    public void setAvailableTypes(List<String> availableTypes) {
        this.availableTypes = availableTypes;
    }
    
}
