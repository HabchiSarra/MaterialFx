package com.guigarage.sdk.list;

import com.guigarage.sdk.demos.SimpleViewAppDemo1;
import com.guigarage.sdk.util.Media;
import com.guigarage.sdk.util.RoundImageView;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.util.Callback;

public class SimpleMediaListCell<T extends Media> extends MediaListCell<T> {

    private RoundImageView imageView;

    public SimpleMediaListCell() {
        //imageView = new RoundImageView();
        //setLeftContent(imageView);
        getStyleClass().add("simple-media-cell");
        itemProperty().addListener(e -> {
            titleProperty().unbind();
            descriptionProperty().unbind();
           // imageView.imageProperty().unbind();
            if(getItem() != null) {
                titleProperty().bind(getItem().titleProperty());
                descriptionProperty().bind(getItem().descriptionProperty());
               // imageView.imageProperty().bind(getItem().imageProperty());
            }
        });
    }
    @Override
     void simpleSelect() {
        MediaList<Media> lv = (MediaList) getListView();
        //  ListView lv = getListView();
        int index = getIndex();
           MultipleSelectionModel sm = lv.getSelectionModel();
          lv.getSelectionModel().clearAndSelect(index);
       // System.out.println(lv.getItems().get(index).titleProperty().getValue());
        SimpleViewAppDemo1.showChooseAntipatterns(lv.getItems().get(index).titleProperty().getValue());
    }

    public static <T extends Media> Callback<ListView<T>, ListCell<T>> createDefaultCallback() {
        return v -> new SimpleMediaListCell<>();
    }
}
