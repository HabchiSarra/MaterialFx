package com.guigarage.sdk.util;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class DetailedDefaultMedia implements  DetailedMedia{

    private StringProperty title;

    private  StringProperty category;
    private StringProperty key;
    private StringProperty description;

  /*  public DetailedDefaultMedia() {
        this(null, null, (Image)null);
    }

    public DetailedDefaultMedia(String title) {
        this(title, null, (Image)null);
    }

    public DetailedDefaultMedia(String title, String description) {
        this(title, description, (Image)null);
    }*/
/*
    public DetailedDefaultMedia(String title, String category, String key, String descr) {
        this(title, null, image);
    }
*/
    public DetailedDefaultMedia(String title, String description) {
        this(title, description, null,null);
    }

    public DetailedDefaultMedia(String title, String description, String category, String key) {
        this.title = new SimpleStringProperty(title);
        this.description = new SimpleStringProperty(description);
        this.category= new SimpleStringProperty(category);
        this.key= new SimpleStringProperty(key);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }


    public String getCategory() {
        return category.get();
    }

    public StringProperty categoryProperty() {
        return category;
    }

    public void setCategory(String category) {
        this.category.set(category);
    }

    public String getKey() {
        return key.get();
    }

    public StringProperty keyProperty() {
        return key;
    }

    public void setKey(String key) {
        this.key.set(key);
    }

    public StringProperty titleProperty() {
        return title;
    }


    public StringProperty descriptionProperty() {
        return description;
    }

}
