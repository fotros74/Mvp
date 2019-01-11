package com.example.mustafa.mvp.mvp.model;

public class Item {

    private String mString;
    private Integer mInteger;

    public Item(String string, Integer integer) {
        mString = string;
        mInteger = integer;
    }

    public String getQuText(){
        return mString;
    }

    public Integer getAnswer(){
        return mInteger;
    }

    public void setInteger(Integer integer) {
        mInteger = integer;
    }
}
