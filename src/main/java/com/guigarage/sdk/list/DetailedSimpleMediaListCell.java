package com.guigarage.sdk.list;

import com.guigarage.sdk.demos.SimpleViewAppDemo1;
import com.guigarage.sdk.util.DetailedMedia;
import com.guigarage.sdk.util.Media;
import com.guigarage.sdk.util.RoundImageView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.util.Callback;

public class DetailedSimpleMediaListCell<T extends DetailedMedia> extends DetailedMediaListCell<T> {

  //  private RoundImageView imageView;

    public DetailedSimpleMediaListCell() {
     //   imageView = new RoundImageView();
      //  setLeftContent(imageView);
        getStyleClass().add("simple-media-cell");
        itemProperty().addListener(e -> {
            titleProperty().unbind();
            descriptionProperty().unbind();
        //    imageView.imageProperty().unbind();
            if(getItem() != null) {
                titleProperty().bind(getItem().titleProperty());
                descriptionProperty().bind(getItem().descriptionProperty());
                categoryProperty().bind(getItem().categoryProperty()) ;
                keyProperty().bind(getItem().keyProperty());
                //imageView.imageProperty().bind(getItem().imageProperty());
            }
        });
    }



    public static <T extends DetailedMedia> Callback<ListView<T>, ListCell<T>> createDefaultCallback() {
        return v -> new DetailedSimpleMediaListCell<>();
    }
}
