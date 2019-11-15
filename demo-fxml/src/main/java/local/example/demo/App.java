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

package local.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * OpenJFX App
 */
public class App 
        extends Application {
    
    private static final double WIDTH = 640.0;
    private static final double HEIGHT = 480.0;

    private static Scene scene;

    @Override
    public void start(Stage stage) 
            throws IOException {
        scene = new Scene(
                loadFXML("view/main"), 
                WIDTH, 
                HEIGHT
        );
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) 
            throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) 
            throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
