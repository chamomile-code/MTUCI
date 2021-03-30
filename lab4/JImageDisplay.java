package lab4;


import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

class JImageDisplay extends JComponent
{
    private BufferedImage bImage;

    public JImageDisplay(int width, int height) {
        bImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension);
    }

    @Override
    public void paintComponent(Graphics h) {
        super.paintComponent(h);

        h.drawImage(bImage, 0, 0, bImage.getWidth(), bImage.getHeight(), null);
    }


    public void clearImage() {
        int[] emptyArray = new int[getWidth() * getHeight()];

        bImage.setRGB(0, 0, getWidth(), getHeight(), emptyArray, 0, 1);
    }


    public void drawPixel(int x, int y, int Color) {
        bImage.setRGB(x, y, Color);
    }
}