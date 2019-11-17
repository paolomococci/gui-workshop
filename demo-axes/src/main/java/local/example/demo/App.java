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
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 * OpenJFX App
 */
public class App 
        extends Application {
    
    int sizeOfChart = 400;

    private static final double WIDTH = 900.0;
    private static final double HEIGHT = 900.0;
    
    private double mouseInteractionPositionAbscisse;
    private double mouseInteractionPositionOrdinate;
    private double mousePreviousPositionAbscisse;
    private double mousePreviousPositionOrdinate;
    private final Rotate rotateAbscisse;
    private final Rotate rotateOrdinate;

    public App() {
        this.rotateOrdinate = new Rotate(-45, Rotate.Y_AXIS);
        this.rotateAbscisse = new Rotate(15, Rotate.X_AXIS);
    }

    @Override
    public void start(Stage stage) {
        var scene = new Scene(new StackPane(new Label("only a demo")), WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.setTitle("basic 3D graph");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
