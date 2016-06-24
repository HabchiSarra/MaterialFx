package com.guigarage.sdk.util;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

/**
 * Created by Sarra on 20/06/2016.
 */
public interface DetailedMedia {
    StringProperty titleProperty();
    StringProperty descriptionProperty();
    StringProperty categoryProperty();
    StringProperty keyProperty();

}
