package com.guigarage.sdk.form;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.text.TextAlignment;

import java.util.List;

public class EditorFormRow implements FormRow {

    private Label label;
    private Node button;
    private Node editor;

    private FormEditor formEditor;

    public EditorFormRow(String labelText, EditorType editorType) {
        this.editor = createEditor(editorType);
        this.label = createLabel(labelText, editor);
        label.disableProperty().bind(editor.disableProperty());
        label.visibleProperty().bind(editor.visibleProperty());

        StringProperty nameProperty = new SimpleStringProperty();
        nameProperty.addListener(e -> label.setText(nameProperty.get() + ":"));

        formEditor = new FormEditor(editor.disableProperty(), nameProperty, editor.visibleProperty());
    }
  /*  public EditorFormRow(String labelText, EditorType editorType, String buttonName) {
        this.editor = createEditor(editorType);
        this.button  = new Button(buttonName);
        this.label = createLabel(labelText, editor);

        /*label.disableProperty().bind(editor.disableProperty());
        label.visibleProperty().bind(editor.visibleProperty());

        StringProperty nameProperty = new SimpleStringProperty();
        nameProperty.addListener(e -> label.setText(nameProperty.get() + ":"));

        formEditor = new FormEditor(editor.disableProperty(), nameProperty, editor.visibleProperty());*/
    /*}*/
    private Node createEditor(EditorType editorType) {
        if(editorType.equals(EditorType.TEXTFIELD)) {
            TextField textField= new TextField();

            return textField;
        }
        if(editorType.equals(EditorType.TEXTAREA)) {
            return new TextArea();
        }
        if(editorType.equals(EditorType.CHECKBOX)) {
            return new CheckBox();
        }
        if(editorType.equals(EditorType.COMBOBOX)) {
            ObservableList<String> options =
                    FXCollections.observableArrayList(
                            "Games",
                            "Parse",
                            "Health",
                            "Communication",
                            "Social",
                            "Media",
                            "Location",
                            "Finance",
                            "Tasks",
                            "Weather",
                            "News"
                    );
            final ComboBox comboBox = new ComboBox(options);
            comboBox.setValue("Finance");
            return comboBox;
        }
        if(editorType.equals(EditorType.LIST)) {
            return new ListView<>();
        }if(editorType.equals(EditorType.SPLITMENU)){
            SplitMenuButton splitMenuButton = new SplitMenuButton();
            return splitMenuButton;
        }
        return null;
    }

    private Label createLabel(String text, Node editor) {
        return createLabel(new SimpleStringProperty(text), editor);
    }

    private Label createLabel(StringProperty text, Node editor) {
        Label label = new Label();
        label.getStyleClass().add("form-label");
        text.addListener(e -> label.setText(text.get() + ":"));
        label.setText(text.get() + ":");
        label.setTextAlignment(TextAlignment.RIGHT);
        label.setAlignment(Pos.BASELINE_RIGHT);
        if(editor instanceof TextArea) {
            label.setAlignment(Pos.TOP_RIGHT);
        }
        label.setLabelFor(editor);
        return label;
    }

    @Override
    public double getPrefLabelWidth() {
        return label.prefWidth(-1);
    }

    @Override
    public double layoutInParent(double startX, double startY, double width, double labelWidth, double rowSpacing, double columnSpacing) {
        if (label.isVisible()) {
            double editorWidth = width - columnSpacing - labelWidth;

            double labelHeight = label.prefHeight(labelWidth);
            double editorHeight = editor.prefHeight(editorWidth);
            double height = Math.max(labelHeight, editorHeight);

            label.relocate(startX, startY);
            label.resize(labelWidth, height);

            editor.relocate(label.getLayoutX() + label.getWidth() + columnSpacing, startY);
            editor.resize(editorWidth, height);

            return startY + Math.max(label.getHeight(), editor.getLayoutBounds().getHeight()) + rowSpacing;
        } else {
            return startY;
        }
    }

    @Override
    public List<Node> getNodes() {
            return FXCollections.observableArrayList(label, editor);

    }

    public Label getLabel() {
        return label;
    }

    public Node getEditor() {
        return editor;
    }

    public FormEditor getFormEditor() {
        return formEditor;
    }
}
