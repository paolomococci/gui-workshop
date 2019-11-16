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
import java.security.SecureRandom;
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
    private final SecureRandom secureRandom;

    public MatrixImage(double width, double height) {
        this.side = (int) (height / 40);
        int size = D * side * side * side;
        this.imageVector = new byte[size];
        this.secureRandom = new SecureRandom();
        this.canvas = new Canvas(width / 2, height / 2);
        this.canvas.setTranslateX(width / 4);
        this.canvas.setTranslateY(height / 4);
        var graphicsContext = canvas.getGraphicsContext2D();
        this.drawCanvasWithScratchImages(graphicsContext, height, width);
        graphicsContext.applyEffect(
                new DropShadow(
                        D * side,
                        D * side,
                        D * side,
                        Color.grayRgb(secureRandom.nextInt(255))));
    }

    private void makeScratchImage() {
        int index = 0;
        for (int i = 0; i < side; i++) {
            int red = secureRandom.nextInt(255);
            for (int j = 0; j < side; j++) {
                int green = secureRandom.nextInt(255);
                for (int k = 0; k < 10; k++) {
                    int blue = secureRandom.nextInt(255);
                    imageVector[index] = (byte) red;
                    imageVector[index + 1] = (byte) green;
                    imageVector[index + 2] = (byte) blue;
                    index += D;
                }
            }
        }
    }

    private void drawCanvasWithScratchImages(
            GraphicsContext graphicsContext,
            double height,
            double width) {
        boolean visibility = true;
        var pixelWriter = graphicsContext.getPixelWriter();
        PixelFormat<ByteBuffer> pixelFormat = PixelFormat.getByteRgbInstance();
        for (int i = (int) height / 8; i < height * D / 8; i += side) {
            for (int j = (int) width / 8; j < width * D / 8; j += side) {
                if (visibility) {
                    this.makeScratchImage();
                    pixelWriter.setPixels(
                            j,
                            i,
                            side,
                            side,
                            pixelFormat,
                            imageVector,
                            0,
                            D * side
                    );
                }
                visibility = secureRandom.nextBoolean();
            }
            visibility = secureRandom.nextBoolean();
        }
    }

    public Canvas getCanvas() {
        return canvas;
    }
}
