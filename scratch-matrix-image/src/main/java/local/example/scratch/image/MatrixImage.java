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

package local.example.scratch.image;

import java.nio.ByteBuffer;
import java.util.Random;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.PixelFormat;
import javafx.scene.paint.Color;

public class MatrixImage {

    private final static int D = 3;
    private final int side;
    private final byte imageVector[];
    private final Canvas canvas;
    private final Random random;

    public MatrixImage(double width, double height) {
        this.side = (int) (height / 40);
        int size = D * side * side;
        this.imageVector = new byte[size];
        this.random = new Random();
        this.canvas = new Canvas(width / 2, height / 2);
        this.canvas.setTranslateX(width / 4);
        this.canvas.setTranslateY(height / 4);
        var graphicsContext = canvas.getGraphicsContext2D();
        this.drawCanvasWithScratchImages(graphicsContext, height, width, size);
        graphicsContext.applyEffect(
                new DropShadow(
                        D * side,
                        D * side,
                        D * side,
                        Color.grayRgb((int) (255 * random.nextDouble()))));
    }

    private void makeScratchImage(int size) {
    }

    private void drawCanvasWithScratchImages(
            GraphicsContext graphicsContext,
            double height,
            double width,
            int size) {
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
