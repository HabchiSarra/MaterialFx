package com.guigarage.sdk.list;

import com.guigarage.sdk.util.DetailedMedia;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

/**
 * Created by Sarra on 20/06/2016.
 */
public class DetailedMediaList<T extends DetailedMedia> extends ListView<T> {

    public DetailedMediaList() {
        setCellFactory(DetailedSimpleMediaListCell.createDefaultCallback());
    }

    public DetailedMediaList(ObservableList<T> items) {
        super(items);
        setCellFactory(DetailedSimpleMediaListCell.createDefaultCallback());
    }
}
