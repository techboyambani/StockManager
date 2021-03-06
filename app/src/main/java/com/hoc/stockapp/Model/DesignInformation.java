package com.hoc.stockapp.Model;

public class DesignInformation  {
    public String name;
    public String quantity;
    public String company;
    public String size;
    public String description;

    public DesignInformation(){

    }

    public DesignInformation(String name, String quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public DesignInformation(String name, String quantity, String company, String size) {
        this.name = name;
        this.quantity = quantity;
        this.company = company;
        this.size = size;
    }

    public DesignInformation(String name, String quantity, String company, String size, String description) {
        this.name = name;
        this.quantity = quantity;
        this.company = company;
        this.size = size;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCompany(){
        return company;
    }
    public void setComapny(String company) {
        this.company = company;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() { return size; }

    public void setDescription() { this.description = description; }
    public String getDescription() { return description; }


}
