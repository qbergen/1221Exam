package com.example.queenabergen.a1221exam;

/**
 * Created by queenabergen on 12/21/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Animal {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("textColor")
    @Expose
    private String textColor;
    @SerializedName("background")
    @Expose
    private String background;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

}
