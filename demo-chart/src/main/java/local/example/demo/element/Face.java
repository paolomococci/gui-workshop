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

package local.example.demo.element;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Face 
        extends Pane {

    Rectangle rectangleFace;

    public Face(double size) {
        rectangleFace = new Rectangle(size, size);
        getChildren().add(rectangleFace);
        var translatioOfTheZAxis = 0.0;
        var widthOfLine = 1.0;
        var colorOfGrid = Color.GRAY;
        for (int translationOfTheYAxis = 0;
                translationOfTheYAxis <= size;
                translationOfTheYAxis += size / 25) {
            var line = new Line(0, 0, size, 0);
            line.setStroke(colorOfGrid);
            line.setFill(colorOfGrid);
            line.setTranslateY(translationOfTheYAxis);
            line.setTranslateZ(translatioOfTheZAxis);
            line.setStrokeWidth(widthOfLine);
            getChildren().addAll(line);
        }
        for (int translationOfTheXAxis = 0; 
                translationOfTheXAxis <= size; 
                translationOfTheXAxis += size / 25) {
            var line = new Line(0, 0, 0, size);
            line.setStroke(colorOfGrid);
            line.setFill(colorOfGrid);
            line.setTranslateX(translationOfTheXAxis);
            line.setTranslateZ(translatioOfTheZAxis);
            line.setStrokeWidth(widthOfLine);
            getChildren().addAll(line);
        }
    }

    public void setFill(Paint paint) {
        rectangleFace.setFill(paint);
    }
}
