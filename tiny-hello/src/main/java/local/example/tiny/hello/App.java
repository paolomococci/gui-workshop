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

package local.example.tiny.hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * tiny hello openjfx App
 */
public class App
        extends Application {

    private static final double WIDTH = 400.0;
    private static final double HEIGHT = 200.0;

    @Override
    public void start(Stage stage) {
        Button button = new Button("get hello");
        button.setOnAction(click -> {
                    Alert alert = new Alert(
                            AlertType.INFORMATION,
                            "Hello from openjfx 11!");
                    alert.showAndWait();
                }
        );
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        stage.setScene(
                new Scene(
                        stackPane,
                        WIDTH,
                        HEIGHT
                )
        );
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
