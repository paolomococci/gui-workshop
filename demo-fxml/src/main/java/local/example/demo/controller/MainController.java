/**
 *
 * Copyright 2019 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.demo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import local.example.demo.App;
import local.example.demo.alert.MenuItemAbout;

public class MainController {

    @FXML
    private VBox mainWindow;

    @FXML
    private MenuBar menuBar;

    @FXML
    private SplitPane mainSplitPane;
    @FXML
    private AnchorPane navBarAnchorPane;
    @FXML
    private Label navBarLabel;
    @FXML
    private AnchorPane mainViewAnchorPane;
    @FXML
    private Label mainViewLabel;
    @FXML
    private AnchorPane detailAnchorPane;
    @FXML
    private Label detailLabel;

    @FXML
    private HBox bottomBox;
    @FXML
    private Label leftStatusLabel;
    @FXML
    private Pane bottomPane;
    @FXML
    private Label rightStatusLabel;

    private App app;

    @FXML
    public void initialize() {

    }

    @FXML
    private void menuItemQuit() {
        System.exit(0);
    }
    
    @FXML
    private void menuItemAbout() {
        MenuItemAbout.showAlert();
    }

    public void setApp(App app) {
        this.app = app;
    }
}
