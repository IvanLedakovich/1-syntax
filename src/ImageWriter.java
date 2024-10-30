import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageWriter {

    public static void writeImage (BufferedImage image, String imageFileType, String imageSaveLocation, String textFilePath) {
        try {
            ImageIO.write(image, imageFileType, new File(imageSaveLocation + "\\" + textFilePath.substring(textFilePath.lastIndexOf("\\")+1) + "." + imageFileType));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
