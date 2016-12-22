package com.example.queenabergen.a1221exam;

/**
 * Created by queenabergen on 12/21/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("animals")
    @Expose
    private List<Animal> animals = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

}


