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

package local.example.scratch;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import local.example.scratch.image.MatrixImage;

/**
 * scratch matrix image App
 */
public class App
        extends Application {

    private static final double WIDTH = 650.0;
    private static final double HEIGHT = 480.0;

    @Override
    public void start(Stage stage) {
        var group = new Group();
        var matrixImage = new MatrixImage(WIDTH, HEIGHT);
        group.getChildren().add(matrixImage.getCanvas());
        var scene = new Scene(group, WIDTH, HEIGHT);
        stage.setTitle("pseudo-random pixel matrix");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
