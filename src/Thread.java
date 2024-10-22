import java.awt.image.BufferedImage;

public class Thread extends java.lang.Thread {

    private String imageFileType;
    private String imageSaveLocation;
    private String textFilePath;

    public Thread(String[] args) {
        imageFileType = args[0];
        imageSaveLocation = args[1];
        textFilePath = args[2];
    }

    @Override
    public void run() {
        String data = FileReader.readFile(textFilePath);
        BufferedImage image = ImageCreator.createImage(data);
        ImageWriter.writeImage(image, imageFileType, imageSaveLocation, textFilePath);
    }
}