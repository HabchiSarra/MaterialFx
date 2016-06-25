package com.guigarage.sdk.demos;

import com.guigarage.sdk.Application;
import com.guigarage.sdk.BDD.*;
import com.guigarage.sdk.action.Action;
import com.guigarage.sdk.chat.ChatTimeline;
import com.guigarage.sdk.chat.DefaultChatMessage;
import com.guigarage.sdk.container.WorkbenchView;
import com.guigarage.sdk.footer.ActionFooter;
import com.guigarage.sdk.form.EditorType;
import com.guigarage.sdk.form.FormLayout;
import com.guigarage.sdk.image.SimpleImageView;
import com.guigarage.sdk.list.DetailedMediaList;
import com.guigarage.sdk.list.MediaList;
import com.guigarage.sdk.overlay.Overlay;
import com.guigarage.sdk.table.MediaTable;
import com.guigarage.sdk.util.*;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.DirectoryChooser;
import org.neo4j.graphdb.*;
import paprika.analyzer.Analyzer;
import paprika.model.PaprikaApp;
import paprika.neo4j.QueryEngine;

import javax.swing.table.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SimpleViewAppDemo1 {

    public static ArrayList<PaprikaApp> paprikaApps;
    public static QueryEngine queryEngine;
    public static BDDFacade bddFacade;
    public static String selectedTitle;
    public static Application app;
    public static boolean modified;

    public static void main(String... args) {
        app = new Application();
        app.setTitle("PAPRIKA iOS");
        app.setBaseColor(Color.rgb(30,160,118));
      //  app.addToolbarItem(new Action(FontAwesomeIcons.VOLUMNE_DOWN, () -> app.animateToolbarToLargeVersion()));
      //  app.addToolbarItem(new Action(FontAwesomeIcons.VOLUMNE_UP, () -> app.animateToolbarToSmallVersion()));
        selectedTitle=null;
        paprikaApps = null;
        modified = false;
        queryEngine = new QueryEngine("C:\\Users\\Sarra\\IdeaProjects\\ObjCParser\\BDD-test");
        bddFacade = new BDDFacade(queryEngine);
        app.setToolbarBackgroundImage(SimpleViewAppDemo1.class.getResource("toolbar-background.png").toExternalForm());
        app.addMenuEntry(new Action(FontAwesomeIcons.PLUS, "Ajouter une application", () -> showAddApp(app)));
        app.addMenuEntry(new Action(FontAwesomeIcons.SEARCH, "Analyser une application", () -> showSearchApp(app)));
        app.addMenuEntry(new Action(FontAwesomeIcons.LISTE, "Analyser le dataset", () -> showChooseAntipatternDataset()));
        app.addMenuEntry(new Action(FontAwesomeIcons.STATS, "Statistiques", () -> showPersonTable(app)));
        app.addMenuEntry(new Action(FontAwesomeIcons.LIST, "Afficher le dataset", () -> showDatasetApps(app)));
        app.addMenuEntry(new Action(FontAwesomeIcons.TRESHOLDS, "Afficher les seuils", () -> showTresholds(app)));
       /* app.addMenuEntry(new Action(FontAwesomeIcons.MAIL, "Toogle App Color", () -> {
            double random = Math.random();
            if(random < 0.1) {
                app.setBaseColor(Color.ORANGE);
            } else if(random < 0.2) {
                app.setBaseColor(Color.DARKORCHID);
            } else if(random < 0.3) {
                app.setBaseColor(Color.DARKRED);
            } else if(random < 0.4) {
                app.setBaseColor(Color.BLUEVIOLET);
            } else if(random < 0.5) {
                app.setBaseColor(Color.BLUE);
            } else if(random < 0.6) {
                app.setBaseColor(Color.PINK);
            } else if(random < 0.7) {
                app.setBaseColor(Color.PURPLE);
            } else if(random < 0.8) {
                app.setBaseColor(Color.GREEN);
            } else if(random < 0.9) {
                app.setBaseColor(Color.DARKGOLDENROD);
            } else {
                app.setBaseColor(Color.DARKTURQUOISE);
            }
        }));*/

        /*
        app.addMenuEntry(new Action(FontAwesomeIcons.MAIL, "Toogle Toolbar Size", () -> {
            if (app.isToolbarLarge()) {
                app.animateToolbarToSmallVersion();
            } else {
                app.animateToolbarToLargeVersion();
            }
        }));
        app.addMenuEntry(new Action(FontAwesomeIcons.MAIL, "Toogle Toolbar Image", () -> {
            if (app.getToolbarBackgroundImage() != null) {
                app.setToolbarBackgroundImage((Image) null);
            } else {
                app.setToolbarBackgroundImage(SimpleViewAppDemo1.class.getResource("toolbar-background.png").toExternalForm());
            }
        }));*/
        //app.setMediaAsMenuHeader(new DefaultMedia("User4711", "Ich bin eine Beschreibung.", SimpleViewAppDemo1.class.getResource("user-13.jpg").toExternalForm()));

        app.setMenuFooter(new Action(FontAwesomeIcons.COGS, "Configuration"));
        showImage(app);

        app.show();
    }

    private static void showAddApp(Application app){
        FormLayout formLayout = new FormLayout();
        formLayout.addHeader("Le chemin de l'application","Introduire le chemin du dossier contenant les fichiers de l'application");
        TextField textField= (TextField) formLayout.addSpecialField("Chemin", EditorType.TEXTFIELD);

        Action action = new Action("Choisir");
        action.setCallback(new Callback() {
            @Override
            public void call() {
                DirectoryChooser directoryChooser = new DirectoryChooser();
                directoryChooser.setTitle("Sélectionner le dossier de l'application");
                File f =directoryChooser.showDialog(app.getStage());
                textField.setText(f.getAbsolutePath());

            }
        });
        formLayout.addActions(action);
        formLayout.addHeader("Les informations");
        TextField name= (TextField) formLayout.addSpecialField("Nom de l'application", EditorType.TEXTFIELD);
        TextField key= (TextField) formLayout.addSpecialField("Clé", EditorType.TEXTFIELD);
        ComboBox category= (ComboBox) formLayout.addSpecialField("Chemin", EditorType.COMBOBOX);
        Action ajouter = new Action("Ajouter");
        ajouter.setCallback(() -> {
                    String path =textField.getText().toString();
                    String appName = name.getText().toString();
                    String appKey = key.getText().toString();
                    String categoryName = category.getValue().toString();
            bddFacade.addApp(path,appName,categoryName,appKey);
            modified=true;
        });
     //   Action annuler = new Action("Annuler", ()->addApplication(app));
        formLayout.addActions(ajouter);//, annuler);
        ScrollPane scrollPane = new ScrollPane();
        formLayout.translateXProperty().bind(scrollPane.widthProperty().subtract(formLayout.widthProperty()).divide(2));
        scrollPane.setContent(formLayout);
      // scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
    }

    public static void showChooseAntipatterns(String appKey){
        FormLayout formLayout = new FormLayout();
        formLayout.addHeader("Les patrons / anti-patrons");
        final ToggleGroup group = new ToggleGroup();

        JFXRadioButton rb1 = new JFXRadioButton("BLOB");

        JFXCheckBox checkBox = new JFXCheckBox("Inclure les instances éventuelles");
        rb1.setUserData("BLOB");
        rb1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        rb1.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb2 = new JFXRadioButton("Long Method");
        rb2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });

        rb2.setUserData("Long Method");
        rb2.setToggleGroup(group);
        rb2.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb3 = new JFXRadioButton("Swiss Army Knife");
        rb3.setUserData("Swiss Army Knife");
        rb3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb3.setToggleGroup(group);
        rb3.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb4 = new JFXRadioButton("Complex Class");
        rb4.setUserData("Complex Class");
        rb4.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb4.setToggleGroup(group);
        rb4.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb5 = new JFXRadioButton("Ignoring Low-Memory Warnings");
        rb5.setUserData("Ignoring Low-Memory Warnings");
        rb5.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb5.setToggleGroup(group);
        rb5.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb6 = new JFXRadioButton("Massive View Controller");
        rb6.setUserData("Massive View Controller");
        rb6.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb6.setToggleGroup(group);
        rb6.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb7 = new JFXRadioButton("Blocking the Main-Thread");
        rb7.setUserData("Blocking the Main-Thread");
        rb7.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb7.setToggleGroup(group);
        rb7.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb8 = new JFXRadioButton("VIPER");
        rb8.setUserData("VIPER");
        rb8.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb8.setToggleGroup(group);
        rb8.setPadding(new Insets(10,10,40,20));

        VBox vBox = new VBox();
     /*   Label label = new Label("Les patrons et anti-patrons");
        label.setPadding(new Insets(40,10,40,50));*/
        Label lblStyle = LabelBuilder.create().text("Le patron / anti-patron à détecter").styleClass("labelStyleClass").build();
        lblStyle.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
    //    root.getChildren().add(lblStyle);
        lblStyle.setPadding(new Insets(40,10,20,0));

        vBox.setPadding(new Insets(10,10,10,100));
        vBox.getChildren().addAll(lblStyle);
        vBox.getChildren().addAll(rb1);
        vBox.getChildren().addAll(rb2);
        vBox.getChildren().addAll(rb3);
        vBox.getChildren().addAll(rb4);
        vBox.getChildren().addAll(rb5);
        vBox.getChildren().addAll(rb6);
        vBox.getChildren().addAll(rb7);
        vBox.getChildren().addAll(rb8);


        vBox.getChildren().addAll(checkBox);

        Button button=new Button("Analyser");
       HBox hBox = new HBox();
        hBox.setPadding(new Insets(30,10,10,200));
        hBox.getChildren().add(button);

    //    button.setPadding(new Insets(20,10,10,200));
     /*   button.setMaxWidth(100);
        button.setPrefWidth(100);
        button.setMinWidth(100);*/
        vBox.getChildren().addAll(hBox);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //Object toggle=group.getSelectedToggle().getUserData();
                String antipatttern = group.getSelectedToggle().getUserData().toString();
                Boolean fuzzy = checkBox.isSelected();
                showAnalysisResults(appKey,antipatttern,fuzzy);
            }
        });

        WorkbenchView view = new WorkbenchView();

        vBox.setMaxWidth(500);
        vBox.setMinWidth(500);
        vBox.setPrefWidth(500);
        ScrollPane scrollPane = new ScrollPane();
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        scrollPane.setContent(vBox);
        // scrollPane.setFitToWidth(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
    }

    private static void showAnalysisResults(String appKey, String antipattern, boolean fuzzy){
        //Send Queries
        if(!fuzzy) {
            ArrayList<SimpleLine> lines;
            lines=bddFacade.detectAntipattern(antipattern, appKey);

            if(lines.size()!=0)
            {
                if(lines.get(0).getClassName().equals("")){

                        showOneColumnTable(lines,antipattern,appKey);

                }else {
                    showTwoColumnsTable(lines,antipattern,appKey);

                }




            }else{
                showOneColumnTable(lines,antipattern,appKey);
            }
        }
        else{
            ArrayList<FuzzyLine> lines;
            lines = bddFacade.detectAntipatternFuzzy(antipattern,appKey);
            if(lines.size()!=0)
            {
                if(lines.get(0).getClassName().equals("")){

                    showFuzzyOneColumnTable(lines,antipattern,appKey);

                }else {
                    showFuzzyTwoColumnsTable(lines,antipattern,appKey);

                }




            }else{
                Label label= LabelBuilder.create().text("Aucune instance de "+antipattern+" dans "+appKey+" détectée.").styleClass("labelStyleClass").build();
                label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
                WorkbenchView view = new WorkbenchView();
                VBox vBox=new VBox();
                vBox.getChildren().add(label);
                vBox.setAlignment(Pos.CENTER);
                //   label.setPadding(new Insets(0,0,0,250));
                view.setCenterNode(vBox);
                vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
                app.setWorkbench(view);
                app.clearGlobalActions();
            }
        }
    }

    private static void showTwoColumnsTable(ArrayList<SimpleLine> lines, String antipattern,String appKey){
        TableView<SimpleLine> table = new TableView<SimpleLine>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Méthode");
        methodCol.setPrefWidth(430);
        TableColumn classCol = new TableColumn("Classe");
        classCol.setPrefWidth(340);
        table.getStyleClass().add("my-table");
        table.setMinWidth(800);
        table.setMaxWidth(1000);
        table.setPrefWidth(820);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(20,0,0,0));

        ObservableList<SimpleLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("className"));
       // applicationCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("appName"));

        table.setItems(observableList);

        table.getColumns().addAll(methodCol, classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées dans "+appKey).styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,25,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();


    }
    private static void showFuzzyOneColumnTable(ArrayList<FuzzyLine> lines, String antipattern,String appKey){
        TableView<FuzzyLine> table = new TableView<>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Classe");
        methodCol.setPrefWidth(300);
        TableColumn classCol = new TableColumn("Probabilité %");
        classCol.setSortType(TableColumn.SortType.DESCENDING);
        classCol.setPrefWidth(200);
        table.getStyleClass().add("my-table");

        table.setMaxWidth(500);
        table.setPrefWidth(500);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(50,0,0,0));

        ObservableList<FuzzyLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("probability"));
        // applicationCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("appName"));

        table.setItems(observableList);

        table.getColumns().addAll(methodCol, classCol);
        table.getSortOrder().add(classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées dans "+appKey).styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,25,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();


    }



    private static void showOneColumnTable(ArrayList<SimpleLine> lines, String antipattern, String appKey){
            if(lines.size()!=0){
            TableView<SimpleLine> table = new TableView<SimpleLine>();
            table.setEditable(false);
            TableColumn methodCol = new TableColumn("Classe");
            methodCol.setPrefWidth(380);
            //  TableColumn classCol = new TableColumn("Classe");
            // classCol.setMinWidth(80);
         //   TableColumn applicationCol = new TableColumn("Application");
         //   applicationCol.setMinWidth(80);
            table.getStyleClass().add("my-table");
            table.setMinWidth(400);
            table.setMaxWidth(400);
            table.setPrefWidth(400);
            ScrollPane scrollPane=new ScrollPane();
            scrollPane.setPadding(new Insets(20,0,0,0));

            ObservableList<SimpleLine> observableList = FXCollections.observableList(lines);
            methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
            //classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("className"));
         //   applicationCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("appName"));

            table.setItems(observableList);

            table.getColumns().addAll(methodCol);
            //System.out.println("pss"+table.getItems());

            VBox vBox=new VBox();
            Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées dans "+appKey).styleClass("labelStyleClass").build();
            label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
            label.setPadding(new Insets(0,0,20,0));
            vBox.getChildren().addAll(label,table);
            vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
            vBox.setAlignment(Pos.CENTER);
            vBox.setMinWidth(400);
            vBox.setMaxWidth(900);
            vBox.setPrefWidth(900);

            scrollPane.setContent(vBox);

            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            WorkbenchView view = new WorkbenchView();
            view.setCenterNode(scrollPane);
            app.setWorkbench(view);
            app.clearGlobalActions();
        }else{
                Label label= LabelBuilder.create().text("Aucune instance de "+antipattern+" dans "+appKey+" détectée.").styleClass("labelStyleClass").build();
                label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
                WorkbenchView view = new WorkbenchView();
                VBox vBox=new VBox();
                vBox.getChildren().add(label);
                vBox.setAlignment(Pos.CENTER);
             //   label.setPadding(new Insets(0,0,0,250));
                view.setCenterNode(vBox);
                vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
                app.setWorkbench(view);
                app.clearGlobalActions();
            }


    }

    private static void showFuzzyTwoColumnsTable(ArrayList<FuzzyLine> lines, String antipattern,String appKey){
        TableView<FuzzyLine> table = new TableView<>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Méthode");
        methodCol.setMinWidth(300);
        TableColumn secCol = new TableColumn("Classe");
        secCol.setMaxWidth(300);
        TableColumn classCol = new TableColumn("Probabilité %");
        classCol.setMinWidth(150);
        classCol.setSortType(TableColumn.SortType.DESCENDING);
        table.getStyleClass().add("my-table");
        table.setMinWidth(750);
        table.setMaxWidth(750);
        table.setPrefWidth(750);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(50,0,0,0));

        ObservableList<FuzzyLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("probability"));
         secCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("className"));

        table.setItems(observableList);

        table.getColumns().addAll(methodCol,secCol, classCol);
        table.getSortOrder().add(classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées dans "+appKey).styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,25,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();


    }

    public static void showTresholds(Application app){
        TableView<TableLine> table = new TableView<TableLine>();
        table.setEditable(false);
        TableColumn metriqueCol = new TableColumn("Métrique");
        metriqueCol.setMinWidth(250);
        TableColumn medianCol = new TableColumn("Médiane");
        medianCol.setMinWidth(80);
        TableColumn q1Col = new TableColumn("Q1");
        q1Col.setMinWidth(80);
        TableColumn q3Col = new TableColumn("Q3");
        q3Col.setMinWidth(80);
        TableColumn seuilCol = new TableColumn("Seuil Haut/Bas");
        seuilCol.setMinWidth(140);
        TableColumn seuilTresHautCol = new TableColumn("Seuil Très Haut/Bas");
        seuilTresHautCol.setMinWidth(190);

        table.getStyleClass().add("my-table");
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(50,0,0,0));

        //Filling the table
        final ObservableList<TableLine> observableList= FXCollections.observableArrayList(
                TableLine.createTableLine("Number Of Classe Lines", bddFacade.calculateNumberofClassLines()),
                TableLine.createTableLine("Class Complexity", bddFacade.calculateClassComplexityQuartile()),
                TableLine.createTableLine("Cyclomatic Complexity", bddFacade.calculateCyclomaticComplexityQuartile()),
                TableLine.createTableLine("Class Complexity", bddFacade.calculateClassComplexityQuartile()),
                TableLine.createTableLine("Cohesion Among Methods", bddFacade.calculateCohesionAmongMethodsOfClass()),
                TableLine.createTableLine("Number Of Method Lines", bddFacade.calculateNumberofMethodLines()),
                TableLine.createTableLine("Number Of Attributes", bddFacade.calculateNumberOfAttributesQuartile()),
                TableLine.createTableLine("Number Of Methods", bddFacade.calculateNumberOfMethodsQuartile()),
                TableLine.createTableLine("Number Of Implemented Interfaces", bddFacade.calculateNumberOfImplementedInterfacesQuartile()),
                TableLine.createTableLine("Number Of Methods In Interface", bddFacade.calculateNumberOfMethodsForInterfacesQuartile())
        );
        metriqueCol.setCellValueFactory(new PropertyValueFactory<TableLine, String>("metricName"));
        medianCol.setCellValueFactory(new PropertyValueFactory<TableLine, Double>("median"));
        q1Col.setCellValueFactory(new PropertyValueFactory<TableLine, Double>("q1"));
        q3Col.setCellValueFactory(new PropertyValueFactory<TableLine, Double>("q3"));
        seuilCol.setCellValueFactory(new PropertyValueFactory<TableLine, Double>("high"));
        seuilTresHautCol.setCellValueFactory(new PropertyValueFactory<TableLine, Double>("veryHigh"));
        table.setItems(observableList);

        table.getColumns().addAll(metriqueCol, medianCol, q1Col, q3Col,seuilCol,seuilTresHautCol);
        //System.out.println("pss"+table.getItems());
        table.translateXProperty().bind(scrollPane.widthProperty().subtract(table.widthProperty()).divide(2));
        scrollPane.setContent(table);

        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
       // app.addGlobalAction(new Action(FontAwesomeIcons.INFO, () -> imageView.toggleOverlayVisibility()));
    }
    private static void showImage(Application app) {
        SimpleImageView imageView = new SimpleImageView();
        imageView.setImage(SimpleViewAppDemo1.class.getResource("pic.jpg").toExternalForm());

        imageView.setOverlay(new Overlay());
        imageView.toggleOverlayVisibility();

        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(imageView);
        app.setWorkbench(view);

        app.clearGlobalActions();
        app.addGlobalAction(new Action(FontAwesomeIcons.INFO, () -> imageView.toggleOverlayVisibility()));
    }

    private static void showDatasetApps(Application app) {
        WorkbenchView view = new WorkbenchView();

        DetailedMediaList<DetailedMedia> list = new DetailedMediaList<>();
        VBox vBox = new VBox();
        HBox hBox=new HBox();
        hBox.getChildren().add(new TextField());
        Button button = new Button("Rechercher");
        hBox.getChildren().add(button);
        hBox.setPadding(new Insets(0,0,30,0));
        hBox.setSpacing(10);
        // list.getItems().add(new DefaultMedia("Test01", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("iOS-app-bw.png").toExternalForm()));
        if(paprikaApps==null||modified)
        {
            paprikaApps= bddFacade.getApps();
        }


        for(PaprikaApp application:paprikaApps){
            list.getItems().add(new DetailedDefaultMedia(application.getName(),"Catégorie: "+ application.getCategory(), "Clé: "+application.getAppKey(), "Nombre de classes: "+application.getNumberOfClasses()));
        }

        hBox.setAlignment(Pos.CENTER);
        list.getStyleClass().add("special-list-view");
        vBox.getChildren().addAll(hBox,list);//,list);
        vBox.setPadding(new Insets(0,0,0,0));
       // hBox.translateXProperty().bind(vBox.widthProperty().subtract(hBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        //vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
        view.setCenterNode(vBox);
        view.setPadding(new Insets(0,0,0,0));
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

       /* ActionFooter footer = new ActionFooter();
        footer.addAction(new Action(FontAwesomeIcons.PHONE, "Call"));
        footer.addAction(new Action(FontAwesomeIcons.MAIL, "Send message", () -> view.setCenterNode(createChatTimeline())));
        footer.setMaxWidth(700);
        footer.setPrefWidth(700);
        view.setFooterNode(footer);*/
        app.setWorkbench(view);
        app.clearGlobalActions();

    }



    private static void showSearchApp(Application app) {
        WorkbenchView view = new WorkbenchView();
        ArrayList<PaprikaApp> searchList;
        MediaList<Media> list = new MediaList<>();
        VBox vBox = new VBox();
        HBox hBox=new HBox();
        TextField textField=new TextField();
        hBox.getChildren().add(textField);
        Button button = new Button("Rechercher");
        hBox.getChildren().add(button);
        hBox.setPadding(new Insets(0,0,50,0));
        hBox.setSpacing(10);
        if(paprikaApps==null|| modified)
        {
            paprikaApps= bddFacade.getApps();
        }
        searchList=paprikaApps;
        for(PaprikaApp application:paprikaApps){
            list.getItems().add(new DefaultMedia(application.getName(),"Catégorie: "+ application.getCategory()));

        }
        hBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(hBox,list);
        vBox.setPrefWidth(500);
        vBox.setMaxWidth(500);
        hBox.translateXProperty().bind(vBox.widthProperty().subtract(hBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
        view.setCenterNode(vBox);

        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            String text=newValue;
            ArrayList<PaprikaApp> searchList1 = new ArrayList<PaprikaApp>();
            for(PaprikaApp application: paprikaApps){
                if(application.getName().toLowerCase().contains(text.toLowerCase())){
                    searchList1.add(application);
                }
            }
            list.getItems().clear();
            for(PaprikaApp application:searchList1){
                list.getItems().add(new DefaultMedia(application.getName(),"Catégorie: "+ application.getCategory()));

            }
        });

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String text=textField.getText().toString();
                ArrayList<PaprikaApp> searchList = new ArrayList<PaprikaApp>();
                for(PaprikaApp application: paprikaApps){
                    if(application.getName().toLowerCase().contains(text.toLowerCase())){
                        searchList.add(application);
                    }
                }
                list.getItems().clear();
                for(PaprikaApp application:searchList){
                    list.getItems().add(new DefaultMedia(application.getName(),"Catégorie: "+ application.getCategory()));

                }

            }


        });

      /* list.setOnMouseClicked( new  EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                int index = list.getEditingIndex();
                System.out.println(list.getItems().get(index).titleProperty().getValue());
                System.out.println("clicked on ");
            }
        });*/

      /*  ActionFooter footer = new ActionFooter();
        footer.addAction(new Action(FontAwesomeIcons.PHONE, "Call"));
        footer.addAction(new Action(FontAwesomeIcons.MAIL, "Send message", () -> view.setCenterNode(createChatTimeline())));
        view.setFooterNode(footer);*/
        app.setWorkbench(view);

        app.clearGlobalActions();

    }

    public static void showPersonTable(Application app) {
        WorkbenchView view = new WorkbenchView();

        MediaTable table = new MediaTable();

        table.getItems().add(new DefaultMedia("Test01", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-01.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test02", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-02.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test03", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-03.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test04", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-04.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test05", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-05.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test06", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-06.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test07", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-07.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test08", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-08.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test09", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-09.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test10", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-10.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test11", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-11.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test12", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-12.jpg").toExternalForm()));
        table.getItems().add(new DefaultMedia("Test13", "Ich bin eine Beschreibung", SimpleViewAppDemo1.class.getResource("user-13.jpg").toExternalForm()));

        view.setCenterNode(table);

        ActionFooter footer = new ActionFooter();
        footer.addAction(new Action(FontAwesomeIcons.PHONE, "Call"));
        footer.addAction(new Action(FontAwesomeIcons.MAIL, "Send message", () -> view.setCenterNode(createChatTimeline())));
        view.setFooterNode(footer);

        app.setWorkbench(view);

        app.clearGlobalActions();
        app.addGlobalAction(new Action(FontAwesomeIcons.VOLUMNE_DOWN));
        app.addGlobalAction(new Action(FontAwesomeIcons.VOLUMNE_UP));
    }

    private static ChatTimeline<DefaultChatMessage> createChatTimeline() {
        ChatTimeline<DefaultChatMessage> timeline = new ChatTimeline<>();
        timeline.getItems().add(new DefaultChatMessage(true, "Hello"));
        timeline.getItems().add(new DefaultChatMessage(false, "How are you"));
        timeline.getItems().add(new DefaultChatMessage(true, "Fine, thanks. Do you want to go to the cinema today?"));
        timeline.getItems().add(new DefaultChatMessage(true, "Or having some drinks?"));
        timeline.getItems().add(new DefaultChatMessage(false, "Oh no, I already have a date this evening with Steve. We want to go to a club. If you want you can come with us."));
        timeline.getItems().add(new DefaultChatMessage(true, "Cool, when do you want to start?"));
        return timeline;
    }



    private static void showChooseAntipatternDataset(){
        final ToggleGroup group = new ToggleGroup();

        JFXRadioButton rb1 = new JFXRadioButton("BLOB");

        JFXCheckBox checkBox = new JFXCheckBox("Inclure les instances éventuelles");
        JFXCheckBox checkBox2 = new JFXCheckBox("Exporter les résultats en CSV");
        rb1.setUserData("BLOB");
        rb1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        rb1.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb2 = new JFXRadioButton("Long Method");
        rb2.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });

        rb2.setUserData("Long Method");
        rb2.setToggleGroup(group);
        rb2.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb3 = new JFXRadioButton("Swiss Army Knife");
        rb3.setUserData("Swiss Army Knife");
        rb3.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb3.setToggleGroup(group);
        rb3.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb4 = new JFXRadioButton("Complex Class");
        rb4.setUserData("Complex Class");
        rb4.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb4.setToggleGroup(group);
        rb4.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb5 = new JFXRadioButton("Ignoring Low-Memory Warnings");
        rb5.setUserData("Ignoring Low-Memory Warnings");
        rb5.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb5.setToggleGroup(group);
        rb5.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb6 = new JFXRadioButton("Massive View Controller");
        rb6.setUserData("Massive View Controller");
        rb6.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(true);
                    // ...
                } else {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                }
            }
        });
        rb6.setToggleGroup(group);
        rb6.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb7 = new JFXRadioButton("Blocking the Main-Thread");
        rb7.setUserData("Blocking the Main-Thread");
        rb7.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb7.setToggleGroup(group);
        rb7.setPadding(new Insets(10,10,10,20));
        JFXRadioButton rb8 = new JFXRadioButton("VIPER");
        rb8.setUserData("VIPER");
        rb8.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) {
                if (isNowSelected) {
                    checkBox.setVisible(false);
                    checkBox.setSelected(false);
                    // ...
                } else {
                    checkBox.setVisible(true);
                    // ...
                }
            }
        });
        rb8.setToggleGroup(group);
        rb8.setPadding(new Insets(10,10,40,20));

        VBox vBox = new VBox();
        Label lblStyle = LabelBuilder.create().text("Le patron / anti-patron à détecter").styleClass("labelStyleClass").build();
        lblStyle.setStyle("-fx-font-size:22; -fx-font-family: 'Museo Slab 500';");

        lblStyle.setPadding(new Insets(25,10,25,0));

        vBox.setPadding(new Insets(10,10,10,100));
        vBox.getChildren().addAll(lblStyle);
        vBox.getChildren().addAll(rb1);
        vBox.getChildren().addAll(rb2);
        vBox.getChildren().addAll(rb3);
        vBox.getChildren().addAll(rb4);
        vBox.getChildren().addAll(rb5);
        vBox.getChildren().addAll(rb6);
        vBox.getChildren().addAll(rb7);
        vBox.getChildren().addAll(rb8);

        VBox vBox1 =new VBox();
        vBox1.getChildren().add(checkBox2);
        vBox1.setPadding(new Insets(20,0,0,0));
        vBox.getChildren().addAll(checkBox, vBox1);

        Button button=new Button("Analyser");
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(30,10,10,200));
        hBox.getChildren().add(button);

        vBox.getChildren().addAll(hBox);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                String antipatttern = group.getSelectedToggle().getUserData().toString();
                boolean fuzzy = checkBox.isSelected();
                boolean csv = checkBox2.isSelected();
                showAnalysisResultsDataset(antipatttern,csv,fuzzy);

            }
        });

        WorkbenchView view = new WorkbenchView();

        vBox.setMaxWidth(500);
        vBox.setMinWidth(500);
        vBox.setPrefWidth(500);
        ScrollPane scrollPane = new ScrollPane();
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
    }


    private static void showAnalysisResultsDataset(String antipattern,boolean csv, boolean fuzzy){
        //Send Queries
        if(!fuzzy) {
            ArrayList<DatasetSimpleLine> lines;
            lines=bddFacade.detectAntipatternDataset(antipattern, csv);

            if(lines.size()!=0)
            {
                if(lines.get(0).getClassName().equals("")){

                    showTwoColumnsDataset(lines,antipattern);

                }else {
                    System.out.println("mido raged");
                   showThreeColumnsDataset(lines,antipattern);

                }




            }else{
                Label label= LabelBuilder.create().text("Aucune instance de "+antipattern+"  détectée.").styleClass("labelStyleClass").build();
                label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
                WorkbenchView view = new WorkbenchView();
                VBox vBox=new VBox();
                vBox.getChildren().add(label);
                vBox.setAlignment(Pos.CENTER);
                //   label.setPadding(new Insets(0,0,0,250));
                view.setCenterNode(vBox);
                vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
                app.setWorkbench(view);
                app.clearGlobalActions();
            }
        }
       else{
            ArrayList<DatasetFuzzyLine> lines;
            lines = bddFacade.detectAntipatternFuzzyDataset(antipattern,csv);
            if(lines.size()!=0)
            {
                if(lines.get(0).getClassName().equals("")){

                    showFuzzyOneColumnTableDataset(lines,antipattern);

                }else {
                    showFuzzyTwoColumnsTableDataset(lines,antipattern);

                }




            }else{
                Label label= LabelBuilder.create().text("Aucune instance de "+antipattern+"  détectée.").styleClass("labelStyleClass").build();
                label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
                WorkbenchView view = new WorkbenchView();
                VBox vBox=new VBox();
                vBox.getChildren().add(label);
                vBox.setAlignment(Pos.CENTER);
                //   label.setPadding(new Insets(0,0,0,250));
                view.setCenterNode(vBox);
                vBox.translateXProperty().bind(view.widthProperty().subtract(vBox.widthProperty()).divide(2));
                app.setWorkbench(view);
                app.clearGlobalActions();
            }
        }
    }

    public static void showTwoColumnsDataset( ArrayList<DatasetSimpleLine> lines, String antipattern) {
        TableView<DatasetSimpleLine> table = new TableView<DatasetSimpleLine>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Classe");
        methodCol.setPrefWidth(300);
        TableColumn classCol = new TableColumn("Application");
        classCol.setPrefWidth(300);
        table.getStyleClass().add("my-table");
        table.setMinWidth(600);
        table.setMaxWidth(600);
        table.setPrefWidth(600);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(20,0,0,0));
        ObservableList<DatasetSimpleLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("applicationName"));
        // applicationCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("appName"));

        table.setItems(observableList);

        table.getColumns().addAll(methodCol, classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées ").styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,13,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();


    }

    public static void showThreeColumnsDataset( ArrayList<DatasetSimpleLine> lines, String antipattern) {
        TableView<DatasetSimpleLine> table = new TableView<DatasetSimpleLine>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Classe");
        methodCol.setMinWidth(350);
        TableColumn classCol = new TableColumn("Application");
        classCol.setMinWidth(200);
        TableColumn applicationCol= new TableColumn("Méthode");
        applicationCol.setMinWidth(350);
        table.getStyleClass().add("my-table");
        table.setMinWidth(800);
        table.setMaxWidth(1000);
        table.setPrefWidth(800);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(20,0,0,0));
        ObservableList<DatasetSimpleLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, String>("applicationName"));
         applicationCol.setCellValueFactory(new PropertyValueFactory<SimpleLine, Double>("className"));

        table.setItems(observableList);

        table.getColumns().addAll(applicationCol, methodCol, classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées ").styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,13,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(1000);
        vBox.setPrefWidth(900);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
    }
    private static void showFuzzyOneColumnTableDataset(ArrayList<DatasetFuzzyLine> lines, String antipattern){
        TableView<DatasetFuzzyLine> table = new TableView<>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Classe");
        methodCol.setPrefWidth(350);
        TableColumn classCol = new TableColumn("Probabilité %");
        classCol.setSortType(TableColumn.SortType.DESCENDING);
        classCol.setPrefWidth(200);
        TableColumn appCol = new TableColumn("Application");
        appCol.setPrefWidth(200);
        table.getStyleClass().add("my-table");
        table.setMinWidth(600);
        table.setMaxWidth(1000);
        table.setPrefWidth(750);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(50,0,0,0));

        ObservableList<DatasetFuzzyLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, String>("probability"));
        appCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, Double>("applicationName"));

        table.setItems(observableList);

        table.getColumns().addAll(methodCol, appCol,classCol);
        table.getSortOrder().add(classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées").styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,25,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();
    }

    private static void showFuzzyTwoColumnsTableDataset(ArrayList<DatasetFuzzyLine> lines, String antipattern){
        TableView<DatasetFuzzyLine> table = new TableView<>();
        table.setEditable(false);
        TableColumn methodCol = new TableColumn("Méthode");
        methodCol.setPrefWidth(300);
        TableColumn secCol = new TableColumn("Classe");
        secCol.setPrefWidth(300);
        TableColumn classCol = new TableColumn("Probabilité %");
        classCol.setPrefWidth(130);
        TableColumn appCol = new TableColumn("Application");
        appCol.setPrefWidth(150);
        classCol.setSortType(TableColumn.SortType.DESCENDING);
        table.getStyleClass().add("my-table");
        table.setMinWidth(900);
        table.setMaxWidth(1100);
        table.setPrefWidth(1100);
        ScrollPane scrollPane=new ScrollPane();
        scrollPane.setPadding(new Insets(50,0,0,0));

        ObservableList<DatasetFuzzyLine> observableList = FXCollections.observableList(lines);
        methodCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, String>("instanceName"));
        classCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, String>("probability"));
        secCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, Double>("className"));
        appCol.setCellValueFactory(new PropertyValueFactory<DatasetFuzzyLine, Double>("applicationName"));
        table.setItems(observableList);

        table.getColumns().addAll(methodCol,secCol,appCol,classCol);
        table.getSortOrder().add(classCol);
        //System.out.println("pss"+table.getItems());
        VBox vBox=new VBox();
        Label label= LabelBuilder.create().text("Les instances de "+antipattern+" détectées").styleClass("labelStyleClass").build();
        label.setStyle("-fx-font-size:18; -fx-font-family: 'Museo Slab 500';");
        label.setPadding(new Insets(0,0,25,0));
        //  table.setPadding(new Insets(50,20,20,20));
        vBox.getChildren().addAll(label,table);
        vBox.translateXProperty().bind(scrollPane.widthProperty().subtract(vBox.widthProperty()).divide(2));
        vBox.setAlignment(Pos.CENTER);
        vBox.setMinWidth(800);
        vBox.setMaxWidth(900);
        vBox.setPrefWidth(800);

        scrollPane.setContent(vBox);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        WorkbenchView view = new WorkbenchView();
        view.setCenterNode(scrollPane);
        app.setWorkbench(view);
        app.clearGlobalActions();


    }
}
