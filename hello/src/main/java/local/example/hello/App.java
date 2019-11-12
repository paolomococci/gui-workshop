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
package local.example.hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * hello openjfx App
 */
public class App 
        extends Application {

    private static final double WIDTH = 400.0;
    private static final double HEIGHT = 200.0;

    private static Scene scene;

    @Override
    public void start(Stage stage) 
            throws IOException {
        scene = new Scene(
                loadFXML("view/home"), 
                WIDTH, 
                HEIGHT
        );
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxmlName) 
            throws IOException {
        scene.setRoot(loadFXML(fxmlName));
    }

    private static Parent loadFXML(String fxmlName) 
            throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource(fxmlName + ".fxml")
        );
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
